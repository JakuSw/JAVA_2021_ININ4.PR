package pl.gda.wsb;

public abstract class Vehicle {
    private String name;
    private String registrationPlate;
    private String VINNumber;
    private String color;
    private int price;
    private double combustion;
    private double fuelInLiters;
    private int odometer;

    public void Tank(){
        System.out.printf("%s is tanked%n", this.name);
    }

    public void Drive(){
        System.out.printf("%s is in move%n", this.name);
    }

    public void Range(){
        System.out.printf("Range left %f %m", getRangeRemaining());
    }

    private double getRangeRemaining() {
        return this.fuelInLiters / this.combustion;
    }
}
