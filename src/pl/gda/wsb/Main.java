package pl.gda.wsb;

public class Main {

    public static void main(String[] args) {
        Car myCar1 = new Car("Tesla", "GD 1337", "Q1W2E3R4", "black", 20000.00, 1.00, 50.00, 0, 200.00, 5);
        Car myCar2 = new Car("Mazda", "GD 7331", "AZ1SX2DC3", "black", 10000.00, 10.00, 50.00, 0, 200.00, 5);
        Truck myTruck1 = new Truck("Mercedes", "GA 7331", "AZ1SX1233", "black", 100000.00, 100.00, 500.00, 400, 20000.00, 5000);
        Truck myTruck2 = new Truck("Volvo", "GA 1337", "AZ1SX1233", "yellow", 133000.00, 100.00, 500.00, 400, 20000.00, 5000);
        Motorcycle myMotorcycle1 = new Motorcycle("BMW", "GA 7331", "AZ1SX1233", "black", 1000.00, 1.00, 50.00, 0, 200.00, true);
        Motorcycle myMotorcycle2 = new Motorcycle("Honda", "GA 1337", "AZ1SX1233", "yellow", 1330.00, 1.00, 50.00, 0, 200.00, true);
        testVehicle(myCar1);
        testVehicle(myCar2);
        testVehicle(myTruck1);
        testVehicle(myTruck2);
        testVehicle(myMotorcycle1);
        testVehicle(myMotorcycle2);

    }

    private static void testVehicle(Vehicle vehicle) {
        System.out.printf("Testing %s%n", vehicle.getName());
        vehicle.Range();
        vehicle.ChangeColor("pink");
        vehicle.Tank(10);
        vehicle.TankToMaximum();
        vehicle.Drive(50,1);
        vehicle.Range();
    }

}
