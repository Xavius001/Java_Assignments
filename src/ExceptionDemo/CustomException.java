package ExceptionDemo;

import java.util.Scanner;

class UserException extends Exception {
    public UserException(String s) {
        super(s);
    }
}

public class CustomException {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int age = S.nextInt();
        double basic = S.nextDouble();
        try {
            if(age<21 || age>60) throw new UserException("Age must be between 21 to 60");
            else System.out.println(age);
        }
        catch (UserException E) {
            System.out.println(E.getMessage());
        }
        try {
            if (basic<10000) throw new UserException("Minimum baisc must be 10000");
            else System.out.println("Basic "+basic);
        }
        catch (UserException E) {
            System.out.println(E.getMessage());
        }
    }
}
