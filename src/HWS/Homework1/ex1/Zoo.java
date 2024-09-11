package HWS.Homework1.ex1;

import java.util.ArrayList;

public class Zoo<T extends Animal> {
    private final ArrayList<T> animals = new ArrayList<>();

    public Zoo(T animal1, T animal2, T animal3) {
        animals.add(animal1);
        animals.add(animal2);
        animals.add(animal3);
    }

    public T getAnimal(int index) {
        return animals.get(index);
    }
}