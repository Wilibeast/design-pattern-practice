package org.example.service;

import org.example.model.EmailData;
import org.example.subscriber.EmailSubscriber;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmailEventBus {
    private Map<String, List<EmailSubscriber>> subscribers = new HashMap<>();

    public void subscribe(String topic, EmailSubscriber subscriber) {
        subscribers.computeIfAbsent(topic, (k) -> new ArrayList<>()).add(subscriber);
    }

    public void sendEmail(String topic, EmailData email) {
        List<EmailSubscriber> topicSubscribers = subscribers.get(topic);

        if (topicSubscribers != null) {
            for (var subscriber : topicSubscribers) {
                subscriber.receiveEmail(email);
            }
        }
    }
}
