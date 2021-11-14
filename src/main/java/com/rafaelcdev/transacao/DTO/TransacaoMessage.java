package com.rafaelcdev.transacao.DTO;

import com.rafaelcdev.transacao.entities.Estabelecimento;
import com.rafaelcdev.transacao.entities.Transacao;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.UUID;

public class TransacaoMessage {

    private UUID id;
    private BigDecimal valor;
    private Estabelecimento estabelecimento;
    private CartaoMessage cartao;
    private LocalDateTime efetivadaEm;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public Estabelecimento getEstabelecimento() {
        return estabelecimento;
    }

    public void setEstabelecimento(Estabelecimento estabelecimento) {
        this.estabelecimento = estabelecimento;
    }

    public CartaoMessage getCartao() {
        return cartao;
    }

    public void setCartao(CartaoMessage cartao) {
        this.cartao = cartao;
    }

    public LocalDateTime getEfetivadaEm() {
        return efetivadaEm;
    }

    public void setEfetivadaEm(LocalDateTime efetivadaEm) {
        this.efetivadaEm = efetivadaEm;
    }

    public Transacao paraTransacao() {
        return new Transacao(id, valor, estabelecimento.paraEstabelecimento(), cartao.getId(), efetivadaEm);
    }
}