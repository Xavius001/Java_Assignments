package Assignment6;

import java.text.SimpleDateFormat;
import java.time.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Assignment6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //question 1
        /*
        System.out.println("Enter 10 email id of different domains");
        List<String> emails = new ArrayList<String>();

        for(int i = 0; i < 10; i++) {
            emails.add(in.nextLine());
        }

        String usernames = "";
        for(int i = 0; i < 10; i++) {
            String[] separate = emails.get(i).split("@");
            usernames += separate[0]+" ";
        }
        System.out.println(usernames);

        String domains = "";
        for(int i = 0; i < 10; i++) {
            String[] separate = emails.get(i).split("@");
            domains += separate[1]+" ";
        }
        System.out.println(domains);
        */

        //question 2
        /*
        List<String> str = Arrays.asList("One", "Two", "thrEe", "Four", "fIVe");
        for(int i = 0; i < 5; i++) {
            System.out.print(str.get(i).toLowerCase()+" ");
        }
        System.out.println();
        System.out.println("Enter a character");
        //Character.toString(char)
        //String.valeOf(char)
        String ch =""+in.next().toLowerCase().charAt(0);
        for(int i = 0; i < 5; i++) {
            if(str.get(i).toLowerCase().startsWith(ch)) System.out.print(str.get(i).toLowerCase()+" ");
        }
        System.out.println();
        */


        //question 3
        /*
        System.out.println("Enter a string");
        String original = in.next().toLowerCase();
        StringBuilder reverse = new StringBuilder("");
        for(int i = original.length()-1; i > -1; i--) {
            reverse.append(original.charAt(i));
        }
        System.out.println(reverse);
        String rev = reverse.toString();
        if(rev.equals(original)) System.out.println("It is Palindrome");
        else System.out.println("It is not Palindrome");
        */


        //question 4
        /*
        List<LocalDate> birthDates = new ArrayList<LocalDate>();

        System.out.println("Enter a list of birth dates (no more than 5)");
        DateTimeFormatter DF = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
        for(int i = 0; i < 5; i++) {
            String input = in.next();
            LocalDate birth = LocalDate.parse(input, DF);
            birthDates.add(birth);
        }

        LocalDate now = LocalDate.now();
        String currentDate = now.format(DF);
        LocalDate today = LocalDate.parse(currentDate, DF);

        for(int i = 0; i < 5; i++) {
            int age = today.getYear() - birthDates.get(i).getYear();
            if(today.getDayOfYear()>birthDates.get(i).getDayOfYear()) age--;
            if(age>30) System.out.print(birthDates.get(i)+" ");
        }
        System.out.println();
        */
    }
}
