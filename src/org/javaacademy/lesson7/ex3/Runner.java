package org.javaacademy.lesson7.ex3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Runner {
    public static void main(String[] args) {

        List<String> names = List.of("Петр", "Иван", "Михаил", "Ян");
        //Stream.of("Петр", "Иван", "Михаил") - isOpen = true
        Stream<String> stream = names.stream();
        ArrayList<String> newNames = new ArrayList<>();
        //Stream.of("Петр", "Иван", "Михаил") - isOpen = false

        //Терминальные операции
        //forEach - Применение к каждому элементу стрима какого то действия
        stream.forEach(name -> newNames.add(name));

        //count кол-во элементов внутри стрима
        System.out.println("Кол-во элементов" + names.stream().count());

        //anyMatch - хотя бы один элемент соответствует условию
        Boolean hasAnyPetr = names.stream().anyMatch(name ->name.equals("Петр"));

        System.out.println("Есть хотя бы один петр? " + hasAnyPetr);

        //allMatch = Все эл соотв условию
        boolean allPeopleAreMichail = names.stream().allMatch(e -> "Михаил".equals(e));
        System.out.println("Все ли элементы - Михаил? " + allPeopleAreMichail);

        boolean noneOleg = names.stream().noneMatch(e -> "Олег".equals(e));
        System.out.println("Нет ни одного олега?" + noneOleg);

        boolean anyNameHasLetter = names.stream().anyMatch(e -> e.toLowerCase().contains("я"));

        // Хочу получить первый элемент из стрима

    }
}
