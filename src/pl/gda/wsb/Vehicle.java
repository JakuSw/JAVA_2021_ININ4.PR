package pl.gda.wsb;

public abstract class Vehicle {
    private String name;
    private String registrationPlate;
    private String VINNumber;
    private String color;
    private int price;
    private double combustion;
    private double fuelInLiters;
    private double odometer;

    public void Tank(double litersOfFuel){
        this.fuelInLiters += litersOfFuel;
        System.out.printf("%s is tanked%n", this.name);
    }

    public void Drive(double road, double combustion){
        if (getRangeRemaining(combustion) < road){
            System.out.printf("You need more fuel to pass %f km %n", road);
        }
        else {
            System.out.printf("%s is in move%n", this.name);
            this.fuelInLiters -= combustion;
        }
    }

    public void Range(){
        System.out.printf("Range left %f %m", getRangeRemaining());
    }

    private double getRangeRemaining() {
        return this.fuelInLiters / this.combustion;
    }

    private double getRangeRemaining(double combustion) {
        return this.fuelInLiters / combustion;
    }
}
