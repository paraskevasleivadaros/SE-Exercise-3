public class Ticket {
    public Vehicle vehicle;
    public DateRange parkingRange;
    public long calculatePrice() {
        long time = parkingRange.toHours();
        long unit = vehicle.findHourlyPrice();
        return time * unit;
    }
}