package org.example.state;

import org.example.model.Subscription;

public abstract class SubscriptionState {
    Subscription subscription;

    SubscriptionState(Subscription subscription) {
        this.subscription = subscription;
    }

    public abstract String onSubscribe();

    public abstract String onCancel();

}
