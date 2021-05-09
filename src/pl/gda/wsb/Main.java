package pl.gda.wsb;

import pl.gda.wsb.creatures.Animal;
import pl.gda.wsb.creatures.Human;
import pl.gda.wsb.devices.Car;

public class Main {

    public static void main(String[] args) {
        Human person1 = new Human("John", "Doe", 30, 1500.00);
        Animal pet = new Animal("Mruczek", "Cat");
        Car car = new Car("Polo", Brands.VW,false,2.0,2010);
        Human person2 = new Human("Matt", "Eod", 30, 1500.00);
        Human person3 = new Human("John", "Doe", 30, 1500.00);
        person2.setAnimal(pet);
        person2.setCar(car);
        pet.sell(person2, person1, 100.00);
        car.sell(person2, person1, 100.00);
        person3.sell(person1,person2,300.00);
    }

}
