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
 * The persistent class for the contato database table.
 * 
 */
@Entity
@Table(name="contato")
public class Contato implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private long id;

	private int ativo;

    @Temporal( TemporalType.DATE)
	private Date dataExpiracao;

	@Column(length=200)
	private String email;

	@Column(nullable=false)
	private long idContatoGrupo;

	private int limiteDiario;

	@Column(length=200)
	private String nome;

	private long tipo;

    public Contato() {
    }

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getAtivo() {
		return this.ativo;
	}

	public void setAtivo(int ativo) {
		this.ativo = ativo;
	}

	public Date getDataExpiracao() {
		return this.dataExpiracao;
	}

	public void setDataExpiracao(Date dataExpiracao) {
		this.dataExpiracao = dataExpiracao;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getIdContatoGrupo() {
		return this.idContatoGrupo;
	}

	public void setIdContatoGrupo(long idContatoGrupo) {
		this.idContatoGrupo = idContatoGrupo;
	}

	public int getLimiteDiario() {
		return this.limiteDiario;
	}

	public void setLimiteDiario(int limiteDiario) {
		this.limiteDiario = limiteDiario;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public long getTipo() {
		return this.tipo;
	}

	public void setTipo(long tipo) {
		this.tipo = tipo;
	}

}