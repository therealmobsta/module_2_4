package HWS.Homework2.ex1;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Runner {

    public static void main(String[] args) throws IOException {
        String filePath = "resources/luggage.csv";
        BaggageHandler baggageHandler = new BaggageHandler();
        Map<String, Integer> bags = baggageHandler.readBagsFromFile(filePath);
        baggageHandler.processBags(bags);
    }
}

