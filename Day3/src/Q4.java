import java.util.Scanner;

class Account {
    int acc_no;
    float balance;

    public void input(Scanner sc) {
        System.out.print("Enter account number: ");
        acc_no = sc.nextInt();

        System.out.print("Enter account balance: ");
        balance = sc.nextFloat();
    }

    public void disp() {
        System.out.println("Account number: " + acc_no);
        System.out.println("Account balance: " + balance);
    }
}

class Person extends Account {
    String name;
    int aadhar_no;

    @Override
    public void input(Scanner sc) {
        super.input(sc);

        System.out.print("Enter name: ");
        sc.nextLine();
        name = sc.nextLine();

        System.out.print("Enter aadhar number: ");
        aadhar_no = sc.nextInt();
    }

    @Override
    public void disp() {
        super.disp();
        System.out.println("Name: " + name);
        System.out.println("Aadhar number: " + aadhar_no);
        System.out.println();
    }
}

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Person[] p = new Person[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("\nEnter details of person " + (i + 1));
            p[i] = new Person();
            p[i].input(sc);
        }

        System.out.println("\n--- Person Details ---");
        for (int i = 0; i < 3; i++) {
            p[i].disp();
        }

        sc.close();
    }
}
