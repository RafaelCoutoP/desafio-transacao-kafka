package com.rafaelcdev.transacao.consumes;

import com.rafaelcdev.transacao.DTO.TransacaoMessage;
import com.rafaelcdev.transacao.repositories.TransacaoRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class TransacaoConsumer {

    private final Logger logger = LoggerFactory.getLogger(TransacaoConsumer.class);
    private final TransacaoRepository transacaoRepository;

    @Autowired
    public TransacaoConsumer(TransacaoRepository transacaoRepository) {
        this.transacaoRepository = transacaoRepository;
    }
    //Tentar por um ID
    @KafkaListener(id = "true", topics = "transacoes")
    public void transacaoConsumer(TransacaoMessage transacaoMessage){
        logger.info(
                "Transacao id={} valor={} estabelecimento={}",
                transacaoMessage.getId(),
                transacaoMessage.getValor(),
                transacaoMessage.getEstabelecimento().getNome()
        );
        transacaoRepository.save(transacaoMessage.paraTransacao());
    }
}
