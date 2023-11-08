package br.com.fiap.sn.dto;

import jakarta.validation.constraints.NotBlank;

public record RequisicaoNovoSuporte(
		
		@NotBlank
		String nome,
		
		@NotBlank
		String email,
		
		@NotBlank
		String descricao
		
		) {
	

}
