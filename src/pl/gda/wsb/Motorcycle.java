package pl.gda.wsb;

public class Motorcycle extends Vehicle{
    private boolean isFast;

    public Motorcycle(String name,
                      String registrationPlate,
                      String VINNumber,
                      String color,
                      double price,
                      double combustion,
                      double fuelInLiters,
                      double odometer,
                      double tankCapacity,
                      boolean isFast) {
        super(name, registrationPlate, VINNumber, color, price, combustion, fuelInLiters, odometer, tankCapacity);
        this.isFast = isFast;
    }
}
