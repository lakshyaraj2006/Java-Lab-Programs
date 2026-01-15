import java.util.Scanner;

abstract class student {
    int roll_no;
    long reg_no;

    void getinput(Scanner sc) {
        System.out.print("Enter student roll no: ");
        this.roll_no = sc.nextInt();

        System.out.print("Enter student registration no: ");
        this.reg_no = sc.nextLong();
    }

    abstract void course();
}

class kiitian extends student {
    @Override
    void course() {
        System.out.println("Course - B.Tech. (Computer Science & Engg)");
    }

    void display() {
        System.out.println("Rollno - " + roll_no);
        System.out.println("Registration no - " + reg_no);
        this.course();
    }
}

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        kiitian k = new kiitian();
        k.getinput(sc);

        k.display();
    }
}
