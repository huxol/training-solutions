package exceptionclass.bank;

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
        Account account = new Account("a",0, maxSubtract);
        InvalidBankOperationException ex = assertThrows(InvalidBankOperationException.class, () -> account.setMaxSubtract(maxSubtract));
        assertEquals(ErrorCode.INVALID_AMOUNT, ex.getErrorCode());
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

        Account account = new Account("a", 0, amount);
        InvalidBankOperationException ex = assertThrows(InvalidBankOperationException.class, () -> account.subtract(amount));
        assertEquals(ErrorCode.INVALID_AMOUNT, ex.getErrorCode());

    }

    @Test
    public void subtractLowBalanceShouldThrowException() {
        double amount = 10;

        Account account = new Account("a", 5, amount);
        InvalidBankOperationException ex = assertThrows(InvalidBankOperationException.class, () -> account.subtract(amount));
        assertEquals(ErrorCode.LOW_BALANCE, ex.getErrorCode());

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
    public void depositShouldThrowException() {
        double amount = -10;

        Account account = new Account("a", 0, amount);
        InvalidBankOperationException ex = assertThrows(InvalidBankOperationException.class, () -> account.deposit(amount));
        assertEquals(ErrorCode.INVALID_AMOUNT, ex.getErrorCode());


    }

    @Test
    public void depositShouldCorrectReturn() {
        double balance = 300;
        double amount = 10;

        Account account = new Account("a", balance, amount);

        assertEquals(310, account.deposit(amount));

    }

    @Test
    public void depositShouldModifyBalance() {
        double balance = 300;
        double amount = 10;

        Account account = new Account("a", balance, amount);

        account.deposit(amount);
        assertEquals(310, account.getBalance());
    }
}
