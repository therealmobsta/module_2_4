package HWS.homework4.ex1;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Runner {
    public static void main(String[] args) {
        Stream<Car> carsA = IntStream.rangeClosed(1, 50)
                .mapToObj(i -> new Car(String.format("a0%dан799", i)));

        Stream<Car> carsK = IntStream.rangeClosed(1, 50)
                .mapToObj(i -> new Car(String.format("k0%dсе178", i)));

        List<String> specialNumbers = Stream.concat(carsA, carsK)
                .filter(car -> car.getNumber().matches(".*04[0-9].*"))
                .map(Car::getNumber)
                .collect(Collectors.toList());

        specialNumbers.forEach(System.out::println);
    }
}