package org.example.adapter;

import org.example.legacy.YocoPaymentGateway;

public class YocoPaymentGatewayAdapter implements PaymentGateway{
    private YocoPaymentGateway yocoPaymentGateway;

    public YocoPaymentGatewayAdapter(YocoPaymentGateway yocoPaymentGateway) {
        this.yocoPaymentGateway = yocoPaymentGateway;
    }

    @Override
    public boolean processPayment(double amount) {
        return yocoPaymentGateway.chargeAmount(amount);
    }
}
