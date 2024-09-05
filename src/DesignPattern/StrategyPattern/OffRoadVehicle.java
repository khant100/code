package DesignPattern.StrategyPattern;

public class OffRoadVehicle extends Vehicle {


    OffRoadVehicle() {
        super(new OffDriver());
    }
}
