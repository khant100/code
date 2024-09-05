package DesignPattern.StrategyPattern;

public class PassengerVehicle extends Vehicle {

    PassengerVehicle(){
        super(new PassengerDriver());
    }
}
