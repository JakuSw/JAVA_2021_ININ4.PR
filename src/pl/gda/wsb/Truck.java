package pl.gda.wsb;

public class Truck extends Vehicle{
    private int capacity;

    public Truck(String name,
                 String registrationPlate,
                 String VINNumber,
                 String color,
                 double price,
                 double combustion,
                 double fuelInLiters,
                 double odometer,
                 double tankCapacity,
                 int capacity) {
        super(name, registrationPlate, VINNumber, color, price, combustion, fuelInLiters, odometer, tankCapacity);
        this.capacity = capacity;
    }
}
