package SystemDesign.ParckingLot;

public class TwoWheelerParkingSpot implements ParkingSpot{

    boolean isAvaible=true;
    Vehicle parkedVehicle;
    @Override
    public boolean isAvaliable() {
        return isAvaible;
    }

    @Override
    public void parkVehicle(Vehicle vehicle) {
        isAvaible=false;
        this.parkedVehicle=vehicle;
    }

    @Override
    public void vacentSpot() {
        this.isAvaible=false;
        this.parkedVehicle=null;

    }

    @Override
    public VehicleType spotType() {
        return VehicleType.TWO_WHEELER;
    }
}
