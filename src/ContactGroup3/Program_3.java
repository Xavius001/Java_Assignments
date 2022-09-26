package ContactGroup3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Program_3 {
    static boolean ValidateRegistrationNo(String registrationNo) {
        int count = 0;
        String[] val = registrationNo.split(" ");
        if(val.length==4) {
            //rule 1
            if(val[0].length()==2 &&
                    val[0].charAt(0)>=65 && val[0].charAt(0)<=90 &&
                    val[0].charAt(1)>=65 && val[0].charAt(1)<=90) {
                count++;
            }

            //rule 2
            if(val[1].length()==1 && val[1].charAt(0)>=48 && val[1].charAt(0)<=57) {
                count++;
            }
            else if(val[1].length()==2 && val[1].charAt(0)>=48 && val[1].charAt(0)<=57
                    && val[1].charAt(1)>=48 && val[1].charAt(1)<=57) {
                count++;
            }

            //rule 3
            if(val[2].length()==1 && val[2].charAt(0)>=65 && val[2].charAt(0)<=90) {
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
            if(count==5) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of registration nos:");
        int numOfReg = in.nextInt();
        List<String> regNos = new ArrayList<String>();
        System.out.println("Enter vehicle registration number:");
        for (int i = 0; i < numOfReg; i++) {
            String regNo = br.readLine();
            regNos.add(regNo);
        }

        regNos.stream().forEach( i -> {
            if(ValidateRegistrationNo(i)) System.out.println(i += "        Registration No. is valid");
            else System.out.println(i += "        Registration No. is invalid");
        });
    }
}

