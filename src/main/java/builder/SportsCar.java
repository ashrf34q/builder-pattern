package builder;

import product.Vehicle;

public class SportsCar extends Builder {

    Vehicle vehicle = new Vehicle();


    @Override
    public void buildDoors() {
        vehicle.setDoors(2);
    }

    @Override
    public void buildSeats() {
        vehicle.setSeats(4);
    }

    @Override
    public void buildWheels() {
        vehicle.setWheels(4);
    }

    @Override
    public Vehicle getVehicle() {
        vehicle.setType("Sports Car");
        return vehicle;
    }
}
