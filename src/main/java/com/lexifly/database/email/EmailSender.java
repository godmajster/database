package com.lexifly.database.email;

public interface EmailSender {
    void send(String to, String email);
}
