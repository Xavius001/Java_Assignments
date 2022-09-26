package Assessment2;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private String _name;
    private List<Vehicle> _vehicleList;

    public ParkingLot() {
        this._name = "";
        this._vehicleList = new ArrayList<Vehicle>();
    }

    public ParkingLot(String _name, List<Vehicle> _vehicleList) {
        this._name = _name;
        this._vehicleList = _vehicleList;
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public List<Vehicle> get_vehicleList() {
        return _vehicleList;
    }

    public void set_vehicleList(List<Vehicle> _vehicleList) {
        this._vehicleList = _vehicleList;
    }

    public void AddVehicleToParkingLot(Vehicle vehicle) {
        _vehicleList.add(vehicle);
    }

    public boolean RemoveVehicleFromParkingLot(String registrationNo) {
        for(int i = 0; i < _vehicleList.size(); i++) {
            if(_vehicleList.get(i).get_registrationNo().equalsIgnoreCase(registrationNo)) {
                _vehicleList.remove(i);
                System.out.println("Vehicle successfully deleted");
                return true;
            }
        }
        System.out.println("Vehicle not found in parking lot");
        return false;
    }

    public void DisplayVehicles() {
        if (_vehicleList.size()==0) {
            System.out.println("No vehicles to show");
        }
        else {
            System.out.println("Vehicles in " + _name);
            for(int i = 0; i < _vehicleList.size(); i++)
            {
                System.out.print(_vehicleList.get(i).get_registrationNo()+"\t");
                System.out.print(_vehicleList.get(i).get_name()+"\t");
                System.out.print(_vehicleList.get(i).get_type()+"\t");
                System.out.print(_vehicleList.get(i).get_weight()+"\t");
                System.out.print(_vehicleList.get(i).get_ticket().get_ticketNo()+"\n");
            }
        }
    }
}
