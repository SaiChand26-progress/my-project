package ExceptionHandling;

class InvalidAmountException extends Exception {
    public InvalidAmountException(String message) {
        super(message);
    }
}

public class CustomExceptionExample {

    static void withdraw(int amount) throws InvalidAmountException {
        if (amount > 5000)
            throw new InvalidAmountException("Limit exceeded");
        else
            System.out.println("Withdrawal successful");
    }

    public static void main(String[] args) throws Exception {
        withdraw(6000);
    }
}