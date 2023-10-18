package org.example;

import org.example.model.EmailData;
import org.example.service.EmailEventBus;
import org.example.subscriber.TopicEmailSubscriber;

public class Main {
    public static void main(String[] args) {
        var emailEventBus = new EmailEventBus();

        var subscriberOne = new TopicEmailSubscriber("Bob");
        emailEventBus.subscribe("news", subscriberOne);

        var subscriberTwo = new TopicEmailSubscriber("William");
        emailEventBus.subscribe("updates", subscriberTwo);

        var subscriberThree = new TopicEmailSubscriber("Jack");
        emailEventBus.subscribe("news", subscriberThree);

        var newsEmail = new EmailData("news@example.com",
                "New news update!", "Wow very important news.");

        var updateEmail = new EmailData("updates@example.com",
                "New update!", "We have a new email service");

        emailEventBus.sendEmail("news", newsEmail);
        emailEventBus.sendEmail("updates", updateEmail);
    }
}