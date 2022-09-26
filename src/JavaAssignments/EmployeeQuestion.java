import java.util.*;

class Employee {
    private int empNo;
    private String eName;
    public void Accept(){
        Scanner in = new Scanner(System.in);
        System.out.println("Employee Number?");
        this.empNo = in.nextInt();
        System.out.println("Employee Name?");
        this.eName = in.next();
    }
    public void Display(){
        System.out.println("Employee Number: "+empNo);
        System.out.println("Employee Name: "+eName);
    }
}

class Permanent extends Employee {
    private double basic;
    public void Accept() {
        super.Accept();
        Scanner in = new Scanner(System.in);
        System.out.println("Basic Salary?");
        this.basic=in.nextDouble();
    }
    public void Calculate() {
        double hra = basic * 0.12;
        double Da = basic * 0.5;
        double Gross = hra + Da + basic;
        System.out.println("Hra: "+hra);
        System.out.println("Da: "+Da);
        System.out.println("Gross: "+Gross);
    }
    public void Display() {
        super.Display();
        System.out.println("Basic: "+basic);
        Calculate();
    }
}

class Contract extends Employee {
    private double renum;
    public void Accept() {
        super.Accept();
        Scanner in = new Scanner(System.in);
        System.out.println("Remuneration?");
        this.renum=in.nextInt();
    }
    public void Calculate() {
        double tax = renum*0.05;
        this.renum=renum-tax;
        System.out.println("Remuneration after Tax: "+ this.renum);
    }
    public void Display() {
        super.Display();
        System.out.println("Renum: "+renum);
        Calculate();
    }
}

public class EmployeeQuestion {
    public static void main(String[] args) {
        Permanent P = new Permanent();
        P.Accept();
        System.out.println("Permanent Employee");
        P.Display();

        System.out.println();

        System.out.println("Contract Employee");
        Contract C = new Contract();
        C.Accept();
        C.Display();
    }
}
