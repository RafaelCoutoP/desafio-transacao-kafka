package com.rafaelcdev.transacao.repositories;

import com.rafaelcdev.transacao.entities.Transacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface TransacaoRepository extends JpaRepository<Transacao, UUID> {

    List<Transacao> findFirst10ByCartaoIdOrderByEfetivadaEmDesc(UUID cartaoId);
}
