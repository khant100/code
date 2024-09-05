package DesignPattern.NullDesignPattern;

public class Main {
    public static void main(String args[]){
    Vehicle vehicle = VehicleFactory.getVehicalObject("");
    capacity(vehicle);

    }
    private  static void capacity(Vehicle vehicle){
       System.out.println( " tank Capacity "+vehicle.getTankCapacity());
        System.out.println( "Seating Capacity "+vehicle.getVehicalsetingCapicity());

    }
}
