package HWS.Homework1.ex1;

import java.util.ArrayList;

public class Zoo {
    private final ArrayList<Animal> animals = new ArrayList<>();

    public Zoo(Animal animal1, Animal animal2, Animal animal3) {
        animals.add(animal1);
        animals.add(animal2);
        animals.add(animal3);
    }
    public Animal getAnimal(int index) {
        return animals.get(index);
    }
}
