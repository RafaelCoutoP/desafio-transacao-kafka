package com.rafaelcdev.transacao.entities;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "tb_transacao")
public class Transacao {

    @Id
    private UUID id;
    @Column(nullable = false)
    private BigDecimal valor;
    @Embedded
    private Estabelecimento estabelecimento;
    @Column(nullable = false)
    private UUID cartaoId;
    @Column(nullable = false)
    private LocalDateTime efetivadaEm;

    @Deprecated
    public Transacao(){
    }

    public Transacao(UUID id, BigDecimal valor, Estabelecimento estabelecimento, UUID cartaoId, LocalDateTime efetivadaEm) {
        this.id = id;
        this.valor = valor;
        this.estabelecimento = estabelecimento;
        this.cartaoId = cartaoId;
        this.efetivadaEm = efetivadaEm;
    }

    public UUID getId() {
        return id;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public Estabelecimento getEstabelecimento() {
        return estabelecimento;
    }

    public UUID getCartaoId() {
        return cartaoId;
    }

    public LocalDateTime getEfetivadaEm() {
        return efetivadaEm;
    }
}