package Assessment3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Assessment3 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputS;
        int inputI;
        boolean repeat = true;
        while(repeat) {
            Customer c = new Customer();
            Address a = new Address();

            System.out.println("Enter customerId");
            inputI = sc.nextInt();
            c.setCustomerId(inputI);

            System.out.println("Enter customerName");
            inputS = br.readLine();
            c.setCustomerName(inputS);

            System.out.println("Enter customerType");
            inputS = br.readLine();
            c.setCustomerType(inputS);

            System.out.println("Enter mobile");
            inputS = br.readLine();
            c.setMobile(inputS);

            System.out.println("permanentAddress");

            System.out.println("Enter HNo");
            inputS = br.readLine();
            a.sethNo(inputS);

            System.out.println("Enter Street");
            inputS = br.readLine();
            a.setStreet(inputS);

            System.out.println("Enter City");
            inputS = br.readLine();
            a.setCity(inputS);

            System.out.println("Enter ZipCode");
            inputS = br.readLine();
            a.setZipcode(inputS);

            System.out.println("Enter Country");
            inputS = br.readLine();
            a.setCountry(inputS);
            c.setPermanentAddress(a);

            System.out.println("Enter dateOfCreation");
            inputS = br.readLine();
            c.setDateOfCreation(LocalDate.parse(inputS, DateTimeFormatter.ofPattern("dd-MMM-yyyy")));
            CustomerBO.AddCustomer(c);

            System.out.println("Enter the Choice Y/N?");
            if(sc.next().equals("Y")) repeat = true;
            else repeat = false;
        }
        CustomerBO.getCustomers().stream().forEach(i -> System.out.println(i.getCustomerId()+" "
                +i.getCustomerName()+" "+i.getCustomerType()+" "+i.getMobile()+" "
                +i.getPermanentAddress().gethNo()+" "+i.getPermanentAddress().getStreet()+" "
                +i.getPermanentAddress().getCity()+" "+i.getPermanentAddress().getZipcode()+" "
                +i.getPermanentAddress().getCountry()+" "+i.getDateOfCreation()));
    }
}
