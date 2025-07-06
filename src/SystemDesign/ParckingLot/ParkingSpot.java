package SystemDesign.ParckingLot;

public interface ParkingSpot {
    boolean isAvaliable();
    void parkVehicle(Vehicle vehicle);
    void vacentSpot();
    VehicleType spotType();
}