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


    public ArrayList<Vehicle> getVehiclesByPrice(double min,double max) {
        ArrayList<Vehicle> vehicles = new ArrayList<>();

        for (Vehicle vehicle : inventory) {
            if (vehicle.getPrice() >= min && vehicle.getPrice() <= max)
                vehicles.add(vehicle);
        }

        return vehicles;
    }

    public ArrayList<Vehicle> getVehiclesByMakeModel(String make,String model) {
        ArrayList<Vehicle> vehicles = new ArrayList<>();

        for (Vehicle vehicle : inventory) {
            if (vehicle.getColor().equalsIgnoreCase(make) || vehicle.getModel().equalsIgnoreCase(model))
                vehicles.add(vehicle);
        }

        return vehicles;
    }

    public ArrayList<Vehicle> getVehiclesByYear(int min,int max) {
        ArrayList<Vehicle> vehicles = new ArrayList<>();

        for (Vehicle vehicle : inventory) {
            if (vehicle.getOdometer() >= min && vehicle.getOdometer() <= max)
                vehicles.add(vehicle);
        }

        return vehicles;    }

    public ArrayList<Vehicle> getVehiclesByColor(String color) {
        ArrayList<Vehicle> vehicles = new ArrayList<>();

        for (Vehicle vehicle : inventory) {
            if (vehicle.getColor().equalsIgnoreCase(color))
                vehicles.add(vehicle);
        }

        return vehicles;
    }

    public ArrayList<Vehicle> getVehiclesByMileage(int min,int max) {
        ArrayList<Vehicle> vehicles = new ArrayList<>();

        for (Vehicle vehicle : inventory) {
            if (vehicle.getOdometer() >= min && vehicle.getOdometer() <= max)
                vehicles.add(vehicle);
        }

        return vehicles;
    }

    public ArrayList<Vehicle> getVehiclesByType(String vehicleType) {
        ArrayList<Vehicle> vehicles = new ArrayList<>();

        for (Vehicle vehicle : inventory) {
            if (vehicle.getVehicleType().equalsIgnoreCase(vehicleType))
                vehicles.add(vehicle);
        }

        return vehicles;
    }

    public ArrayList<Vehicle> getAllVehicles() {
        ArrayList<Vehicle> vehicles = new ArrayList<>();

        for (Vehicle vehicle : inventory) {
            vehicles.add(vehicle);
        }

        return vehicles;
    }

    public void addVehicle(Vehicle vehicle) {
        inventory.add(vehicle);

    }

    public void removeVehicle(Vehicle vehicle) {
        inventory.remove(vehicle);
    }


}
