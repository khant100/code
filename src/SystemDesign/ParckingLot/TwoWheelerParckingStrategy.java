package SystemDesign.ParckingLot;

public class TwoWheelerParckingStrategy implements ParkingStrategy{
    @Override
    public ParkingSpot allocateSpot(Vehicle vehicle,parkingManager parkingManager) {
        return parkingManager.findParkingSpot(vehicle);
    }
}
