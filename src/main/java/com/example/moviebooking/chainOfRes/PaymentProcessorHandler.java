package com.example.moviebooking.chainOfRes;

public class PaymentProcessorHandler extends PaymentHandler {


    @Override
    public void handle() {
        super.handle();
//        if (next != null) {
//            System.out.println("PaymentProcessorHandler");
//
//        }
        System.out.println("running PaymentProcessorHandler");

    }
}
