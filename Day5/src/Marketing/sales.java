package Marketing;
import General.employee;

public class sales extends employee {
    public sales(int empid, String empname) {
        super(empid, empname);
    }

    public float tallowance(float basic) {
        float earnings = super.earnings(basic);
        float allowance = 0.05f * earnings;

        return allowance;
    }
}
