import java.util.Scanner;

class HrsException extends Exception {
    public HrsException(String message) {
        super(message);
    }
}

class MinException extends Exception {
    public MinException(String message) {
        super(message);
    }
}

class SecException extends Exception {
    public SecException(String message) {
        super(message);
    }
}

class Time {
    int hours;
    int minutes;
    int seconds;

    public void takeUserInput() throws HrsException, MinException, SecException {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter hours: ");
        int enteredHrs = sc.nextInt();

        if (enteredHrs > 0 && enteredHrs <= 24) {
            this.hours = enteredHrs;
        } else {
            throw new HrsException("Hours must be between 0 & 24");
        }

        System.out.print("Enter minutes: ");
        int enteredMin = sc.nextInt();

        if (enteredMin > 0 && enteredMin <= 60) {
            this.minutes = enteredMin;
        } else {
            throw new HrsException("Minutes must be between 0 & 60");
        }

        System.out.print("Enter seconds: ");
        int enteredSec = sc.nextInt();

        if (enteredSec > 0 && enteredSec <= 60) {
            this.seconds = enteredSec;
        } else {
            throw new HrsException("Seconds must be between 0 & 60");
        }
    }
}

public class Q4 {
    public static void main(String[] args)  {
        try {
            Time time = new Time();
            time.takeUserInput();

            System.out.println("Correct Time-> " + time.hours + ":" + time.minutes + ":" + time.seconds);
        } catch (HrsException | MinException | SecException e) {
            System.out.println("Caught the exception");
            System.out.println("Exception occurred: " + e.toString());
        }
    }
}
