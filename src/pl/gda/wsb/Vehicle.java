package pl.gda.wsb;

public abstract class Vehicle {
    private String name;
    private String registrationPlate;
    private String VINNumber;
    private String color;
    private int price;
    private String combustion;
    private int fuelInLiters;
    private int odometer;

    public void Tank(){
        System.out.printf("%s is tanked", this.name);
    }

    public void Drive(){
        System.out.printf("%s is in move", this.name);
    }
}
