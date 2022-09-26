interface IPayable {
    double calculate();
    String display();
}

class Staff {
    private String StaffID, Staffname, Gender;

    public Staff(String StaffID, String Staffname, String Gender) {
        this.StaffID = StaffID;
        this.Staffname = Staffname;
        this.Gender = Gender;
    }

    public String getStaffID() {
        return StaffID;
    }

    public String getStaffname() {
        return Staffname;
    }

    public String getGender() {
        return Gender;
    }
}

class Admin extends Staff implements IPayable {
    private String Designation;
    private int Basic;

    public Admin(String StaffID, String Staffname, String Gender, String Designation, int Basic) {
        super(StaffID, Staffname, Gender);
        this.Designation = Designation;
        this.Basic = Basic;
    }

    @Override
    public double calculate() {
        double HRA = this.Basic * 0.1;
        double DA = this.Basic * 0.4;
        double Gross = this.Basic + HRA + DA;
        return Gross;
    }

    @Override
    public String display() {
        String display=super.getStaffID()+" ";
        display += super.getStaffname()+" ";
        display += super.getGender()+" ";
        display += this.Designation+" ";
        display += this.Basic+" ";
        display += calculate();
        return display;
    }
}

class TeachingStaff extends Staff implements IPayable {
    private String Subject, Exp;
    private int Basic, TeachingAllowance;

    public TeachingStaff(String StaffID, String Staffname, String Gender, String Subject, String Exp, int Basic, int TeachingAllowance) {
        super(StaffID, Staffname, Gender);
        this.Subject = Subject;
        this.Exp = Exp;
        this.Basic = Basic;
        this.TeachingAllowance = TeachingAllowance;
    }

    @Override
    public double calculate() {
        double HRA = this.Basic * 0.15;
        double DA = this.Basic * 0.6;
        double Gross = this.Basic + HRA + DA + this.TeachingAllowance;
        return Gross;
    }

    @Override
    public String display() {
        String display=super.getStaffID()+" ";
        display += super.getStaffname()+" ";
        display += super.getGender()+" ";
        display += this.Subject+" ";
        display += this.Exp+" ";
        display += this.TeachingAllowance+" ";
        display += calculate();
        return display;
    }
}

class HOD extends TeachingStaff {
    private String Deptid, Deptname;

    public HOD(String StaffID, String Staffname, String Gender, String Subject, String Exp, int Basic, int TeachingAllowance, String Deptid, String Deptname) {
        super(StaffID, Staffname, Gender, Subject, Exp, Basic, TeachingAllowance);
        this.Deptid = Deptid;
        this.Deptname = Deptname;
    }

    @Override
    public String display() {
        String display = super.display()+" ";
        display += this.Deptid+" ";
        display += this.Deptname;
        return display;
    }
}

public class JavaPracticalPaper {
    public static void main(String[] args) {
        //inheritance problem
        Staff a = new Admin("1", "Xavier", "Male", "Trainee", 13);
        Staff t = new TeachingStaff("2", "Xavier", "Male", "Computer Science", "5 years", 13, 15);
        Staff h = new HOD("3", "Xavier", "Male", "Computer Science", "5 years", 13, 15, "23", "College of Sciences and Technology");

        System.out.println("Part 1");
        System.out.println(((Admin) a).display());
        System.out.println(((TeachingStaff) t).display());
        System.out.println(((HOD) h).display());
        System.out.println();

        System.out.println("Part 2");
        //array problem
        int[] arr = {10,20,25,20,10,25,10,20,25,10};
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        //sorts the array
        for(int i = 0; i < arr.length-1; i++) {
            int temp = 0;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        //it counts each number and displays it only once
        for(int i = 0; i < arr.length; i++) {
            int count = 0;
            for(int j = 0; j < arr.length; j++) {
                if(arr[i]==arr[j]) {
                    count++;
                }
            }
            System.out.println(arr[i]+"-"+count);
            i += count; //skips duplicates
        }
    }
}
