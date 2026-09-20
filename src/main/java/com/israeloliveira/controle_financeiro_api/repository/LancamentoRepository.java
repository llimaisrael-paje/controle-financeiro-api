package com.israeloliveira.controle_financeiro_api.repository;

import com.israeloliveira.controle_financeiro_api.model.Lancamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long> {

}