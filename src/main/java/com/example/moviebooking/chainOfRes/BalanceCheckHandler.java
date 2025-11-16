package com.example.moviebooking.chainOfRes;

public class BalanceCheckHandler extends PaymentHandler {

    @Override
    public void handle() {
        System.out.println("BalanceCheckHandler running...");
        super.handle();
    }
}
