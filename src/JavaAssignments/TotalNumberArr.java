import java.util.*;
public class TotalNumberArr {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 10 characters total. 1 at a time.");
        char[] arr1 = new char[10];
        for(int i = 0; i<arr1.length; i++) {
            arr1[i] = in.next().charAt(0);
        }
        System.out.println("Enter 10 integers total. 1 at a time.");
        int[] arr2 = new int[10];
        for(int i = 0; i<arr2.length; i++) {
            arr2[i] = in.nextInt();
        }
        for(int i = 0; i<arr1.length; i++) {
            System.out.print("["+arr1[i]+","+arr2[i]+"] ");
        }
        System.out.println();
        System.out.println("Enter a character.");
        char character = in.next().charAt(0);
        int sum = 0;
        for(int i = 0; i<arr1.length; i++){
            if(arr1[i]==character) {
                sum += arr2[i];
            }
        }
        System.out.println("The sum is "+sum);
    }

}
