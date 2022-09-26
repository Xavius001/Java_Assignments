package ContactGroup3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program_2 {
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
        System.out.println("1. Sort by name");
        System.out.println("2. Sort by email domain");
        System.out.println("3. Sort by date created");
        int choice = sc.nextInt();
        if (choice == 1) {
            contactList.stream().sorted((c1, c2) -> c1.getName().compareTo(c2.getName())).forEach(i -> System.out.println(i.getName() + " "+
                    i.getCompany() + " "+i.getTitle() + " "+i.getMobile() + " "+i.getAlternateMobile() + " "+i.getEmail() + " "+i.getDateCreated()));
        }
        else if (choice == 2) {
            contactList.stream().sorted((c1, c2) -> c1.getEmail().split("@")[1].compareTo(c2.getEmail().split("@")[1])).forEach(i ->
                    System.out.println(i.getName() + " "+ i.getCompany() + " "+i.getTitle() + " "+i.getMobile() + " "+i.getAlternateMobile() +
                            " "+i.getEmail() + " "+i.getDateCreated()));
        }
        else if (choice == 3) {
            contactList.stream().sorted((c1, c2) -> c1.getDateCreated().compareTo(c2.getDateCreated())).forEach(i -> System.out.println(i.getName() + " "+
                    i.getCompany() + " "+i.getTitle() + " "+i.getMobile() + " "+i.getAlternateMobile() + " "+i.getEmail() + " "+i.getDateCreated()));
        }
    }
}
