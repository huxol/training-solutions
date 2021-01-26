package exceptionclass.bankotherexceptions;

import exceptionclass.bank.Account;
import exceptionclass.bank.Bank;
import exceptionclass.bank.ErrorCode;
import exceptionclass.bank.InvalidBankOperationException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BankTest {

    private double initialBalance;
    private List<exceptionclass.bank.Account> accounts;
    private exceptionclass.bank.Bank bank;

    @BeforeEach
    public void createAccountList() {
        initialBalance = 100;
        accounts = new ArrayList<>();
        accounts.add(new exceptionclass.bank.Account("acc1",initialBalance, 0));
        accounts.add(new exceptionclass.bank.Account("acc2", initialBalance, 0));
        accounts.add(new exceptionclass.bank.Account("acc3", initialBalance, 0));
        accounts.add(new exceptionclass.bank.Account("acc4", initialBalance, 0));

        bank = new exceptionclass.bank.Bank(accounts);
    }

    @Test
    public void constructorNullParamShouldThrowException() {
        assertThrows(IllegalArgumentException.class, () -> new Bank(null));
    }

    @Test
    public void paymentUnknownAccountNumberShouldThrowException() {
        String accountNumber = "unknownAccountNumber";
        exceptionclass.bank.InvalidBankOperationException ex = assertThrows(exceptionclass.bank.InvalidBankOperationException.class, () -> bank.payment(accountNumber, 10));
        assertEquals(ErrorCode.INVALID_ACCOUNTNUMBER, ex.getErrorCode());

    }

    @Test
    public void paymentShouldSubtractBalance() {
        String accountNumber = "acc2";
        double amount = 10;

        bank.payment(accountNumber, amount);
        for (exceptionclass.bank.Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                assertEquals(initialBalance - amount, account.getBalance());
            } else {
                assertEquals(initialBalance, account.getBalance());
            }
        }
    }

    @Test
    public void depositUnknownAccountNumberShouldThowException() {
        String accountNumber = "unknownaccountNumber";

        exceptionclass.bank.InvalidBankOperationException ex = assertThrows(InvalidBankOperationException.class, () -> bank.deposit(accountNumber, 10));
        assertEquals(ErrorCode.INVALID_ACCOUNTNUMBER, ex.getErrorCode());

    }

    @Test
    public void depositShouldModifyBalance() {
        String accountNumber = "acc2";
        double amount = 10;

        bank.deposit(accountNumber, amount);
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                assertEquals(initialBalance + amount,account.getBalance());
            } else {
                assertEquals(initialBalance,account.getBalance());
            }
        }
    }
}
