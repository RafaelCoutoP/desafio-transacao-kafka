package com.rafaelcdev.transacao.DTO;

import com.rafaelcdev.transacao.entities.Transacao;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

public class TransacaoResponse {

    private UUID id;
    private BigDecimal valor;
    private LocalDateTime efetivadaEm;
    private EstabelecimentoResponse estabelecimento;

    public TransacaoResponse(Transacao entidade){
        id = entidade.getId();
        valor = entidade.getValor();
        efetivadaEm = entidade.getEfetivadaEm();
        estabelecimento = new EstabelecimentoResponse(entidade.getEstabelecimento());
    }

    public UUID getId() {
        return id;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public LocalDateTime getEfetivadaEm() {
        return efetivadaEm;
    }

    public EstabelecimentoResponse getEstabelecimento() {
        return estabelecimento;
    }
}