package HWS.Homework2.ex1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BaggageHandler {

    private static final int MAX_BAGS_ON_BELT = 10; // max количество чемоданов на ленте

    public Map<String, Integer> readBagsFromFile(String filePath) throws IOException {
        Map<String, Integer> bags = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            boolean isFirstLine = true;
            while ((line = br.readLine()) != null) {
                if (isFirstLine) {
                    isFirstLine = false; // skip первую строку (заголовок)
                    continue;
                }
                String[] parts = line.split(";");
                String bagNumber = parts[0];
                int bagWeight = Integer.parseInt(parts[1]);
                bags.put(bagNumber, bagWeight); // чемодан в HashMap
            }
        }
        return bags;
    }

    public void processBags(Map<String, Integer> bags) {
        List<String> bagNumbers = new ArrayList<>(bags.keySet()); // получ. список номеров чемоданов
        int totalBags = bagNumbers.size();
        for (int i = 0; i < totalBags; i += MAX_BAGS_ON_BELT) {
            int endIndex = Math.min(i + MAX_BAGS_ON_BELT, totalBags);
            List<String> batch = bagNumbers.subList(i, endIndex);

            System.out.println("Начинается загрузка на ленту");
            System.out.println("Лента загружена, начинается выдача багажа");

            for (String bagNumber : batch) {
                int bagWeight = bags.get(bagNumber);
                System.out.println(bagNumber + " (вес: " + bagWeight + " кг) - выдан"); // выдаем чемодан
            }

            System.out.println("Лента пустая, закончена выдача багажа");
        }
    }
}