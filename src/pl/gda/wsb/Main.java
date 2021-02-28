package pl.gda.wsb;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello world!");

        Animal dog = new Animal("John", "dog", 15.5);

        System.out.println(dog.name);
        System.out.println(dog.species);
        System.out.println(dog.weight);

        Phone iPhone = new Phone("iPhone", "iOS");

        System.out.println(iPhone.name);
        System.out.println(iPhone.operatingSystem);

        Animal cat = new Animal("Tom", "cat", 5.5);
        StringBuilder heavierAnimalResult = new StringBuilder();
        heavierAnimalResult.append(heavierAnimal(cat, dog).name);
        heavierAnimalResult.append(" is heavier");
        System.out.println(heavierAnimalResult.toString());

        Human person1 = new Human("John", "Nowak", 30);
        Human person2 = new Human("Pablo", "Ramirez", 43);
        Human person3 = new Human("Pablo", "Nowak", 45);

        ArrayList<Human> humanList = new ArrayList<>();

        humanList.add(person1);
        humanList.add(person2);
        humanList.add(person3);

        for (Human person: humanList)
        {
            System.out.println(person.firstName + " " + person.lastName);
        }

    }

    public static Animal heavierAnimal(Animal animal1, Animal animal2){
        if(animal1.weight > animal2.weight){
            return animal1;
        }
        return animal2;
    }
}
