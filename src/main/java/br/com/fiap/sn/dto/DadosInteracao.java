package br.com.fiap.sn.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record DadosInteracao(
		
		@NotBlank
		@Pattern(regexp = "\\d{2}/\\d{2}/\\d{4}")
		String data_interacao,
		@NotBlank
		String descricao,
		@NotBlank
		String tipo,
		@NotBlank
		String prioridade,
		
		String equipe_responsavel,
		
		@Pattern(regexp = "\\d{10,11}")
		String telefone_equipe_responsavel,
		
		@Email
		String email_equipe_responsavel
		
		) {
	}