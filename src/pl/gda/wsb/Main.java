package pl.gda.wsb;

public class Main {

    public static void main(String[] args) {

    Animal dog = new Animal("John", "dog");

    System.out.println(dog.getWeight());
    dog.feed();
    System.out.println(dog.getWeight());

    for (int i = 0; i < 40; i++){
        dog.takeForAWalk();
    }

    dog.takeForAWalk();
    System.out.println(dog.getWeight());
    dog.feed();
    System.out.println(dog.getWeight());

    }

}
