package SystemDesign.ParckingLot;

public class Vehicle {
    String licencePlate;

    public Vehicle(String licencePlate, VehicleType vehicleType) {
        this.licencePlate = licencePlate;
        this.vehicleType = vehicleType;
    }

    public String getLicencePlate() {
        return licencePlate;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    VehicleType vehicleType;
}
