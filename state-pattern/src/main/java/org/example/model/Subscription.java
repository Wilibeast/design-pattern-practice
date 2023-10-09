package org.example.model;

import org.example.state.SubscriptionState;
import org.example.state.UnsubscribedState;

public class Subscription {
    private SubscriptionState state;

    public Subscription() {
        this.state = new UnsubscribedState(this);
    }

    public SubscriptionState getState() {
        return this.state;
    }

    public void changeState(SubscriptionState subscriptionState) {
        this.state = subscriptionState;
    }
}
