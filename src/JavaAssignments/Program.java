package JavaAssignments;

import java.util.*;

class Contact1 {
    //attributes are declared
    private String name, company, title, mobile, alternateMobile, email;

    //default constructor that initializes attributes
    public Contact1(String name, String company, String title, String mobile, String alternateMobile, String email) {
        this.name = name;
        this.company = company;
        this.title = title;
        this.mobile = mobile;
        this.alternateMobile = alternateMobile;
        this.email = email;
    }

    //getter methods that return attributes
    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public String getCompany() {
        return this.company;
    }

    public String getTitle() {
        return this.title;
    }

    public String getMobile() {
        return this.mobile;
    }

    public String getAlternateMobile() {
        return this.alternateMobile;
    }

    //displays an array of contacts as one HUGE string
    public static String display(Contact1[] c) {
        String str = "";
        for(int i = 0; i < c.length; i++) {
            str += "Name: "+c[i].getName()+", ";
            str += "Company: "+c[i].getCompany()+", ";
            str+= "Title: "+c[i].getTitle()+", ";
            str += "Mobile: "+c[i].getMobile()+", ";
            str += "Alternate Mobile: "+c[i].getAlternateMobile()+", ";
            str += "Email: "+c[i].getEmail()+"\n";
        }
        return str;
    }
}
/*


 */
class ContactBO {
    //This method finds matching contacts by name
    public static Contact1[] FindContact1(Contact1[] contactList, String[] name) {
        //len is used to count how many matches contactList has with name^^^
        int len = 0;
        for(int i = 0; i < contactList.length; i++) {
            for(int j = 0; j < name.length; j++) {
                //if contact's name matches string name, add 1 to len
                if(contactList[i].getName().equals(name[j])) {
                    len++;
                }
            }
        }

        //initiliazes a new array based on the number of matches from the previous for loop
        Contact1[] newList = new Contact1[len];

        //is used to make sure the new array doesn't go out of bounds
        int len2 = 0;

        //does the same thing as the previous for loop but adds the matches to a new array
        for(int i = 0; i < contactList.length; i++) {
            for(int j = 0; j < name.length; j++) {
                //if contact's name matches string name, add contact to the new list
                if(contactList[i].getName().equals(name[j])) {
                    newList[len2] = contactList[i];
                    len2++;
                }
            }
        }

        //returns the matches if there are any
        return newList;
    }

    /*Does the same thing as the previous method.
    Only difference is that it finds matches based on email domain*/
    public static Contact1[] FindContact2(Contact1[] contactList, String domain) {

        int len = 0;
        for(int i = 0; i < contactList.length; i++) {
            if(contactList[i].getEmail().contains(domain)) { //difference is right here
                len++;
            }
        }
        int len2 = 0;
        Contact1[] newList = new Contact1[len];
        for(int i = 0; i < contactList.length; i++) {
            if(contactList[i].getEmail().contains(domain)) { //difference is right here
                newList[len2] = contactList[i];
                len2++;
            }
        }
        return newList;
    }
}

public class Program {
    public static void main(String[] args) {
        //Scanner to read user input
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number of contact details: ");

        //creates an array of contacts based on user input
        int numOfCon = in.nextInt();
        Contact1[] c = new Contact1[numOfCon];

        /*breaks user input (contact details)  in an array of 6 strings
        The array of 6 strings is passed into the constructor of the contact array*/
        for (int i = 0; i < numOfCon; i++) {
            String[] details = in.next().split(","); //each string is separated by a comma
            c[i] = new Contact1(details[0], details[1], details[2], details[3], details[4], details[5]);
        }

        System.out.println("Enter a search type:");
        System.out.println("1. Name");
        System.out.println("2. Email domain");

        //This should be self-explanatory lol. Read the document
        int searchType = in.nextInt();

        //This option is for searching contacts by name
        if(searchType == 1) {
            System.out.println("Enter the names:");

            //breaks user input into an array of strings
            String[] names = in.next().split(","); //each string is separated by a comma

            //calls the 1st static method to search the contact array
            Contact1[] c2 = ContactBO.FindContact1(c, names);
            System.out.println(Contact1.display(c2));
        }

        //This option is for searching contacts by email domain
        else if(searchType == 2) {
            System.out.println("Enter the Email domain to search contacts that have same email domain");

            //makes user input lowercase to avoid error with email domain names
            String domain = in.next().toLowerCase();

            //calls the 2nd static method to search the contact array
            Contact1[] c2 = ContactBO.FindContact2(c, domain);
            System.out.println(Contact1.display(c2));
        }

        //You ain't searching jack if you didn't input 1 or 2
        else {
            System.out.println("Invalid Choice");
        }
    }
}
