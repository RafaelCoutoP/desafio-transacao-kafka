package com.rafaelcdev.transacao.DTO;

import com.rafaelcdev.transacao.entities.Estabelecimento;
import com.rafaelcdev.transacao.entities.Transacao;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Positive;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

public class TransacaoMessage {
    @NotNull
    private UUID id;
    @NotNull @Positive
    private BigDecimal valor;
    @NotNull @Valid
    private EstabelecimentoMessage estabelecimento;
    @NotNull @Valid
    private CartaoMessage cartao;
    @NotNull @PastOrPresent
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

    public EstabelecimentoMessage getEstabelecimento() {
        return estabelecimento;
    }

    public void setEstabelecimento(EstabelecimentoMessage estabelecimento) {
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