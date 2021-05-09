package pl.gda.wsb;

import pl.gda.wsb.devices.Car;
import pl.gda.wsb.devices.Phone;

public class Main {

    public static void main(String[] args) {
        Car car = new Car("Polo", Brands.VW, true, 2, 2010);
        System.out.println(car.toString());
        Phone phone = new Phone("iPhone", "iOS", Brands.Apple, "8", 1015);
        System.out.println(phone.toString());
        car.turnOn();
        phone.turnOn();
    }

}
