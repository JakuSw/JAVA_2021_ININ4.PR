package pl.gda.wsb.devices;

import pl.gda.wsb.Brands;

public class Phone extends Device {
    String name;
    String operatingSystem;

    public Phone(String name, String operatingSystem, Brands producer, String model, Integer yearOfProduction) {
        super(producer, model, yearOfProduction);
        this.name = name;
        this.operatingSystem = operatingSystem;
    }

    @Override
    public void turnOn() {
        System.out.println("Phone is on");
    }
}
