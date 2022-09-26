package ExceptionDemo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        try {
            int a = S.nextInt();
            int b = S.nextInt();
            int c = a / b;
            System.out.println(c);
        }
        catch(ArithmeticException E) {
            System.out.println("Denominator cannot be 0.");
        }
        catch(InputMismatchException E) {
            System.out.println("Input must be ony numerics");
        }
        finally {
            System.out.println("The end");
        }
    }
}
