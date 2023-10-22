package org.example.adapter;

import org.example.legacy.PaystackPaymentGateway;

public class PaystackPaymentGatewayAdapter implements PaymentGateway {
    private PaystackPaymentGateway paystackPaymentGateway;

    public PaystackPaymentGatewayAdapter(PaystackPaymentGateway paystackPaymentGateway) {
        this.paystackPaymentGateway = paystackPaymentGateway;
    }

    @Override
    public boolean processPayment(double amount) {
        var paymentId = paystackPaymentGateway.createPayment(amount);
        return paystackPaymentGateway.chargePayment(paymentId);
    }
}
