import java.util.Scanner;

class Rectangle {
    float length;
    float breadth;

    public void read() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        this.length = sc.nextFloat();

        System.out.print("Enter breadth: ");
        this.breadth = sc.nextFloat();
    }

    public float[] calculate() {
        float perimeter = 2f * (this.length + this.breadth);
        float area = this.length * this.breadth;

        return new float[]{perimeter, area};
    }

    public void display() {
        float[] result = this.calculate();

        System.out.printf("Perimeter = %.2f units\n", result[0]);
        System.out.printf("Area = %.2f sq. units", result[1]);
    }
}

public class Q4 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();

        rectangle.read();
        rectangle.display();
    }
}