package pl.gda.wsb;

import pl.gda.wsb.devices.Car;

import java.util.Date;
import java.util.Objects;

public class Human {
    String firstName;
    String lastName;
    Integer age;
    Animal pet;
    Car car;

    public Double getSalary() {
        System.out.println("Get salary timestamp: " + new Date().toString());
        return salary;
    }

    public void setSalary(Double salary) {
        if (salary <= 0){
            System.out.println("Salary must be > 0");
        }
        this.salary = salary;
        System.out.println("Salary updated");
        System.out.println("Please pick up new contract");
        System.out.println("Contact with ZUS and US about new contract, please do not cheat");
    }

    private Double salary;

    public Human(String firstName, String lastName, Integer age, Animal pet, Car car) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.pet = pet;
        this.car = car;
    }

    @Override
    public String toString() {
        return "Human{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return firstName.equals(human.firstName) && lastName.equals(human.lastName) && age.equals(human.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, age);
    }
}
