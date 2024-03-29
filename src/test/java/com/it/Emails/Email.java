package com.it.Emails;

public class Email {
    public String to;
    public String subject;
    public String body;

    public Email(String to, String subject, String body) {
        this.to = to;
        this.subject = subject;
        this.body = body;
    }

    @Override
    public String toString() {
        return "Email{" +
                "to='" + to + '\'' +
                ", subject='" + subject + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}
