package com.rafaelcdev.transacao.DTO;

import com.rafaelcdev.transacao.entities.Estabelecimento;

import javax.validation.constraints.NotNull;

public class EstabelecimentoMessage {

    @NotNull
    private String nome;
    @NotNull
    private String cidade;
    @NotNull
    private String endereco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Estabelecimento paraEstabelecimento() {
        return new Estabelecimento(nome, cidade, endereco);
    }
}