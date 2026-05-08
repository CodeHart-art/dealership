import java.util.ArrayList;

public class Dealership {
    private String name;
    private String address;
    private String phone;
    private ArrayList<Vehicle> inventory;

    public Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.inventory = new ArrayList<>();

    }



    public ArrayList<Vehicle> getVehiclesByPrice(){return null;}
    public ArrayList<Vehicle> getVehiclesByMakeModel(){return null;}
    public ArrayList<Vehicle> getVehiclesByYear(){return null;}
    public ArrayList<Vehicle> getVehiclesByColor(){return null;}
    public ArrayList<Vehicle> getVehiclesByMileage(){return null;}
    public ArrayList<Vehicle> getVehiclesByType(){return null;}
    public ArrayList<Vehicle> getAllVehicles(){return null;}
    public void addVehicle(Vehicle vehicle){

        inventory.add(vehicle);
    }
    public void removeVehicle(){}




}
