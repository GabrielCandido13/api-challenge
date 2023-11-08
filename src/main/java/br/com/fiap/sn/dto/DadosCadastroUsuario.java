package br.com.fiap.sn.dto;

import br.com.fiap.sn.endereco.DadosEndereco;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record DadosCadastroUsuario(
		@NotBlank
		String nome,		
		@NotBlank
		@Email
		String email,
		@NotBlank
		@Pattern(regexp = "\\d{10,11}")
		String telefone,
		
		@NotNull @Valid DadosEndereco endereco,
		
		@NotNull @Valid DadosInteracao interacao,
		
		@NotNull @Valid DadosChatGpt chatGpt
	) {}
