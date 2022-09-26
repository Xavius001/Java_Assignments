package ContactGroup;

import java.util.*;

class Contact {
    private String name, company, title, mobile, alternateMobile, email, dateCreated;

    public Contact(String name, String company, String title, String mobile, String alternateMobile, String email, String dateCreated) {
        this.name = name;
        this.company = company;
        this.title = title;
        this.mobile = mobile;
        this.alternateMobile = alternateMobile;
        this.email = email;
        this.dateCreated = dateCreated;
    }

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }

    public String getTitle() {
        return title;
    }

    public String getMobile() {
        return mobile;
    }

    public String getAlternateMobile() {
        return alternateMobile;
    }

    public String getEmail() {
        return email;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public static Contact CreateContact (String detail) {
        String[] details = detail.split(",");
        Contact c = new Contact(details[0], details[1], details[2], details[3], details[4], details[5], details[6]);
        return c;
    }
}

class Group {
    private String name;
    private List<Contact> contactList;

    public Group() {
        this.name="";
        this.contactList = new ArrayList<Contact>();
    }

    public Group(String name, List<Contact> contactList) {
        this.name = name;
        this.contactList = contactList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Contact> getContactList() {
        return contactList;
    }

    public void setContactList(List<Contact> contactList) {
        this.contactList = contactList;
    }
    public void AddContactToGroup(Contact contact) {
        contactList.add(contact);
    }

    public boolean RemoveContactFromGroup(String name) {
        for(int i = 0; i < contactList.size(); i++) {
            if(contactList.get(i).getName().equals(name)) {
                contactList.remove(i);
                System.out.println("Contact successfully deleted");
                return true;
            }
        }
        System.out.println("Contact not found in the group");
        return false;
    }

    public void DisplayContacts() {
        if(contactList.size()==0) {
            System.out.println("No contact to show");
        }
        else {
            System.out.println("Contacts in "+name);
            System.out.printf("%s %20s %20s %20s %20s %20s %20s","Name","Company","Title","Mobile","Alternate Mobile","Email", "Date Created\n");
            for(int i = 0; i < contactList.size(); i++) {
                System.out.printf("%s %20s %20s %20s %20s %20s %20s",contactList.get(i).getName(),contactList.get(i).getCompany(),
                        contactList.get(i).getTitle(),contactList.get(i).getMobile(),contactList.get(i).getAlternateMobile(),
                        contactList.get(i).getEmail(), contactList.get(i).getDateCreated()+"\n");
            }
        }
    }
}

public class Program {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int choice = 0;
        Group g = new Group();

        System.out.println("Enter the group name:");
        String name = in.nextLine();
        g.setName(name);

        while(choice!=4) {

            System.out.println("1. Add Contact");
            System.out.println("2. Delete Contact");
            System.out.println("3. Display contacts");
            System.out.println("4. Exit");
            System.out.println("Enter your choice:");
            choice = in.nextInt();

            if(choice==1) {
                System.out.println("Enter the number of contacts:");
                int numOfCont = in.nextInt();
                for(int i = 0; i < numOfCont; i++) {
                    String detail = in.next();
                    g.AddContactToGroup(Contact.CreateContact(detail));
                }
            }
            else if(choice==2) {
                System.out.println("Enter the name of the contact to be deleted:");
                String delete = in.next();
                g.RemoveContactFromGroup(delete);
            }
            else if(choice==3) {
                g.DisplayContacts();
            }
        }
    }
}
