package br.com.maquinapr.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * The persistent class for the historicoenvio database table.
 * 
 */
@Entity
@Table(name="historicoenvio")
public class Historicoenvio implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private long id;

	private long acessos;

	@Column(length=200)
	private String assunto;

    @Temporal( TemporalType.TIMESTAMP)
	private Date dataAgendamento;

    @Temporal( TemporalType.TIMESTAMP)
	private Date dataEnvio;

	@Column(length=200)
	private String emailContato;

	@Column(length=200)
	private String emailFrom;

	private long idContato;

	private long idProduto;

	@Column(length=500)
	private String observacoes;

	private int sucesso;

    public Historicoenvio() {
    }

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getAcessos() {
		return this.acessos;
	}

	public void setAcessos(long acessos) {
		this.acessos = acessos;
	}

	public String getAssunto() {
		return this.assunto;
	}

	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}

	public Date getDataAgendamento() {
		return this.dataAgendamento;
	}

	public void setDataAgendamento(Date dataAgendamento) {
		this.dataAgendamento = dataAgendamento;
	}

	public Date getDataEnvio() {
		return this.dataEnvio;
	}

	public void setDataEnvio(Date dataEnvio) {
		this.dataEnvio = dataEnvio;
	}

	public String getEmailContato() {
		return this.emailContato;
	}

	public void setEmailContato(String emailContato) {
		this.emailContato = emailContato;
	}

	public String getEmailFrom() {
		return this.emailFrom;
	}

	public void setEmailFrom(String emailFrom) {
		this.emailFrom = emailFrom;
	}

	public long getIdContato() {
		return this.idContato;
	}

	public void setIdContato(long idContato) {
		this.idContato = idContato;
	}

	public long getIdProduto() {
		return this.idProduto;
	}

	public void setIdProduto(long idProduto) {
		this.idProduto = idProduto;
	}

	public String getObservacoes() {
		return this.observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	public int getSucesso() {
		return this.sucesso;
	}

	public void setSucesso(int sucesso) {
		this.sucesso = sucesso;
	}

}