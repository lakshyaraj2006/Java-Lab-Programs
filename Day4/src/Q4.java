import java.util.Scanner;

interface Employee {
    default void getDetails() {};
}

interface MyManager extends Employee {
    default void getDeptDetails() {};
}

class Head implements MyManager {

    int empId;
    String empName;
    int deptId;
    String deptName;

    Scanner sc = new Scanner(System.in);

    @Override
    public void getDetails() {
        System.out.print("Enter employee id: ");
        empId = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter employee name: ");
        empName = sc.nextLine();
    }

    @Override
    public void getDeptDetails() {
        System.out.print("Enter department id: ");
        deptId = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter department name: ");
        deptName = sc.nextLine();
    }

    void display() {
        System.out.println("Employee id - " + empId);
        System.out.println("Employee name - " + empName);
        System.out.println("Department id - " + deptId);
        System.out.println("Department name - " + deptName);
    }
}

public class Q4 {
    public static void main(String[] args) {
        Head h = new Head();

        h.getDetails();
        h.getDeptDetails();
        h.display();
    }
}
