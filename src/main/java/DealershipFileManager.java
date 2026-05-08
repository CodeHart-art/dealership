import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class DealershipFileManager {

    String INVENTORY_CSV = "src/main/resources/inventory.csv";

    public ArrayList<Vehicle> getDealershipInventory() throws FileNotFoundException {

        ArrayList<Vehicle> vehicles = new ArrayList<>();

        try {


            BufferedReader bufferedReader = new BufferedReader(new FileReader(INVENTORY_CSV));

            String line = bufferedReader.readLine();

            String[] lineSplit = line.split("\\|");

            Dealership dealership = new Dealership(lineSplit[0], lineSplit[1], lineSplit[3]);

            while ((line = bufferedReader.readLine()) != null) {

                Vehicle vehicle = new Vehicle(Integer.parseInt(lineSplit[0]),
                        Integer.parseInt(lineSplit[1]),
                        lineSplit[2],
                        lineSplit[3],
                        lineSplit[4],
                        lineSplit[5],
                        Integer.parseInt(lineSplit[6]),
                        Double.parseDouble(lineSplit[7]));

                vehicles.add(vehicle);

            }


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return vehicles;

    }

    public void saveDealerShip(){}

}
