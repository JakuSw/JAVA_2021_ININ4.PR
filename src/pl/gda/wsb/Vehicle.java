package pl.gda.wsb;

public abstract class Vehicle {
    private String name;
    private String registrationPlate;
    private String VINNumber;
    private String color;
    private double price;
    private double combustion;
    private double fuelInLiters;
    private double odometer;
    private double tankCapacity;

    public Vehicle(String name,
                   String registrationPlate,
                   String VINNumber,
                   String color,
                   double price,
                   double combustion,
                   double fuelInLiters,
                   double odometer,
                   double tankCapacity) {
        this.name = name;
        this.registrationPlate = registrationPlate;
        this.VINNumber = VINNumber;
        this.color = color;
        this.price = price;
        this.combustion = combustion;
        this.fuelInLiters = fuelInLiters;
        this.odometer = odometer;
        this.tankCapacity = tankCapacity;
    }

    public String getName() {
        return name;
    }

    public void Tank(double litersOfFuel){
        if (canBeTanked(litersOfFuel)) {
            this.fuelInLiters = tankCapacity;
            System.out.printf("Fuel tank is full");
        }
        else{
            this.fuelInLiters += litersOfFuel;
            System.out.printf("%s is tanked%n", this.name);
        }
    }

    private boolean canBeTanked(double litersOfFuel) {
        return (litersOfFuel + this.fuelInLiters) > tankCapacity;
    }

    public void TankToMaximum(){
        this.fuelInLiters = tankCapacity;
        System.out.printf("%s is tanked to maximum%n", this.name);
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
        System.out.printf("Range left %f km %n", getRangeRemaining());
    }

    public void ChangeColor(String color){
        this.color = color;
        this.price = this.price * 1.05;
    }

    private double getRangeRemaining() {
        return this.fuelInLiters / this.combustion;
    }

    private double getRangeRemaining(double combustion) {
        return this.fuelInLiters / combustion;
    }
}
