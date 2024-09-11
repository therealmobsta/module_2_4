package HWS.Homework2.ex2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Runner {

    public static void main(String[] args) throws IOException {
        String filePath = "resources/luggage.csv";
        Map<String, Integer> statistics = calculateBaggageStatistics(filePath);
        printStatistics(statistics);
    }

    public static Map<String, Integer> calculateBaggageStatistics(String filePath) throws IOException {
        Map<String, Integer> statistics = new HashMap<>();
        statistics.put("легкий", 0);
        statistics.put("средний", 0);
        statistics.put("тяжелый", 0);

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            boolean isFirstLine = true;
            while ((line = br.readLine()) != null) {
                if (isFirstLine) {
                    isFirstLine = false; // skip первую строку
                    continue;
                }
                String[] parts = line.split(";");
                int bagWeight = Integer.parseInt(parts[1]);

                if (bagWeight < 5) {
                    statistics.put("легкий", statistics.get("легкий") + bagWeight);
                } else if (bagWeight < 10) {
                    statistics.put("средний", statistics.get("средний") + bagWeight);
                } else {
                    statistics.put("тяжелый", statistics.get("тяжелый") + bagWeight);
                }
            }
        }

        return statistics;
    }

    private static void printStatistics(Map<String, Integer> statistics) {
        for (Map.Entry<String, Integer> entry : statistics.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}