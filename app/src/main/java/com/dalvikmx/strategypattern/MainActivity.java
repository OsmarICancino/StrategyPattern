package com.dalvikmx.strategypattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    public SingletonPrice singletonPrice = SingletonPrice.getInstance();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        singletonPrice.setPrice(2.50f);

        Button actionCash = findViewById(R.id.action_cash);
        Button actionCard = findViewById(R.id.action_card);
        Button actionCoupon = findViewById(R.id.action_coupon);

        actionCash.setOnClickListener(this);
        actionCard.setOnClickListener(this);
        actionCoupon.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        Payment payment;

        switch (v.getId()) {
            case R.id.action_card:
                payment = new Payment(new Card());
                break;
            case R.id.action_coupon:
                payment = new Payment(new Coupon());
                break;
            case R.id.action_cash:

                default:
                    payment = new Payment(new Cash());
                    break;

        }

        String finalPrice = new StringBuilder()
                .append("Precio final: ")
                .append("$ ")
                .append(payment.employStrategy(singletonPrice.getPrice()))
                .toString();

        Toast.makeText(this, finalPrice, Toast.LENGTH_LONG).show();
    }
}
