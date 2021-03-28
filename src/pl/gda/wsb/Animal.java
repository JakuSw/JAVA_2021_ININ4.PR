package pl.gda.wsb;

import java.util.Objects;

public class Animal {
    String name;
    final String species;

    public double getWeight() {
        return weight;
    }

    private double weight;

    public Animal(String name, String species) {
        this.name = name;
        this.species = species;
        this.weight = setWeightBySpecies(species);
    }

    private double setWeightBySpecies(String species){
        if(species.equals("cat"))
            return 6.4;
        if(species.equals("dog"))
            return 15.5;
        return 0.0;
    }

    public void feed(){
        if(weight > 0)
         this.weight += 1.0;
    }

    public void takeForAWalk(){
        if(this.weight > 0)
            this.weight -= 0.5;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Double.compare(animal.weight, weight) == 0 && name.equals(animal.name) && species.equals(animal.species);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, species, weight);
    }

    @Override
    public String toString() {
        return String.format("name: %s, species: %s", name, species);
    }
}
