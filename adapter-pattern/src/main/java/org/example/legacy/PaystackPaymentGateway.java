package org.example.legacy;

import java.util.UUID;

public class PaystackPaymentGateway {
    public UUID createPayment(double amount) {
        System.out.printf("Creating Paystack payment for R%s\n", amount);

        if (amount == 0) {
            System.out.println("Cannot create payment with no amount");
            return null;
        }

        var paymentId = UUID.randomUUID();
        System.out.printf("Payment Id : %s\n", paymentId);

        return paymentId;
    }

    public boolean chargePayment(UUID paymentId) {
        if (paymentId == null) {
            System.out.println("Payment Charging failed");
            return false;
        }

        System.out.printf("Charging payment with id : %s\n", paymentId);
        System.out.println("Charging payment successful");
        return true;
    }
}
