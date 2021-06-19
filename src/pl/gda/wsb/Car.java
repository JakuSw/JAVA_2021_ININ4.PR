package pl.gda.wsb;

public class Car extends Vehicle{
    private int doorsNumber;

    public Car(String name,
               String registrationPlate,
               String VINNumber,
               String color,
               double price,
               double combustion,
               double fuelInLiters,
               double odometer,
               double tankCapacity,
               int doorsNumber) {
        super(name, registrationPlate, VINNumber, color, price, combustion, fuelInLiters, odometer, tankCapacity);
        this.doorsNumber = doorsNumber;
    }
}
