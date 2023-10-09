package org.example.state;

import org.example.model.Subscription;

public class UnsubscribedState extends SubscriptionState{
    public UnsubscribedState(Subscription subscription) {
        super(subscription);
    }

    @Override
    public String onSubscribe() {
        subscription.changeState(new SubscribedState(subscription));

        var message = "Started new Subscription";
        System.out.println(message);

        return message;
    }

    @Override
    public String onCancel() {
        throw new RuntimeException("Not Implemented");
    }
}
