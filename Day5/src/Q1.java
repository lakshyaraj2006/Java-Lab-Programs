import java.util.Scanner;
import General.employee;
import Marketing.sales;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int empid;
        String empname;
        float basic;

        System.out.print("Enter employee id: ");
        empid = sc.nextInt();

        System.out.print("Enter employee name: ");
        empname = sc.next();

        System.out.print("Enter employee basic salary: ");
        basic = sc.nextFloat();

        sales s = new sales(empid, empname);

        System.out.printf("Employee id of the employee is %d\n", empid);
        System.out.printf("The total earning is ₹%.1f%n", s.earnings(basic));

    }
}

