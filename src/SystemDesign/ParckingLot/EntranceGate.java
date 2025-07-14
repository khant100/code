package SystemDesign.ParckingLot;

public class EntranceGate {
ParkingStrategy parkingStrategy;

public EntranceGate(ParkingStrategy parkingStrategy){
    this.parkingStrategy=parkingStrategy;
}

public Ticket genrateTicket(Vehicle vehicle,parkingManager parkingManager){
    ParkingSpot spot = parkingStrategy.allocateSpot(vehicle,parkingManager);
    if(spot.isAvaliable()){
        spot.parkVehicle(vehicle);
        return new Ticket(vehicle,spot);
    }else {
        System.out.println("No spot avaliable");
        return null;
    }
}
}
