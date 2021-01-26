package exceptionclass.bankotherexceptions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {

    @Test
    public void constructorShouldThrowException() {
        String accountNumber = null;
        assertThrows(IllegalArgumentException.class, () -> new Account("", 0, 0));
    }

    @Test
    public void constructorShouldInitialize() {
        String accountNumber = "11112";
        double balance = 1.2;
        double maxSubtract = 100000;

        Account account = new Account(accountNumber, balance, maxSubtract);

        assertEquals(accountNumber, account.getAccountNumber());
        assertEquals(balance, account.getBalance());
        assertEquals(maxSubtract, account.getMaxSubtract());
    }

    @Test
    public void setMaxSubtractShouldThrowException() {
        double maxSubtract = -10;
        Account account = new Account("a", 0, maxSubtract);
        assertThrows(InvalidAmountBankOperationException.class, () -> account.setMaxSubtract(maxSubtract));
    }

    @Test
    public void setMaxSubtractShouldModify() {
        double maxSubtract = 120000;
        Account account = new Account("a", 0, maxSubtract);

        account.setMaxSubtract(maxSubtract);

        assertEquals(maxSubtract, account.getMaxSubtract());
    }

    @Test
    public void subtractInvalidAmountShouldThrowException() {
        double amount = -10;
        Account account = new Account("a", 100, amount);
        assertThrows(InvalidAmountBankOperationException.class, () -> account.subtract(amount));
    }

    @Test
    public void subtractLowBalanceShouldThrowException() {
        double amount = 10;
        Account account = new Account("a", 5, amount);

        assertThrows(LowBalanceBankOperationException.class, () -> account.subtract(amount));
    }

    @Test
    public void subtractShouldCorrectReturn() {
        double balance = 300;
        double amount = 10;

        Account account = new Account("a", balance, amount);

        assertEquals(290, account.subtract(amount));
    }

    @Test
    public void subtractShouldModifyBalance() {
        double balance = 300;
        double amount = 10;

        Account account = new Account("a", balance, amount);

        account.subtract(amount);
        assertEquals(290, account.getBalance());
    }


    @Test
    public void depositShouldThrowException() throws Exception {
        double amount = -10;
        Account account = new Account("a", 100, amount);

        assertThrows(InvalidAmountBankOperationException.class, () -> account.deposit(amount));
    }

    @Test
    public void depositShouldCorrectReturn() throws Exception {
        double balance = 300;
        double amount = 10;

        Account account = new Account("a", balance, amount);

        assertEquals(310, account.deposit(amount));
    }

    @Test
    public void depositShouldModifyBalance() throws Exception {
        double balance = 300;
        double amount = 10;

        Account account = new Account("a", balance, amount);

        account.deposit(amount);
        assertEquals(310, account.getBalance());
    }
}
