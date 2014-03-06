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
 * The persistent class for the produto database table.
 * 
 */
@Entity
@Table(name="produto")
public class Produto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private long id;

	private long aplicarlogo;

	private long ativo;

    @Temporal( TemporalType.DATE)
	private Date data;

	private long idModelo;

	@Column(length=500)
	private String observacoes;

	@Column(length=200)
	private String templateExterno;

	private long tipo;

	@Column(length=500)
	private String tituloEmail;

    public Produto() {
    }

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getAplicarlogo() {
		return this.aplicarlogo;
	}

	public void setAplicarlogo(long aplicarlogo) {
		this.aplicarlogo = aplicarlogo;
	}

	public long getAtivo() {
		return this.ativo;
	}

	public void setAtivo(long ativo) {
		this.ativo = ativo;
	}

	public Date getData() {
		return this.data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public long getIdModelo() {
		return this.idModelo;
	}

	public void setIdModelo(long idModelo) {
		this.idModelo = idModelo;
	}

	public String getObservacoes() {
		return this.observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	public String getTemplateExterno() {
		return this.templateExterno;
	}

	public void setTemplateExterno(String templateExterno) {
		this.templateExterno = templateExterno;
	}

	public long getTipo() {
		return this.tipo;
	}

	public void setTipo(long tipo) {
		this.tipo = tipo;
	}

	public String getTituloEmail() {
		return this.tituloEmail;
	}

	public void setTituloEmail(String tituloEmail) {
		this.tituloEmail = tituloEmail;
	}

}