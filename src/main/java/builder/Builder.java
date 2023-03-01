package builder;

import product.Vehicle;

public abstract class Builder {

    public abstract void buildDoors();
    public abstract void buildSeats();
    public abstract void buildWheels();

    public abstract Vehicle getVehicle();
}
