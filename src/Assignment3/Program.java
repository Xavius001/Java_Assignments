package Assignment3;

import java.util.*;

public class Program {

    static boolean ValidateRegistrationNo(String registrationNo) {
        int count = 0;
        String[] val = registrationNo.split(" ");
        if(val.length==4) {
            //rule 1
            if(val[0].charAt(0)>=65 && val[0].charAt(0)<=90 &&
                    val[0].charAt(1)>=65 && val[0].charAt(1)<=90) {
                count++;
            }

            //rule 2
            if(val[1].length()==1 && val[1].charAt(0)>=48 &&
                    val[1].charAt(0)<=57) {
                count++;
            }
            else if(val[1].length()==2 && val[1].charAt(0)>=48 && val[1].charAt(0)<=57
                    && val[1].charAt(1)>=48 && val[1].charAt(1)<=57) {
                count++;
            }

            //rule 3
            if(val[2].length()==0) {
                count++;
            }
            else if(val[2].length()==1 && val[2].charAt(0)>=65
                    && val[2].charAt(0)<=90) {
                count++;
            }
            else if(val[2].length()==2 && val[2].charAt(0)>=65 && val[2].charAt(0)<=90
                    && val[2].charAt(1)>=65 && val[2].charAt(1)<=90) {
                count++;
            }

            //rule 4
            if(val[3].length()>=1 && val[3].length()<=4 && Integer.parseInt(val[3])>=0 && Integer.parseInt(val[3])<=9999) {
                count++;
            }

            //rule 5
            int spaces = 0;
            for(int i = 0; i < registrationNo.length(); i++) {
                if(registrationNo.charAt(i)==' ') spaces++;
            }
            if(spaces==val.length-1) count++;
            if(count==5) return true;
        }
        else if(val.length==3) {
            //rule 1
            if(val[0].charAt(0)>=65 && val[0].charAt(0)<=90 &&
                    val[0].charAt(1)>=65 && val[0].charAt(1)<=90) {
                count++;
            }

            //rule 2
            if(val[1].length()==1 && val[1].charAt(0)>=48 &&
                    val[1].charAt(0)<=57) {
                count++;
            }
            else if(val[1].length()==2 && val[1].charAt(0)>=48 && val[1].charAt(0)<=57
                    && val[1].charAt(1)>=48 && val[1].charAt(1)<=57) {
                count++;
            }

            //rule 4
            if(val[2].length()>=1 && val[2].length()<=4 && Integer.parseInt(val[2])>=0 && Integer.parseInt(val[2])<=9999) {
                count++;
            }

            //rule 5
            int spaces = 0;
            for(int i = 0; i < registrationNo.length(); i++) {
                if(registrationNo.charAt(i)==' ') spaces++;
            }
            if(spaces==val.length-1) count++;
            if(count==4) return true;
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter vehicle registration number:");
        String registrationNo = in.nextLine();
        if(ValidateRegistrationNo(registrationNo)) {
            System.out.println("Registration No. is valid");
        }
        else {
            System.out.println("Registration No. is invalid");
        }
    }
}
