package SystemDesign.ParckingLot;

public interface ParkingStrategy {
    ParkingSpot allocateSpot(Vehicle vehicle,parkingManager parkingManager);
}
