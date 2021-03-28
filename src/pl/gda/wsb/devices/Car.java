package pl.gda.wsb.devices;

import pl.gda.wsb.Brands;

import java.util.Objects;

public class Car {
    final String model;
    final Brands producer;
    boolean isGreen;

    public Car(String model, Brands producer, boolean isGreen){
        this.model = model;
        this.producer = producer;
        this.isGreen = isGreen;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return isGreen == car.isGreen && model.equals(car.model) && producer == car.producer;
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, producer, isGreen);
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", producer=" + producer +
                ", isGreen=" + isGreen +
                '}';
    }
}
