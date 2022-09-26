import java.util.*;
public class isPrime {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any number");
        int n = in.nextInt();
        int count = 0;
        if(n<=1) {
            System.out.println(n+" is not a prime number");
        }
        else {
            for(int i = 1; i<=n; i++) {
                if(n%i==0) count++;
            }
            if(count==2) {
                System.out.println(n+" is a prime number");
            }
            else {
                System.out.println(n+" is not a prime number");
            }
        }
    }
}
