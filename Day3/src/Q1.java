import java.util.Scanner;

class Box_2D {
    float length;
    float width;

    public Box_2D(float length, float width) {
        this.length = length;
        this.width = width;
    }

    public float calcCost() {
        return 40f * (length * width);
    }
}

class Box_3D extends Box_2D {
    float height;

    public Box_3D(float length, float width, float height) {
        super(length, width);
        this.height = height;
    }

    @Override
    public float calcCost() {
        return 60f * (length * width * height);
    }
}

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of 2d box: ");
        float box2d_length = sc.nextFloat();
        System.out.print("Enter width of 2d box: ");
        float box2d_width = sc.nextFloat();
        Box_2D box2d = new Box_2D(box2d_length, box2d_width);
        System.out.println("");

        System.out.print("Enter length of 3d box: ");
        float box3d_length = sc.nextFloat();
        System.out.print("Enter width of 3d box: ");
        float box3d_width = sc.nextFloat();
        System.out.print("Enter height of 3d box: ");
        float box3d_height = sc.nextFloat();
        Box_3D box3d = new Box_3D(box3d_length, box3d_width, box3d_height);
        System.out.println("");

        System.out.printf("The cost of plastic required for 2D box is ₹%.2f\n", box2d.calcCost());
        System.out.printf("The cost of plastic required for 3D box is ₹%.2f", box3d.calcCost());
    }
}
