import java.util.Scanner;

interface Salary {
    default void earnings() {};
    default void deductions() {};
    default void bonus() {};
}

class Manager implements Salary {
    double basic;

    Manager(double basic) {
        this.basic = basic;
    }

    @Override
    public void earnings() {
        double da = 0.80 * this.basic;
        double hra = 0.15 * this.basic;
        double totalEarnings = this.basic + da + hra;

        System.out.println("Earnings: " + totalEarnings);
    }

    @Override
    public void deductions() {
        double pf = 0.12 * this.basic;

        System.out.println("Deductions (PF): " + pf);
    }
}

class Substaff extends Manager {
    Substaff(double basic) {
        super(basic);
    }

    @Override
    public void bonus() {
        double bonusAmount = 0.50 * basic;

        System.out.println("Bonus: " + bonusAmount);
    }
}

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter basic salary: ");
        double basicSalary = sc.nextDouble();

        Substaff s = new Substaff(basicSalary);

        s.earnings();
        s.deductions();
        s.bonus();

        sc.close();
    }
}
