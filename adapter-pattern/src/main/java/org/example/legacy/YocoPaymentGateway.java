package org.example.legacy;

public class YocoPaymentGateway {
    public boolean chargeAmount(double amount) {
        if (amount == 0) {
            System.out.println("Cannot charge payment with no amount");
            System.out.println("Charging Yoco payment failed");
            return false;
        }

        System.out.println("Charging Yoco payment successful");
        return true;
    }
}
