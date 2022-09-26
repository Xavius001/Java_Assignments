package ExceptionAssignment;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.*;

class AgeException extends Exception {
    public AgeException(String s) {
        super(s);                           //custom exception that prints a message for user error
    }
}

public class Question1 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);     //scanner that reads user input
        LocalDate today  = LocalDate.now();     //todays date
        DateTimeFormatter D = DateTimeFormatter.ofPattern("dd-MM-yyyy");        //formats the date as day, month, and year
        String input = S.nextLine();        //reads the date of birth (currently a string) as user input
        LocalDate dob = LocalDate.parse(input, D);      //formats the date of birth from above into a local date variable and formats it as day, month and yera
        Period P = Period.between(dob, today);      //is the time period between the current date and date of birth
        try {
            if(P.getYears()<21) {       //checks if the age is less than 21
                throw new AgeException("Age must not be less than 21");     //throws the exception to the catch block below
            }
            else if(P.getYears()>58) {      //checks if the age is greater than 58
                throw new AgeException("Age must not be greater than 58");      //throws the exception to the catch block below
            }
            else {
                System.out.println(P.getYears());       //prints the age if its between 21-58
            }
        }
        catch(AgeException E) {     //catches the exception that was thrown from above
            System.out.println(E.getMessage()); //prints the message that was thrown with the exception from above
        }
    }
}
