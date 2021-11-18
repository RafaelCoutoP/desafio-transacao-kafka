package com.rafaelcdev.transacao.DTO;

import com.rafaelcdev.transacao.entities.Estabelecimento;

public class EstabelecimentoResponse {

    private String nome;
    private String cidade;
    private String endereco;

    public EstabelecimentoResponse(Estabelecimento entidade){
        nome = entidade.getNome();
        cidade = entidade.getCidade();
        endereco = entidade.getEndereco();
    }

    public String getNome() {
        return nome;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEndereco() {
        return endereco;
    }
}