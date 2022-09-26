package ContactGroup3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws IOException {

        //takes numeric value as input
        System.out.println("Enter the number of contacts");
        Scanner sc = new Scanner(System.in);
        int numOfCon = sc.nextInt();


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //loop used to create and add contacts to the list
        List<Contact> contactList = new ArrayList<Contact>();
        for (int i = 0; i < numOfCon; i++) {
            String detail = br.readLine();
            contactList.add(Contact.CreateContact(detail));
        }

        System.out.println("Enter a search type:");
        System.out.println("1. Name");
        System.out.println("2. Date created");
        System.out.println("3. Email Domain");
        int choice = sc.nextInt();
        ContactBO bo = new ContactBO();
        if (choice == 1) {
            System.out.println("Enter the names:");
            String[] names = br.readLine().split(",");
            List<String> name = new ArrayList<String>();
            for (String s : names) {
                name.add(s);
            }
            List<Contact> nameList = bo.FindContact(contactList, name);
            Contact.display(nameList);
        }
        else if (choice == 2) {
            System.out.println("Enter the date to search contacts that were created on that date");
            String dateToSearch = sc.next();
            DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            LocalDate date = LocalDate.parse(dateToSearch, format);
            List<Contact> dateList = bo.FindContact(contactList, date);
            Contact.display(dateList);
        }
        else if (choice == 3) {
            System.out.println("Enter the Email domain to search contacts that have same email domain");
            String domain = sc.next();
            List<Contact> domList = bo.FindContact(contactList, domain);
            Contact.display(domList);
        }
        else {
            System.out.println("Invalid choice.");
        }
    }
}
