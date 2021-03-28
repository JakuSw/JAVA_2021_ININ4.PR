package pl.gda.wsb;

public class Main {

    public static void main(String[] args) {

        Animal dog1 = new Animal("John", "dog");
        Animal dog2 = new Animal("John", "dog");
        System.out.println(dog1.equals(dog2));

        Car car = new Car("X", Brands.Tesla, true);
        Human human1 = new Human("John", "Smith", 25, dog1, car);
        Human human2 = new Human("John", "Smith", 25, dog1, car);
        System.out.println(human1.toString());
        System.out.println(human2.toString());

    }

}
