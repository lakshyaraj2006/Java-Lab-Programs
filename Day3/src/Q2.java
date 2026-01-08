import java.util.Scanner;

class Plate {
    public Plate(float length, float width) {
        System.out.println("I am the constructor of Plate");
        System.out.printf("Dimensions: Length=%.2f, Width=%.2f\n", length, width);
        System.out.println("");
    }
}

class Box extends Plate {
    public Box(float length, float width, float height) {
        super(length, width);
        System.out.println("I am the constructor of Box");
        System.out.printf("Dimensions: Length=%.2f, Width=%.2f, Height=%.2f\n", length, width, height);
        System.out.println("");
    }
}

class WoodBox extends Box {
    public WoodBox(float length, float width, float height, float thick) {
        super(length, width, height);
        System.out.println("I am the constructor of WoodBox");
        System.out.printf("Dimensions: Length=%.2f, Width=%.2f, Height=%.2f, Thick=%.2f\n", length, width, height, thick);
    }
}

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        float length = sc.nextFloat();

        System.out.print("Enter width: ");
        float width = sc.nextFloat();

        System.out.print("Enter height: ");
        float height = sc.nextFloat();

        System.out.print("Enter thickness: ");
        float thick = sc.nextFloat();

        System.out.println("");

        WoodBox wb = new WoodBox(length, width, height, thick);
    }
}
