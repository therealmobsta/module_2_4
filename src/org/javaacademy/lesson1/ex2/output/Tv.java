package org.javaacademy.lesson1.ex2.output;

public class Tv implements Output {
    @Override
    public void show() {
        System.out.println("Тв показ");
    }
    public void makeSound() {
        System.out.println("Телевизор орет на всю комнату");
    }
}
