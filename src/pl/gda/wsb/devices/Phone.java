package pl.gda.wsb.devices;

import pl.gda.wsb.Brands;
import pl.gda.wsb.creatures.Human;
import pl.gda.wsb.ISellable;

public class Phone extends Device implements ISellable {
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

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if (seller.getPhone() == null) {
            System.out.println("seller don't have a phone");
            return;
        }
        if (buyer.getPhone() != null) {
            System.out.println("buyer already have a car");
            return;
        }
        if (buyer.getCash() < price){
            System.out.println("buyer don't have enough cash");
            return;
        }
        buyer.setCash(buyer.getCash() + price);
        seller.setCash(seller.getCash() - price);
        buyer.setPhone(seller.getPhone());
        seller.setPhone(null);
        System.out.println("Phone sold");
    }
}
