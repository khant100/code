package SystemDesign.ParckingLot;

import java.time.Duration;
import java.time.LocalDateTime;

public class ExitGate {
    public double calculateCharges(Ticket ticket, Double chargesPerHour){
        LocalDateTime entryTime = ticket.getTime();
        LocalDateTime exitTime = LocalDateTime.now();
        long hourParked = Math.max(1L, Duration.between(exitTime,exitTime).toHours());
        return hourParked * chargesPerHour;
    }

    public void processExit(Ticket ticket,Double ratePerHour){
        double rate = calculateCharges(ticket,ratePerHour);
        System.out.println("Ticket ID: " + ticket.getTicketId() + " | Charge: $" + rate);
        ParkingSpot parkingSpot = ticket.getParkingSpot();
        parkingSpot.vacentSpot();

    }
}
