package com.rafaelcdev.transacao.controller;

import com.rafaelcdev.transacao.DTO.TransacaoResponse;
import com.rafaelcdev.transacao.entities.Transacao;
import com.rafaelcdev.transacao.repositories.TransacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "transacao")
public class TransacaoController {

    @Autowired
    private TransacaoRepository repository;

    @GetMapping("/{cartaoId}")
    public ResponseEntity<List<TransacaoResponse>> listar10ultimos(@PathVariable UUID cartaoId){
        List<Transacao> transacoes = repository.findFirst10ByCartaoIdOrderByEfetivadaEmDesc(cartaoId);
        if (transacoes.isEmpty()){
            return ResponseEntity.notFound().build();
        }
        //List<TransacaoResponse> transacaoResponses = transacoes.stream().map(x -> new TransacaoResponse(x)).collect(Collectors.toList());
        return ResponseEntity.ok().body(transacoes.stream().map(x -> new TransacaoResponse(x)).collect(Collectors.toList()));
    }
}