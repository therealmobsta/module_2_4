package HWS.Homework1.ex2;

import java.util.ArrayList;
import java.util.List;

public class TemperatureData {
    private static final ArrayList<Integer> JANUARY_TEMPERATURES = new ArrayList<>(List.of(
            0, -1, -1, -2, -5, -6, -7, -8, -9, -10, -5, -5, -2, -7, -3, -1, -8, -9, -8, -8, -18, -20, -23, -24, -25, -9, -8, -7, -6, -5, -1
    ));
    private static final ArrayList<Integer> FEBRUARY_TEMPERATURES = new ArrayList<>(List.of(
            -8, -10, -12, -13, -15, -16, -12, -7, -8, -10, -10, -9, -8, -8, -8, -9, -10, -9, -5, -6, -8, -7, -8, -9, -6, -5, -3, -1
    ));

    public ArrayList<Integer> getAllTemperatures() {
        ArrayList<Integer> allTemperatures = new ArrayList<>(JANUARY_TEMPERATURES);
        allTemperatures.addAll(FEBRUARY_TEMPERATURES);
        return allTemperatures;
    }

    public double calculateAverageTemperature() {
        ArrayList<Integer> allTemperatures = getAllTemperatures();
        int sum = 0;
        for (int temperature : allTemperatures) {
            sum += temperature;
        }
        return (double) sum / allTemperatures.size();
    }
}