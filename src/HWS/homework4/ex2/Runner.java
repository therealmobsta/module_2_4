package HWS.homework4.ex2;

import java.util.Arrays;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        //  набор уникальных слов
        List<String> words = Arrays.asList("тон", "тополь", "боль", "рой", "стройка");

        //  стрим у набора
        long countOfO = words.stream()
                //  количество букв "о" в одном слове
                .mapToLong(word -> word.chars().filter(ch -> ch == 'о').count())
                //  сумма количества букв "о" во всех словах из набора
                .sum();

        System.out.println(countOfO);
    }
}