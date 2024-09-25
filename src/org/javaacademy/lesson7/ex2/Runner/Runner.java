package org.javaacademy.lesson7.ex2.Runner;

import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List<String> names = List.of("Петр", "Иван", "Федя");
        for (String name : names) {
            System.out.println(name);
        }
        names.stream().forEach(e -> System.out.println(e));
        names.stream().filter(e -> e.substring(0, 1).equals("П")).forEach(e -> System.out.println(e));
    }
}
