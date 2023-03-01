import builder.Builder;
import builder.Motorcycle;
import builder.Van;
import director.Director;
import product.Vehicle;

public class Main {

    public static void main(String[] args) {

        //Director
        Director director = new Director();

        Builder Motorcycle = new Motorcycle();

        director.constructVehicle(Motorcycle);
        Vehicle completedVehicle = Motorcycle.getVehicle();

        completedVehicle.show();
    }
}
