package pl.gda.wsb;

public class Human {
    String firstName;
    String lastName;
    Integer age;
    Animal pet;
    Car car;

    public Human(String firstName, String lastName, Integer age, Animal pet, Car car) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.pet = pet;
        this.car = car;
    }
}
