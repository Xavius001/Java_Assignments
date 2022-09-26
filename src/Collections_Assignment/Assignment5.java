package Collections_Assignment;

import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.io.BufferedReader;

class Vehicle {
    //class attributes declared
    private String registrationNo, name, type;
    private double weight;
    private Ticket ticket;
    //Getter methods to return attributes
    public String getRegistrationNo() {
        return registrationNo;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public double getWeight() {
        return weight;
    }

    public Ticket getTicket() {return ticket;}

    //default constructor to initialize the attributes
    public Vehicle(String registrationNo, String name, String type, double weight, Ticket ticket) {
        this.registrationNo = registrationNo;
        this.name = name;
        this.type = type;
        this.weight = weight;
        this.ticket = ticket;
    }
    public static Vehicle CreateVehicle(String detail) {
        //accepts vehicle details as a string and separates it by a comma
        String[] vehicle = detail.split(",");

        DecimalFormat d = new DecimalFormat("##.#");

        //changes the final string (weight) to a double
        double weight_ = Double.parseDouble(vehicle[3]);
        String w = d.format(weight_);
        double wStr = Double.parseDouble(w);

        double cost_ = Double.parseDouble(vehicle[6]);
        String c = d.format(cost_);
        double cStr = Double.parseDouble(c);

        DateTimeFormatter DF = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        LocalDateTime parkedTime_ = LocalDateTime.parse(vehicle[5], DF);

        Ticket ticket_ = new Ticket(vehicle[4], parkedTime_, cStr);

        //creates a new vehicle with the 3 strings from the array and weight
        Vehicle v = new Vehicle(vehicle[0], vehicle[1], vehicle[2], wStr, ticket_);
        return v;
    }

    //displays a list of vehicles as one HUGE string
    public static String display(ArrayList<Vehicle> v) {
        String str = "";
        for(int i = 0; i < v.size(); i++) {
            str += "Vehicle "+(i+1)+"\n";
            str += "Registration No: "+v.get(i).getRegistrationNo()+"\n";
            str += "Name: "+v.get(i).getName()+": "+v.get(i).getType()+"\n";
            str += "Ticket No: "+v.get(i).getTicket().getTicketNo()+"\n\n";
        }
        return str;
    }

    public static boolean IsSame(ArrayList<Vehicle> v) {
        if(v.get(0).getRegistrationNo().equals(v.get(1).getRegistrationNo())
        && v.get(0).getName().equals(v.get(1).getName())) return true;;
        return false;
    }
}

class Ticket {
    private String ticketNo;
    private LocalDateTime parkedTime;
    private double cost;

    public Ticket() {
        ticketNo = "";
        parkedTime = LocalDateTime.now();
        cost = 0;
    }

    public Ticket(String ticketNo, LocalDateTime parkedTime, double cost) {
        this.ticketNo = ticketNo;
        this.parkedTime = parkedTime;
        this.cost = cost;
    }

    public String getTicketNo() {
        return ticketNo;
    }

    public LocalDateTime getParkedTime() {
        return parkedTime;
    }

    public double getCost() {
        return cost;
    }
}

/*
class VehicleBO {

    public List<Vehicle> FindVehicle(List<Vehicle> vehicleList, String type) {
        List<Vehicle> findType = new ArrayList<Vehicle>();
        for(int i = 0; i < vehicleList.size(); i++) {
            if(vehicleList.get(i).getType().equals(type)) findType.add(vehicleList.get(i));
        }
        return findType;
    }

    public List<Vehicle> FindVehicle(List<Vehicle> vehicleList, LocalDateTime parkedTime) {
        List<Vehicle> findTime = new ArrayList<Vehicle>();
        for(int i = 0; i < vehicleList.size(); i++) {
            if(vehicleList.get(i).getTicket().getParkedTime().equals(parkedTime)) findTime.add(vehicleList.get(i));
        }
        return findTime;
    }
}
*/

public class Assignment5 {
    public static void main(String[] args) throws IOException {

        //scanner for user input
        Scanner in = new Scanner(System.in);

        //creates an array list of vehicles based on user input
        ArrayList<Vehicle> v = new ArrayList<Vehicle>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //Accepts vehicle details as a string and passes it to the static method
        for (int i = 0; i < 2; i++) {
            System.out.println("Enter Vehicle "+(i+1)+" details:");

            //have no spaces and separate each detail with a comma
            String detail = br.readLine();

            //adds the newly created vehicle to the list
            v.add(Vehicle.CreateVehicle(detail));
        }
        System.out.println(Vehicle.display(v));
        if(Vehicle.IsSame(v)) System.out.println("Vehicle 1 is same as Vehicle 2");
        else System.out.println("Vehicle 1 and Vehicle 2 are different");

        /*System.out.println("Enter a search type: ");
        System.out.println("1. By type");
        System.out.println("2. By parked time");

        //user must enter 1 or 2 as choice to display the one of the sorts
        int search = in.nextInt();

        //sorts the list by weight and displays it
        if(search == 1) {
            System.out.println("Enter the vehicle type:");
            String type = in.next();
            VehicleBO find = new VehicleBO();
            ArrayList<Vehicle> types = (ArrayList<Vehicle>) find.FindVehicle(v, type);
            if(types.size()==0) System.out.println("No such vehicle is present");
            else System.out.println(Vehicle.display(types));
        }

        //sorts the list by type and displays it
        else if(search == 2) {
            System.out.println("Enter the parked time:");
            String time = br.readLine();
            DateTimeFormatter DF = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
            LocalDateTime parkedTime = LocalDateTime.parse(time, DF);

            VehicleBO find = new VehicleBO();
            ArrayList<Vehicle> times = (ArrayList<Vehicle>) find.FindVehicle(v, parkedTime);
            if(times.size()==0) System.out.println("No such vehicle is present");
            else System.out.println(Vehicle.display(times));
        }

        else {
            System.out.println("Invalid Choice");
        }

         */
    }
}