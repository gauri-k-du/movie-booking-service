package com.example.moviebooking.chainOfRes;

public class CardValidationHandler extends PaymentHandler {

    @Override
    public void handle() {
        System.out.println("CardValidationHandler running...");
        super.handle();
    }
}


