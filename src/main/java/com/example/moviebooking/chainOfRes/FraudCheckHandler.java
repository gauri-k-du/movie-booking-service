package com.example.moviebooking.chainOfRes;

public class FraudCheckHandler extends PaymentHandler {

    @Override
    public void handle() {
        System.out.println("FraudCheckHandler running...");
        super.handle();
    }
}
