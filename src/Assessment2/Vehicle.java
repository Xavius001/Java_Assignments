package Assessment2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Vehicle {
    private String _registrationNo, _name, _type;
    private double _weight;
    private Ticket _ticket;

    public Vehicle() {
        this._registrationNo = "";
        this._name = "";
        this._type = "";
        this._weight = 0;
        this._ticket = new Ticket();
    }

    public Vehicle(String _registrationNo, String _name, String _type, double _weight, Ticket _ticket) {
        this._registrationNo = _registrationNo;
        this._name = _name;
        this._type = _type;
        this._weight = _weight;
        this._ticket = _ticket;
    }

    public String get_registrationNo() {
        return _registrationNo;
    }

    public void set_registrationNo(String _registrationNo) {
        this._registrationNo = _registrationNo;
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public String get_type() {
        return _type;
    }

    public void set_type(String _type) {
        this._type = _type;
    }

    public double get_weight() {
        return _weight;
    }

    public void set_weight(double _weight) {
        this._weight = _weight;
    }

    public Ticket get_ticket() {
        return _ticket;
    }

    public void set_ticket(Ticket _ticket) {
        this._ticket = _ticket;
    }

    public static Vehicle CreateVehicle(String detail) {
        String[] details = detail.split(",");
        //indexes 4, 5 and 6
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        Ticket t = new Ticket(details[4], LocalDateTime.parse(details[5],df), Double.parseDouble(details[6]));
        Vehicle v = new Vehicle(details[0], details[1], details[2], Double.parseDouble(details[3]), t);
        System.out.println("Vehicle successfully added");
        return v;
    }
}
