package DesignPattern.StrategyPattern;



public class Vehicle {

    Driver driver;

    Vehicle(Driver driver1){
        this.driver=driver1;
    }

    public void driver(){
        driver.driver();
    }

}
