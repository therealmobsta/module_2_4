package HWS.Homework1.ex1;

public class Runner {
    public static void main(String[] args) {
        // Создаем зоопарк с тремя животными
        Zoo<Animal> zoo = new Zoo<>(new Tiger(), new Dog(), new Bird());

        // Получаем первое животное и вызываем его специфичное действие
        Animal animal1 = zoo.getAnimal(0);
        if (animal1 instanceof Tiger) {
            ((Tiger) animal1).roar();
        }

        // Получаем второе животное и вызываем его специфичное действие
        Animal animal2 = zoo.getAnimal(1);
        if (animal2 instanceof Dog) {
            ((Dog) animal2).bark();
        }

        // Получаем третье животное и вызываем его специфичное действие
        Animal animal3 = zoo.getAnimal(2);
        if (animal3 instanceof Bird) {
            ((Bird) animal3).fly();
        }
    }
}