package Java_8_Features.StreamAPI;

import java.time.LocalDate;

public class Employee {
    private int empno;
    private String ename;
    private LocalDate doj;
    private double basic;

    public int getEmpno() {
        return empno;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public LocalDate getDoj() {
        return doj;
    }

    public void setDoj(LocalDate doj) {
        this.doj = doj;
    }

    public double getBasic() {
        return basic;
    }

    public void setBasic(double basic) {
        this.basic = basic;
    }

    public Employee(int empno, String ename, LocalDate doj, double basic) {
        this.empno = empno;
        this.ename = ename;
        this.doj = doj;
        this.basic = basic;
    }
}
