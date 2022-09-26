
class Contact {
    private String contactPerson, mobile, email;
    public Contact(String contactPerson, String mobile, String email) {
        this.contactPerson = contactPerson;
        this.mobile = mobile;
        this.email = email;
    }
    public String Display() {
        String display = "Contact Person: "+contactPerson+"\nMobile: "+mobile+"\nEmail: "+email;
        return display;
    }
}

class ProfessionalContact extends Contact {
    private String companyName;
    private String website;
    private String department;
    private String city;
    private String country;
    private String address;
    private String pincode;
    public ProfessionalContact(String contactPerson, String mobile, String email, String companyName, String website, String department, String city, String country, String address, String pincode) {
        super(contactPerson, mobile, email);
        this.companyName = companyName;
        this.website = website;
        this.department = department;
        this.city = city;
        this.country = country;
        this.address = address;
        this.pincode = pincode;
    }
    public String Display() {
        String display = "\nCompany Name: "+companyName+"\nWebsite:  "+website+"\nDepartment: "+department
                +"\nCity: "+city+"\nCountry:  "+country+"\nAddress: "+address+"\nPincode: "+pincode;
        return super.Display()+display;
    }
}

class PersonalContact extends Contact {
    private String dateOfBirth, anniversaryDate, address;
    public PersonalContact(String contactPerson, String mobile, String email, String dateOfBirth, String anniversaryDate, String address) {
        super(contactPerson, mobile, email);
        this.dateOfBirth = dateOfBirth;
        this.anniversaryDate = anniversaryDate;
        this.address = address;
    }
    public String Display() {
        String display = "\nDate of Birth:  "+dateOfBirth+"\nAnniversary Date: "+anniversaryDate+"\nAddress: "+address;
        return super.Display()+display;
    }
}

public class Assignment_III {
    public static void main(String[] args) {
        Contact c = new ProfessionalContact("Xavier", "713-XXX-XXX", "xavier@techwave.net",
                "Techwave", "www.techwave.net", "Enterprise Digital Services",
                "Houston", "USA", "713 Wendys Chicken Drive", "713713");

        System.out.println("Professional Contact");
        System.out.println(c.Display());

        System.out.println();

        Contact c2 = new PersonalContact("Xavier","713-XXX-XXXX","xavier@chickensandwich.com",
                "12/21/1998","06/08/2022","713 Wendys Chicken Boulevard");

        System.out.println("Personal Contact");
        System.out.println(c2.Display());
    }
}
