package CollectionExample2;

public class Employee implements Comparable<Employee>{
    private int empno;
    private double basic;
    private String ename;

    public Employee(int empno, String ename, double basic) {
        this.empno = empno;
        this.basic = basic;
        this.ename = ename;
    }

    public String getEname() {
        return ename;
    }

    public double getBasic() {
        return basic;
    }

    public int getEmpno() {
        return empno;
    }

    @Override
    public int compareTo(Employee o) {
        if (this.basic > o.basic) return 1;
        else if (this.basic < o.basic) return -1;
        else return 0;
    }
}
