package exceptionclass.bankotherexceptions;

public class InvalidAmountBankOperationException extends InvalidBankOperationException {
    public InvalidAmountBankOperationException(){
    }

    public InvalidAmountBankOperationException(String message) {
        super(message);
    }
}
