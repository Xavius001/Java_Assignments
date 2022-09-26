package CollectionExample3;

import java.time.LocalDate;

public class Employee {
    private int empno;
    private String name;
    private double basic;

    private LocalDate doj;

    public Employee(int empno, String name, double basic, LocalDate doj) {
        this.empno = empno;
        this.name = name;
        this.basic = basic;
        this.doj = doj;
    }

    public int getEmpno() {
        return empno;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBasic() {
        return basic;
    }

    public void setBasic(double basic) {
        this.basic = basic;
    }

    public LocalDate getDoj() {
        return doj;
    }

    public void setDoj(LocalDate doj) {
        this.doj = doj;
    }
}
