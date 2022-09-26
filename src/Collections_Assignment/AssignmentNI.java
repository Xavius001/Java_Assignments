package Collections_Assignment;

class Project {
    private int projectId, durationInDays;
    private String projectDesc;
    private double expenses;

    public Project(int projectId,  String projectDesc, int durationInDays, double expenses) {
        this.projectId = projectId;
        this.projectDesc = projectDesc;
        this.durationInDays = durationInDays;
        this.expenses = expenses;
    }

    public double Calculate() {
        this.expenses = durationInDays/30*100000;
        return this.expenses;
    }

    public String display() {
        String str = String.format("%s, %s, %s, %s", this.projectId,
                this.projectDesc,this.durationInDays,Calculate());
        return str;
    }
}

class Contact {
    private String name, company, title, mobile, alternateMobile, email;

    public Contact(String name, String company, String title, String mobile, String alternateMobile, String email) {
        this.name = name;
        this.company = company;
        this.title = title;
        this.mobile = mobile;
        this.alternateMobile = alternateMobile;
        this.email = email;
    }

    public String display() {
        String str = String.format("%s, %s, %s, %s, %s, %s", this.name,this.company,
                this.title,this.mobile, this.alternateMobile, this.email);
        return str;
    }
}

public class AssignmentNI {
    public static void main(String[] args) {
        Project p = new Project(1, "Yeet", 120, 100);
        System.out.println(p.display());
        Contact c = new Contact("Xavier","Techwave","Intern","713-XXX-XXXX","832-XXX-XXXX", "xavier@techwave.net");
        System.out.println(c.display());
    }
}
