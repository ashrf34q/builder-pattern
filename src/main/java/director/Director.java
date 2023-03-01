package director;

import builder.Builder;

public class Director {

    public void constructVehicle(Builder builder){
        builder.buildDoors();
        builder.buildSeats();
        builder.buildWheels();
    }
}
