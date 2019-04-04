public class Vehicle {
    public VehicleType type;

    public String plate;
    public Customer customer;

    public long findHourlyPrice() {
        if (type == null) {
            return 1;
        } else {
            return type.findHourlyPrice();
        }
    }
}