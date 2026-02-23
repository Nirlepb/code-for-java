import java.util.*;

class Driver{
    int driver_id;
    String name;
    String licence_type;
    Driver(int driver_id,String name,String licence_type){
        this.driver_id=driver_id;
        this.name=name;
        this.licence_type=licence_type;

    }
    void displayDriverDetails(){
        System.out.println("Driver id: "+driver_id);
        System.out.println("Driver name :"+name);
        System.out.println("Licence type :"+licence_type);

    }
}
class Vehicle{
    int Vehicle_id;
    String Vehicle_type;
    String Vehicle_number;
    Driver driver;
    static int totalVehicle=0;
    Vehicle(int Vehicle_id,String Vehicle_type,String Vehicle_number,Driver driver){
        this.Vehicle_id=Vehicle_id;
        this.Vehicle_type=Vehicle_type;
        this.Vehicle_number=Vehicle_number;
        this.driver=driver;
        totalVehicle++;

    }
    void displayVehicleDetails(){
        System.out.println("vehicle id:" +Vehicle_id);
        System.out.println("vehicle type"+ Vehicle_type);
        System.out.println("number: "+Vehicle_number);
        System.out.println("Driver detailes");
        driver.displayDriverDetails();
        System.out.println("---------------------------------------------------");
    }
}
class Fleet{
    ArrayList<Vehicle> vehicles;
    Fleet(){
        vehicles=new ArrayList<>();
    }
    void addVehicles(Vehicle vehicle){
        vehicles.add(vehicle);
    }
    void removeVehicleById(int id) {
        vehicles.removeIf(v -> v.Vehicle_id == id);
    }

    void displayFleetDetails() {
        for (Vehicle v : vehicles) {
            v.displayVehicleDetails();
        }

        System.out.println("Total Vehicles Created: " + Vehicle.totalVehicle);

}




public class FleetManagementSystem {
    public static void main(String[] args) {
        Driver d1 = new Driver(1, "Arjun", "LMV");
        Driver d2 = new Driver(2, "Ravi", "HMV");
        Driver d3 = new Driver(3, "Karan", "HMV");

        // Create Vehicles
        Vehicle v1 = new Vehicle(101, "Truck", "MH01AB1234", d1);
        Vehicle v2 = new Vehicle(102, "Van", "MH02CD5678", d2);
        Vehicle v3 = new Vehicle(103, "Truck", "MH03EF9012", d3);

        // Create Fleet
        Fleet fleet = new Fleet();

        // Add Vehicles
        fleet.addVehicles(v1);
        fleet.addVehicles(v2);
        fleet.addVehicles(v3);

        // Remove one vehicle
        fleet.removeVehicleById(102);

        // Display fleet details
        fleet.displayFleetDetails();
    }

}
}
