package org.example.model;

public class EmailData {
    private String sender;
    private String subject;
    private String content;

    public EmailData(String recipient, String subject, String content) {
        this.sender = recipient;
        this.subject = subject;
        this.content = content;
    }

    public String getSender() {
        return sender;
    }

    public String getSubject() {
        return subject;
    }

    public String getContent() {
        return content;
    }
}
