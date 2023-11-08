package br.com.fiap.sn.model;

import br.com.fiap.sn.dto.RequisicaoNovoInteracao;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name = "Interacao")
@Table(name = "interacao")
public class Interacao {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_interacao;
	private String data_interacao;
	private String descricao;
	private String tipo;
	private String prioridade;
	private String equipe_responsavel;
	private String telefone_equipe_responsavel;
	private String email_equipe_responsavel;
	
	public Interacao() {
		
	}
	
	public Interacao(RequisicaoNovoInteracao requisicao) {
		this.data_interacao = requisicao.data_interacao();
		this.descricao = requisicao.descricao();
		this.tipo = requisicao.tipo();
		this.prioridade = requisicao.prioridade();
		this.equipe_responsavel = requisicao.email_equipe_responsavel();
		this.telefone_equipe_responsavel = requisicao.telefone_equipe_responsavel();
		this.email_equipe_responsavel = requisicao.email_equipe_responsavel();
	}

	public Long getId_interacao() {
		return id_interacao;
	}

	public void setId_interacao(Long id_interacao) {
		this.id_interacao = id_interacao;
	}

	public String getData_interacao() {
		return data_interacao;
	}

	public void setData_interacao(String data_interacao) {
		this.data_interacao = data_interacao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(String prioridade) {
		this.prioridade = prioridade;
	}

	public String getEquipe_responsavel() {
		return equipe_responsavel;
	}

	public void setEquipe_responsavel(String equipe_responsavel) {
		this.equipe_responsavel = equipe_responsavel;
	}

	public String getTelefone_equipe_responsavel() {
		return telefone_equipe_responsavel;
	}

	public void setTelefone_equipe_responsavel(String telefone_equipe_responsavel) {
		this.telefone_equipe_responsavel = telefone_equipe_responsavel;
	}

	public String getEmail_equipe_responsavel() {
		return email_equipe_responsavel;
	}

	public void setEmail_equipe_responsavel(String email_equipe_responsavel) {
		this.email_equipe_responsavel = email_equipe_responsavel;
	}

}
 
	