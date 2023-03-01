package product;

public class Vehicle {

    private int doors;
    private int wheels;
    private int seats;

    private String type;

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void show() {
        System.out.println(type + " ---");
        System.out.println("Doors: " + doors);
        System.out.println("Wheels: " + wheels);
        System.out.println("Seats: " + seats);
    }
}
