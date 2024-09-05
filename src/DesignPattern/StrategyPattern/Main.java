package DesignPattern.StrategyPattern;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Vehicle v = new OffRoadVehicle();
        v.driver();
        Vehicle v1 = new PassengerVehicle();
        v1.driver();
        Vehicle v2 = new SportsVehicle();
        v2.driver();


    }
}