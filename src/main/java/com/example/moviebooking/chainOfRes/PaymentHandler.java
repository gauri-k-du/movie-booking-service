package com.example.moviebooking.chainOfRes;

public abstract class PaymentHandler {

    protected PaymentHandler next;

    public PaymentHandler setNext(PaymentHandler next) {
        this.next = next;
        return next;
    }

    public void handle() {
        System.out.println("Base handler invoked");
        if (next != null) {
            next.handle();
        }
    }
}

