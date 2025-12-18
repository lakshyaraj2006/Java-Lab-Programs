import java.util.Scanner;

class MyRectangle {
    float length;
    float breadth;

    public MyRectangle() {
        this.length = 0;
        this.breadth = 0;
    }

    public MyRectangle(float length, float breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void calculateArea() {
        System.out.printf("Area of the rectangle = %.2f sq. units", this.length * this.breadth);
    }
}

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Constructor called without parameters
        // MyRectangle rectangle = new MyRectangle();
        // rectangle.calculateArea();

        // Constructor called with parameters
        System.out.print("Enter length of the rectangle: ");
        float length = sc.nextFloat();

        System.out.print("Enter breadth of the rectangle: ");
        float breadth = sc.nextFloat();
        MyRectangle rectangle = new MyRectangle(length, breadth);
        rectangle.calculateArea();

    }
}
