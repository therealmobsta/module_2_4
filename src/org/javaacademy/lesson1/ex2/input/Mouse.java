package org.javaacademy.lesson1.ex2.input;

public class Mouse implements Input {
    public void input() {
        System.out.println("Ввод через клавиатуру");
    }
    public void scroll() {
        System.out.println("Крутим колесико мыши");
    }
}
