package SystemDesign.ParckingLot;

import java.util.ArrayList;
import java.util.List;

public class TwWheelerParkingManager implements parkingManager{

    List<ParkingSpot> parkingSpotList;

    public TwWheelerParkingManager(){
        parkingSpotList=new ArrayList<>();
    }
    @Override
    public ParkingSpot findParkingSpot(Vehicle vehicle) {
        return parkingSpotList.stream().filter(x->x.spotType()==VehicleType.TWO_WHEELER).findFirst().orElse(null);
    }

    @Override
    public void addParkingSpot(ParkingSpot parkingSpot) {
        if(parkingSpot.spotType()==VehicleType.TWO_WHEELER){
            parkingSpotList.add(parkingSpot);
        }
    }

    @Override
    public void removeParkingSpot(ParkingSpot parkingSpot) {

        if(parkingSpot.spotType()==VehicleType.TWO_WHEELER){
            parkingSpotList.remove(parkingSpot);
        }
    }
}
