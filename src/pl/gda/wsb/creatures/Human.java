package pl.gda.wsb.creatures;

import pl.gda.wsb.devices.Car;
import pl.gda.wsb.devices.Phone;

import java.util.Date;
import java.util.Objects;

public class Human extends Animal
{
    String firstName;
    String lastName;
    Integer age;
    Animal pet;
    Double cash;
    Phone phone;

    public Car getCar() {
        return car;
    }
    public Double getCash() {
        return cash;
    }
    public void setCash(Double newCash) { this.cash = newCash; }
    public void buyCar(Car car) { this.car = car; }
    public void sellCar() { this.car = null; }
    public Phone getPhone() { return phone; }
    public void setPhone(Phone phone) { this.phone = phone; }
    public Animal getAnimal() { return pet; }
    public void setAnimal(Animal pet) { this.pet = pet;}

    public void setCar(Car car) { this.car = car; }

    private Car car;

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

    public Human(String firstName, String lastName, Integer age, Double cash) {
        super(firstName+" "+lastName,"Human");
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.cash = cash;
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

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        System.out.println("Selling humans is not allowed");
    }
}
