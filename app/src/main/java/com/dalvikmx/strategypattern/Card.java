package com.dalvikmx.strategypattern;

public class Card implements Strategy {

    @Override
    public String processPaymennt(float price) {
        return String.format("%.2f", price + 0.5f);
    }
}
