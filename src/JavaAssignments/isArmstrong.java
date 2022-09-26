import java.util.*;
public class isArmstrong {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any number.");
        int n = in.nextInt();
        String str = Integer.toString(n);
        String number[] = str.split("");
        int sum = 0;
        for(int i = 0; i<str.length(); i++) {
            sum += Math.pow(Integer.parseInt(number[i]),str.length());
        }
        if(n==sum) System.out.println(n+" is an armstrong number.");
        else System.out.println(n+" is not an armstrong number.");
    }
}
