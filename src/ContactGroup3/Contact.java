package ContactGroup3;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;

import static java.time.LocalTime.parse;

public class Contact {
    private String name, company, title, mobile, alternateMobile, email;
    private LocalDate dateCreated;

    //constructor with parameters
    public Contact(String name, String company, String title, String mobile, String alternateMobile, String email, LocalDate dateCreated) {
        this.name = name;
        this.company = company;
        this.title = title;
        this.mobile = mobile;
        this.alternateMobile = alternateMobile;
        this.email = email;
        this.dateCreated = dateCreated;
    }


    //getter and setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getAlternateMobile() {
        return alternateMobile;
    }

    public void setAlternateMobile(String alternateMobile) {
        this.alternateMobile = alternateMobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDate dateCreated) {
        this.dateCreated = dateCreated;
    }

    public static Contact CreateContact(String detail) {
        String[] details = detail.split(","); //splits detail into an array of 7 strings
        DateTimeFormatter D = DateTimeFormatter.ofPattern("dd-MM-yyyy"); //format for the 7th string
        //the 7th string is formatted into a localdate variable, each index is passed as a parameter
        Contact c = new Contact(details[0], details[1], details[2], details[3], details[4] ,details[5], LocalDate.parse(details[6], D));
        return c; //new contact is created
    }

    public static void display(List<Contact> Contact) {
        Contact.stream().forEach(i -> System.out.println(i.getName() + " "+
                i.getCompany() + " "+i.getTitle() + " "+i.getMobile() + " "+
                i.getAlternateMobile() + " "+i.getEmail() + " "+i.getDateCreated()));
    }
}
