package ExceptionDemo;

import java.util.InputMismatchException;
import java.util.Scanner;


public class ExceptionEx2 {
    public static int getAge() {
        Scanner integer = new Scanner(System.in);
        int age;
        System.out.println("Enter a number lesser than 65 but greater than 21");
        try {
            age = integer.nextInt();
            if(age>65 || age<21) return getAge();
            return age;
        }
        catch(InputMismatchException E) {
            System.out.println("Numeric input only");
            return getAge();
        }
    }

    public static void main(String[] args) {

        Scanner S = new Scanner(System.in);
        try {
            int a = S.nextInt();
            int b = S.nextInt();
            if (b==0) {
                throw new ArithmeticException("the denominator cannot be 0");
            }
            else {
                int c = a / b;
                System.out.println(c);
            }
        }
        catch(ArithmeticException E) {
            System.out.println(E.getMessage());
        }
        finally {
            System.out.println("The End");
        }

        //System.out.println(getAge());
    }
}
