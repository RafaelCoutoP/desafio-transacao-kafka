package com.rafaelcdev.transacao.DTO;

import javax.validation.constraints.NotNull;
import java.util.UUID;

public class CartaoMessage {

    @NotNull
    private UUID id;
    @NotNull
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