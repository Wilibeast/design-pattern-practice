package org.example.subscriber;

import org.example.model.EmailData;

public interface EmailSubscriber {
    void receiveEmail(EmailData email);
}
