import java.util.Scanner;
public class NotRepeated {
    public static void main (String[] args) throws java.lang.Exception
    {
        //creates a scanner to take user input
        Scanner in = new Scanner(System.in);

        //declares and initializes array length
        System.out.println("Enter array length.");
        int len = in.nextInt();
        int[] arr = new int[len];

        //enter numbers into the array
        System.out.println("Enter numbers. 1 at a time");
        for(int i = 0; i<len; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println();

        //going to check which numbers are repeated
        for(int i = 0; i<len; i++) {
            int appearance = 0;

            //counts how many times the element appears in the array
            for(int j = 0; j<len; j++) {
                if(arr[i]==arr[j]) appearance++;
            }

            //sees if an element appears only 1 time
            if(appearance==1) System.out.print(arr[i]+" ");
        }
    }
}
