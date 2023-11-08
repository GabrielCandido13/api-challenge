package br.com.fiap.sn.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record DadosChatGpt(
		
		@Pattern(regexp = "\\d{2}/\\d{2}/\\d{4}")
		String data_chatgpt,
		
		@NotBlank
		String mensagens_enviadas,
		
		@NotBlank
		String mensagens_recebidas
		
		) {

}
