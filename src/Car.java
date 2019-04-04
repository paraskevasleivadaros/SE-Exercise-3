public class Car implements VehicleType {
    private String description;
    public long findHourlyPrice() {
        return 1;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getDescription() {
        return description;
    }
}