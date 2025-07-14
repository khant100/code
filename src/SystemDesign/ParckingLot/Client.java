package SystemDesign.ParckingLot;

public class Client {

        public static void main(String[] args) {
            // Create parking manager factory and strategy
            ParkingManagerFactory factory = new ParkingManagerFactory();
            ParkingStrategy strategy = new TwoWheelerParckingStrategy();

            // Create entrance
            EntranceGate entranceGate = new EntranceGate(strategy);

            // Set up parking managers and add parking spots
            parkingManager twoWheelerManager = factory.parkingManagerFactory(VehicleType.TWO_WHEELER);

            // Add parking spots
            for (int i = 0; i < 5; i++) {
                twoWheelerManager.addParkingSpot(new TwoWheelerParkingSpot());
            }

            // Simulate vehicle entry
            System.out.println("=== Vehicle Entry ===");
            Vehicle bike = new Vehicle("BIKE123", VehicleType.TWO_WHEELER);

            Ticket bikeTicket = entranceGate.genrateTicket(bike , twoWheelerManager);

            if (bikeTicket != null) {
                System.out.println("Bike parked with Ticket ID: " + bikeTicket.getTicketId());
                System.out.println("vehicle number is "+bikeTicket.getVehicle().getLicencePlate());
                System.out.println("vehicle name is "+bikeTicket.getVehicle().getVehicleType());
            }

            // Wait to simulate parking duration
            try {
                Thread.sleep(3000); // Simulate 3 seconds (or adjust to hours in real-world scenarios)
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // Simulate vehicle exit
            ExitGate exitGate = new ExitGate();

            System.out.println("\n=== Vehicle Exit ===");
            if (bikeTicket != null) {
                System.out.println("Bike exiting...");
                exitGate.processExit(bikeTicket, 10.0); // $10 per hour rate for bikes
            }
        }
    }

