package HWS.Homework1.ex2;

import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {
        TemperatureData temperatureData = new TemperatureData();
        ArrayList<Integer> allTemperatures = temperatureData.getAllTemperatures();
        double averageTemperature = temperatureData.calculateAverageTemperature();
        String formattedAverageTemperature = String.format("%.1f", averageTemperature);
        System.out.println("Среднесуточная температура за два месяца: " + formattedAverageTemperature);
    }
}