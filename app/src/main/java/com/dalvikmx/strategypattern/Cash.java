package com.dalvikmx.strategypattern;

public class Cash implements Strategy {

    @Override
    public String processPaymennt(float price) {
        return String.format("%.2f", price);
    }
}
