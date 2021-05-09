package pl.gda.wsb.devices;

import pl.gda.wsb.Brands;
import pl.gda.wsb.creatures.Human;
import pl.gda.wsb.ISellable;

import java.util.Objects;

public class Car extends Device implements ISellable {
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

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if (seller.getCar() == null) {
            System.out.println("seller don't have a car");
            return;
        }
        if (buyer.getCar() != null) {
            System.out.println("buyer already have a car");
            return;
        }
        if (buyer.getCash() < price){
            System.out.println("buyer don't have enough cash");
            return;
        }
        buyer.setCash(buyer.getCash() + price);
        seller.setCash(seller.getCash() - price);
        buyer.buyCar(seller.getCar());
        seller.sellCar();
        System.out.println("Car sold");
    }
}
