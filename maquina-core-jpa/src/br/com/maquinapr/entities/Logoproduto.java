package br.com.maquinapr.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the logoproduto database table.
 * 
 */
@Entity
@Table(name="logoproduto")
public class Logoproduto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private long id;

	@Column(length=200)
	private String arquivo;

	private long ativo;

	private long modulo;

	@Column(length=200)
	private String nome;

	@Column(length=200)
	private String texto;

    public Logoproduto() {
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

	public long getModulo() {
		return this.modulo;
	}

	public void setModulo(long modulo) {
		this.modulo = modulo;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTexto() {
		return this.texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

}