package HWS.Homework1.ex1;

public class Runner {
    public static void main(String[] args) {

        Zoo zoo = new Zoo(new Tiger(), new Dog(), new Bird());
        // Первое животное и его специф. действие
        Animal animal1 = zoo.getAnimal(0);
        if (animal1 instanceof Tiger) {
            ((Tiger) animal1).roar();
        }
        // Второе
        Animal animal2 = zoo.getAnimal(1);
        if (animal2 instanceof Dog) {
            ((Dog) animal2).bark();
        }
        // Третье
        Animal animal3 = zoo.getAnimal(2);
        if (animal3 instanceof Bird) {
            ((Bird) animal3).fly();
        }
    }
}