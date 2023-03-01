package builder;

import product.Vehicle;

public class Motorcycle extends Builder {

    Vehicle vehicle = new Vehicle();


    @Override
    public void buildDoors() {
        vehicle.setDoors(0);
    }

    @Override
    public void buildSeats() {
        vehicle.setSeats(2);
    }

    @Override
    public void buildWheels() {
        vehicle.setWheels(2);
    }

    @Override
    public Vehicle getVehicle() {
        vehicle.setType("Motorcycle");
        return vehicle;
    }
}
