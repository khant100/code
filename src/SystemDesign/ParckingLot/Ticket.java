package SystemDesign.ParckingLot;

import java.time.LocalDateTime;

public class Ticket {
    public int ticketId;

    public int getTicketId() {
        return ticketId;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public int ticketCounter=0;
    Vehicle vehicle;
    LocalDateTime time;

    ParkingSpot parkingSpot;

    public Ticket(Vehicle vehicle, ParkingSpot spot) {
        this.ticketId = ++ticketCounter;
        this.vehicle = vehicle;
        this.parkingSpot= spot;
        this.time = LocalDateTime.now();
    }
}
