package General;

public class employee {
    protected int empid;
    private String ename;

    public employee(int empid, String empname) {
        this.empid = empid;
        this.ename = empname;
    }

    public float earnings(float basic) {
        float da = 0.80f * basic;
        float hra = 0.15f * basic;

        return basic + da + hra;
    }
}
