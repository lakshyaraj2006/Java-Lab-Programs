class Subtraction {

    void subtract(int a, int b) {
        System.out.println("Subtraction of two integers: " + (a - b));
    }

    void subtract(int a, int b, int c) {
        System.out.println("Subtraction of three integers: " + (a - b - c));
    }

    void subtract(double a, double b) {
        System.out.println("Subtraction of two double values: " + (a - b));
    }
}

public class Q6 {
    public static void main(String[] args) {

        Subtraction obj = new Subtraction();

        obj.subtract(20, 10);
        obj.subtract(50, 20, 10);
        obj.subtract(25.5, 10.2);
    }
}
