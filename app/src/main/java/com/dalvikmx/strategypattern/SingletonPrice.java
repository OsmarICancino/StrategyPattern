package com.dalvikmx.strategypattern;

public class SingletonPrice {

    private static SingletonPrice singletonPrice = new SingletonPrice();

    private float price;

    private SingletonPrice() {

    }

    public static SingletonPrice getInstance() {
        return singletonPrice;
    }

    protected float getPrice() {
        return price;
    }

    protected void setPrice(float price) {
        this.price = price;
    }
}
