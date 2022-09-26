package Assignment3;

import java.util.*;

public class Question2 {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        //first line
        for(int i = 0; i < num; i++) {
            System.out.print("*");
        }
        System.out.println();

        //middle lines
        //odd

        if(num%2==1) {
            int count = 0;
            int remainingLines = num-2;
            int middleLine = remainingLines/2;
            int emptySpaces = num-4;
            int spaceBetweenStars = 0;
            for(int i = 0; i < remainingLines; i++) {
                //first star for each line
                System.out.print("*");

                if(count==middleLine) {
                    //space between 1st and 2nd stars
                    for(int j = 0; j < spaceBetweenStars/2; j++) {
                        System.out.print(" ");
                    }
                    //2nd star
                    System.out.print("*");

                    //space between 2nd and 3rd stars
                    for(int j = 0; j < spaceBetweenStars/2; j++) {
                        System.out.print(" ");
                    }
                }
                else {
                    //space between 1st and 2nd stars
                    for(int j = 0; j < spaceBetweenStars/2; j++) {
                        System.out.print(" ");
                    }

                    //second star
                    System.out.print("*");

                    //space between 2nd and 3rd stars
                    for(int j = 0; j < emptySpaces; j++) {
                        System.out.print(" ");
                    }

                    //third star
                    System.out.print("*");

                    //space between 3rd and 4th stars
                    for(int j = 0; j < spaceBetweenStars/2; j++) {
                        System.out.print(" ");
                    }
                }

                //last star for each line
                System.out.print("*");

                //new line
                System.out.println();
                count++;
                if(count<=middleLine) {
                    spaceBetweenStars += 2;
                    emptySpaces -= 2;
                }
                else {
                    spaceBetweenStars -= 2;
                    emptySpaces += 2;
                }
            }
        }

        //even
        else {
            int count = 0;
            int remainingLines = num-2;
            int middleLine = remainingLines/2;
            int middleLine2 = middleLine+1;
            int emptySpaces = num-4;
            int spaceBetweenStars = 0;
            for(int i = 0; i < remainingLines; i++) {
                //first star for each line
                System.out.print("*");

                //space between 1st and 2nd stars
                for(int j = 0; j < spaceBetweenStars/2; j++) {
                    System.out.print(" ");
                }

                //second star
                System.out.print("*");

                //space between 2nd and 3rd stars
                for(int j = 0; j < emptySpaces; j++) {
                    System.out.print(" ");
                }

                //third star
                System.out.print("*");

                //space between 3rd and 4th stars
                for(int j = 0; j < spaceBetweenStars/2; j++) {
                    System.out.print(" ");
                }

                //last star for each line
                System.out.print("*");

                //new line
                System.out.println();
                count++;
                if(count<middleLine) {
                    spaceBetweenStars += 2;
                    emptySpaces -= 2;
                }
                else if(count==middleLine) {
                    continue;
                }
                else if(count>=middleLine2) {
                    spaceBetweenStars -= 2;
                    emptySpaces += 2;
                }
            }
        }

        //last line
        for(int i = 0; i < num; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
