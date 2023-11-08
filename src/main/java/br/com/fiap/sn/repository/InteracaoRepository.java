package br.com.fiap.sn.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.sn.model.Interacao;

public interface InteracaoRepository extends JpaRepository<Interacao, Long>{
	
}

