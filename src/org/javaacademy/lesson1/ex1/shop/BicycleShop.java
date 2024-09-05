package org.javaacademy.lesson1.ex1.shop;

import org.javaacademy.lesson1.ex1.product.Bicycle;

public class BicycleShop {
    private Bicycle bicycle;

    /**
     * Покупка магазином велосипеда
     */
    public void buy(double priceForBuy) {
        bicycle = new Bicycle(priceForBuy);
    }

    public Bicycle sell(double money) {
        if(bicycle == null) {
            throw new RuntimeException("Нет велосипеда для продажи");
        }

        if (bicycle.getPrice() <= money) {
            Bicycle temp = bicycle;
            bicycle = null;
            return temp;
        }
        throw new RuntimeException("Денег недостаточно для покупки велоиспеда");
    }


}

