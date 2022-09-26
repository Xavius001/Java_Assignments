class Student {
    int id;
    String name;
    public Student() {
        this.id=0;
        this.name="John Doe";
    }
    public Student(Student one) {
        this.id=one.id;
        this.name=one.name;
    }
    public Student(int id, String name) {
        this.id=id;
        this.name=name;
    }
    public void output() {
        System.out.println("ID: "+id+", Name: "+name);
    }
}

class Junior extends Student {
    String gradeLevel;
    public Junior() {
        this.gradeLevel="Junior";
    }
    public Junior(int id, String name){
        this.id=id;
        this.name=name;
        this.gradeLevel="Junior";
    }
    public void output() {
        System.out.println("ID: "+this.id+", Name: "+this.name+", Grade: "+this.gradeLevel);
    }
}


public class Constructor {
    public static void main(String[] args) {
        Student S = new Student();
        S.output();
        Student SJ = new Junior();
        SJ.output();
        Junior J = new Junior();
        J.output();
    }
}
