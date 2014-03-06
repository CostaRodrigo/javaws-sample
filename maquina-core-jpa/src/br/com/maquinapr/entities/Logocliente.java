package br.com.maquinapr.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the logocliente database table.
 * 
 */
@Entity
@Table(name="logocliente")
public class Logocliente implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private long id;

	@Column(length=200)
	private String arquivo;

	private long ativo;

	@Column(length=200)
	private String mailing;

	@Column(length=200)
	private String nome;

	@Column(length=200)
	private String produto;

	@Column(length=200)
	private String template;

    public Logocliente() {
    }

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getArquivo() {
		return this.arquivo;
	}

	public void setArquivo(String arquivo) {
		this.arquivo = arquivo;
	}

	public long getAtivo() {
		return this.ativo;
	}

	public void setAtivo(long ativo) {
		this.ativo = ativo;
	}

	public String getMailing() {
		return this.mailing;
	}

	public void setMailing(String mailing) {
		this.mailing = mailing;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getProduto() {
		return this.produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public String getTemplate() {
		return this.template;
	}

	public void setTemplate(String template) {
		this.template = template;
	}

}