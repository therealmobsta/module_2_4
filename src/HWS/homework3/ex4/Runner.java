package HWS.homework3.ex4;

public class Runner {
    public static void main(String[] args) {
        Ruler boatMeasurer = (boat) -> {
            Boat bo = (Boat) boat;
            return bo.length;
        };

        Ruler animalMeasurer = (animal) -> {
            Animal an = (Animal) animal;
            return an.bodyLenght + an.tailLenght;
        };

        System.out.println(boatMeasurer.measure(new Boat(10))); // 10
        System.out.println(animalMeasurer.measure(new Animal(5, 3))); // 8
    }
}