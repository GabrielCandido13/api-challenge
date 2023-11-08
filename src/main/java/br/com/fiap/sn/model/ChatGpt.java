package br.com.fiap.sn.model;

import br.com.fiap.sn.dto.DadosChatGpt;
import jakarta.persistence.Embeddable;

@Embeddable
public class ChatGpt {

	private String data_chatgpt;
	private String mensagens_enviadas;
	private String mensagens_recebidas;

	public ChatGpt() {

	}

	public ChatGpt(DadosChatGpt dados) {
		this.data_chatgpt = dados.data_chatgpt();
		this.mensagens_enviadas = dados.mensagens_enviadas();
		this.mensagens_recebidas = dados.mensagens_recebidas();
	}

	public void atualizarInformacoes(DadosChatGpt dados) {
		if (dados.data_chatgpt() != null) {
			this.data_chatgpt = dados.data_chatgpt();
		}
		if (dados.mensagens_enviadas() != null) {
			this.mensagens_enviadas = dados.mensagens_enviadas();
		}
		if (dados.mensagens_recebidas() != null) {
			this.mensagens_recebidas = dados.mensagens_recebidas();
		}

	}

	public String getData_chatgpt() {
		return data_chatgpt;
	}

	public void setData_chatgpt(String data_chatgpt) {
		this.data_chatgpt = data_chatgpt;
	}

	public String getMensagens_enviadas() {
		return mensagens_enviadas;
	}

	public void setMensagens_enviadas(String mensagens_enviadas) {
		this.mensagens_enviadas = mensagens_enviadas;
	}

	public String getMensagens_recebidas() {
		return mensagens_recebidas;
	}

	public void setMensagens_recebidas(String mensagens_recebidas) {
		this.mensagens_recebidas = mensagens_recebidas;
	}
}