package org.example.state;

import org.example.model.Subscription;

public class SubscribedState extends SubscriptionState{
    public SubscribedState(Subscription subscription) {
        super(subscription);
    }

    @Override
    public String onSubscribe() {
        throw new RuntimeException("Already subscribed");
    }

    @Override
    public String onCancel() {
        subscription.changeState(new CancelledState(subscription));

        var message = "Cancelled subscription";
        System.out.println(message);

        return message;
    }
}
