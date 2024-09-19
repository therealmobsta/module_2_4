package HWS.homework3.ex1;

import HWS.homework3.ex1.fruits.Apple;
import HWS.homework3.ex1.fruits.Apricot;
import HWS.homework3.ex1.fruits.Fruit;
import HWS.homework3.ex1.fruits.Garden;

public class Runner {
    public static void main(String[] args) {

        Garden appleGarden = () -> new Apple();
        Garden apricotGarden = () -> new Apricot();

        Fruit apple = appleGarden.grow();
        Fruit apricot = apricotGarden.grow();

        System.out.println(apple.getType());
        System.out.println(apricot.getType());
    }
}