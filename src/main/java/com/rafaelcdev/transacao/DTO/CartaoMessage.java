package com.rafaelcdev.transacao.DTO;

import java.util.UUID;

public class CartaoMessage {

    private UUID id;
    private String email;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}