import java.util.Scanner;

class Box {
    float length;
    float width;
    float height;

    public double volume() {
        return length * width * height;
    }
}

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Box box = new Box();

        System.out.print("Enter box length: ");
        box.length = sc.nextFloat();

        System.out.print("Enter box width: ");
        box.width = sc.nextFloat();

        System.out.print("Enter box height: ");
        box.height = sc.nextFloat();

        System.out.printf("Volume = %.2f cubic units", box.volume());
    }
}