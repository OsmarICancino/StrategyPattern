package com.dalvikmx.strategypattern;

public class Coupon implements Strategy {

    @Override
    public String processPaymennt(float price) {
        return String.format("%.2f", price * 0.9f);
    }
}
