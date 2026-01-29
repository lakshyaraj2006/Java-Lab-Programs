import java.util.Scanner;

class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

public class Q3 {
    public static void processInput(int number) throws NegativeNumberException {
        if (number >= 0) {
            System.out.printf("Doubled value: %d", number*2);
        } else {
            throw new NegativeNumberException("number should be positive");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;

        System.out.print("Enter a number: ");
        number = sc.nextInt();

        try {
            processInput(number);
        } catch (NegativeNumberException e) {
            System.out.println("Caught the exception");
            System.out.println("Exception occurred: " + e.toString());
        }
    }
}
