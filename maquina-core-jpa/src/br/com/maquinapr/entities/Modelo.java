package br.com.maquinapr.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



/**
 * The persistent class for the modelo database table.
 * 
 */
@Entity
@Table(name="modelo")
public class Modelo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private long id;

	private long idContatoGrupo;

	private long idLogoAssinatura;

	private long idLogoCliente;

	private long idLogoMaquina;

	private long idLogoProduto;

	private long idLogoTemplate;

	private long idSender;

	@Column(length=200)
	private String nome;

	@Column(length=200)
	private String templateExterno;

	@Column(length=200)
	private String tituloEmail;

    public Modelo() {
    }

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getIdContatoGrupo() {
		return this.idContatoGrupo;
	}

	public void setIdContatoGrupo(long idContatoGrupo) {
		this.idContatoGrupo = idContatoGrupo;
	}

	public long getIdLogoAssinatura() {
		return this.idLogoAssinatura;
	}

	public void setIdLogoAssinatura(long idLogoAssinatura) {
		this.idLogoAssinatura = idLogoAssinatura;
	}

	public long getIdLogoCliente() {
		return this.idLogoCliente;
	}

	public void setIdLogoCliente(long idLogoCliente) {
		this.idLogoCliente = idLogoCliente;
	}

	public long getIdLogoMaquina() {
		return this.idLogoMaquina;
	}

	public void setIdLogoMaquina(long idLogoMaquina) {
		this.idLogoMaquina = idLogoMaquina;
	}

	public long getIdLogoProduto() {
		return this.idLogoProduto;
	}

	public void setIdLogoProduto(long idLogoProduto) {
		this.idLogoProduto = idLogoProduto;
	}

	public long getIdLogoTemplate() {
		return this.idLogoTemplate;
	}

	public void setIdLogoTemplate(long idLogoTemplate) {
		this.idLogoTemplate = idLogoTemplate;
	}

	public long getIdSender() {
		return this.idSender;
	}

	public void setIdSender(long idSender) {
		this.idSender = idSender;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTemplateExterno() {
		return this.templateExterno;
	}

	public void setTemplateExterno(String templateExterno) {
		this.templateExterno = templateExterno;
	}

	public String getTituloEmail() {
		return this.tituloEmail;
	}

	public void setTituloEmail(String tituloEmail) {
		this.tituloEmail = tituloEmail;
	}

}