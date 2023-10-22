package org.example.service;

import org.example.adapter.PaymentGateway;

public class PaymentProcessor {
    private PaymentGateway paymentGateway;

    public PaymentProcessor(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public void performPayment(double amount) {
        paymentGateway.processPayment(amount);
    }
}
