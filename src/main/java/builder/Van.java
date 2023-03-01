package builder;

import product.Vehicle;

public class Van extends Builder{

    Vehicle vehicle = new Vehicle();

    @Override
    public void buildDoors() {
        vehicle.setDoors(4);
    }

    @Override
    public void buildSeats() {
        vehicle.setSeats(7);
    }

    @Override
    public void buildWheels() {
        vehicle.setWheels(4);
    }

    @Override
    public Vehicle getVehicle() {
        vehicle.setType("Van");
        return vehicle;
    }
}
