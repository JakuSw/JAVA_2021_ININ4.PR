package pl.gda.wsb.devices;

import pl.gda.wsb.Brands;

import java.util.Objects;

public class Car extends Device {
    boolean isGreen;
    double value;

    public double getValue() {
        return value;
    }

    public Car(String model, Brands producer, boolean isGreen, double value, Integer yearOfProduction){
        super(producer, model,yearOfProduction);
        this.isGreen = isGreen;
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return isGreen == car.isGreen && car.getModel().equals(car.getModel()) && getProducer() == car.getProducer();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.getModel(), super.getProducer(), isGreen);
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + super.getModel() + '\'' +
                ", producer=" + super.getProducer() +
                ", isGreen=" + isGreen +
                '}';
    }

    @Override
    public void turnOn() {
        System.out.println("Car is on");
    }
}
