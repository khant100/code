package SystemDesign.ParckingLot;

public class ParkingManagerFactory {

    public parkingManager parkingManagerFactory(VehicleType vehicleType){

        if(vehicleType.equals(VehicleType.TWO_WHEELER)){
            return new TwWheelerParkingManager();
        }else{
            return null;
        }

    }
}
