package pl.gda.wsb;

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

        System.out.println(heavierAnimal(cat,dog).name + " is heavier");


    }

    public static Animal heavierAnimal(Animal animal1, Animal animal2){
        if(animal1.weight > animal2.weight){
            return animal1;
        }
        return animal2;
    }
}
