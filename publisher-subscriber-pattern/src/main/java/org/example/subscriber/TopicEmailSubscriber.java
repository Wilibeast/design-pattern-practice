package org.example.subscriber;

import org.example.model.EmailData;

public class TopicEmailSubscriber implements EmailSubscriber{
    private String subscriberName;

    public TopicEmailSubscriber(String subscriberName) {
        this.subscriberName = subscriberName;
    }

    @Override
    public void receiveEmail(EmailData email) {
        System.out.println("Subscriber " + subscriberName + " received an email:");
        System.out.println("Sender: " + email.getSender());
        System.out.println("Subject: " + email.getSubject());
        System.out.println("Content: " + email.getContent());
        System.out.println();
    }
}
