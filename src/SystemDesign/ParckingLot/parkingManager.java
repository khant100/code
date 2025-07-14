package SystemDesign.ParckingLot;

public interface parkingManager {
    ParkingSpot findParkingSpot(Vehicle vehicle);

    void addParkingSpot(ParkingSpot parkingSpot);

    void removeParkingSpot(ParkingSpot parkingSpot);
}
