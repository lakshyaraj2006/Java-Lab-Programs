import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your roll number: ");
        String roll = sc.nextLine();

        System.out.print("Enter your section: ");
        String section = sc.nextLine();

        System.out.print("Enter your branch: ");
        String branch = sc.nextLine();

        System.out.println("Name: " + name);
        System.out.println("Roll number: " + roll);
        System.out.println("Section: " + section);
        System.out.println("Branch: " + branch);
    }
}
