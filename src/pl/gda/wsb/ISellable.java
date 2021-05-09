package pl.gda.wsb;

import pl.gda.wsb.creatures.Human;

public interface ISellable {
    void sell(Human seller, Human buyer, Double price);
}
