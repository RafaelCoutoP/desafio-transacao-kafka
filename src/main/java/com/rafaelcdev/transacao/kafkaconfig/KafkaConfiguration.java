package com.rafaelcdev.transacao.kafkaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.support.converter.StringJsonMessageConverter;

@Configuration
public class KafkaConfiguration {

    @Bean //kafka -> string - json -> Objeto == serializador;
    public StringJsonMessageConverter jsonMessageConverter(){
        return new StringJsonMessageConverter();
    }
}
