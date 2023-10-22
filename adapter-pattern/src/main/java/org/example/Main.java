package org.example;

import org.example.adapter.PaystackPaymentGatewayAdapter;
import org.example.adapter.YocoPaymentGatewayAdapter;
import org.example.legacy.PaystackPaymentGateway;
import org.example.legacy.YocoPaymentGateway;
import org.example.service.PaymentProcessor;

public class Main {
    public static void main(String[] args) {
        var paystackPaymentProcessor = new PaymentProcessor(new PaystackPaymentGatewayAdapter(new PaystackPaymentGateway()));
        var yocoPaymentProcessor = new PaymentProcessor(new YocoPaymentGatewayAdapter(new YocoPaymentGateway()));

        System.out.println("Processing Paystack Payment");
        paystackPaymentProcessor.performPayment(123.45);
        System.out.println();

        System.out.println("Processing Yoco Payment");
        yocoPaymentProcessor.performPayment(234.56);
        System.out.println();

        System.out.println("Processing Invalid Paystack Payment");
        paystackPaymentProcessor.performPayment(0);
        System.out.println();

        System.out.println("Processing Invalid Yoco Payment");
        yocoPaymentProcessor.performPayment(0);
        System.out.println();
    }
}