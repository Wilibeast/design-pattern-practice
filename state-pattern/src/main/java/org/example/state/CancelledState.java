package org.example.state;

import org.example.model.Subscription;

public class CancelledState extends SubscriptionState{
    public CancelledState(Subscription subscription) {
        super(subscription);
    }

    @Override
    public String onSubscribe() {
        subscription.changeState(new SubscribedState(subscription));

        var message = "Reactivated subscription";
        System.out.println(message);

        return message;
    }

    @Override
    public String onCancel() {
        throw new RuntimeException("Plan is already cancelled");
    }
}
