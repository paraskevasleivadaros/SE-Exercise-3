import java.util.HashSet;
import java.util.Set;

public class Customer {
    protected String name;
    protected Set<Vehicle> vehicles = new HashSet<Vehicle>();
    public void addVehicle(Vehicle vehicle) {
        vehicle.customer = this;
        vehicles.add(vehicle);
    }
    public void removeVehicle(Vehicle vehicle) {
        vehicle.customer = null;
        vehicles.remove(vehicle);
    }
}