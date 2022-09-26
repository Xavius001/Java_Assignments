package JavaAssignments;

import java.util.Scanner;
public class GreaterThan {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter array length.");
        int len = in.nextInt();
        int[] arr = new int[len];
        System.out.println("Enter numbers for the array. 1 at a time");
        for(int i = 0; i<len; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("Enter a number.");
        int num = in.nextInt();
        int sum = 0;
        for(int i = 0; i<arr.length; i++) {
            if(arr[i]>num) sum += arr[i];
        }
        System.out.println("The sum of numbers greater than"+num+" is "+sum);
    }
}