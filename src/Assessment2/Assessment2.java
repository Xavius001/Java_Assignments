package Assessment2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Assessment2 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the name of the Parking Lot");
        String name = in.nextLine();
        ParkingLot P = new ParkingLot();
        P.set_name(name);

        int userInput = 0;
        while(userInput != 4) {
            System.out.println("1. Add Vehicle");
            System.out.println("2. Delete Vehicle");
            System.out.println("3. Display Vehicles");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            userInput = in.nextInt();
            in.nextLine();
            if(userInput == 1) {
                //reads a string that has spaces as one line
                String detail = br.readLine();
                P.get_vehicleList().add(Vehicle.CreateVehicle(detail));
            }
            else if(userInput == 2) {
                System.out.println("Enter the registration number of the vehicle to be deleted: ");
                String registrationNo = in.nextLine();
                P.RemoveVehicleFromParkingLot(registrationNo);
            }
            else if(userInput == 3) {
                P.DisplayVehicles();
            }
        }
    }
}
