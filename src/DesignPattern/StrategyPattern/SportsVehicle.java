package DesignPattern.StrategyPattern;

public class SportsVehicle extends Vehicle{

SportsVehicle(){
    super(new NormalDriver());
}
}
