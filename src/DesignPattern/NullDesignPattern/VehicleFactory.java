package DesignPattern.NullDesignPattern;

public class VehicleFactory {

    static Vehicle getVehicalObject(String str){
        if("Car".equals(str)){
            return new Car();
        }
        return new NullVehicle();
    }
}
