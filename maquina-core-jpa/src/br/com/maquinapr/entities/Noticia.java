package br.com.maquinapr.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;



/**
 * The persistent class for the noticia database table.
 * 
 */
@Entity
@Table(name="noticia")
public class Noticia implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private long id;

    @Lob()
	private String conteudo;

	private long destaque;

	private int editada;

	private long idProduto;

	private int ordem;

	@Column(length=200)
	private String titulo;

    public Noticia() {
    }

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getConteudo() {
		return this.conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

	public long getDestaque() {
		return this.destaque;
	}

	public void setDestaque(long destaque) {
		this.destaque = destaque;
	}

	public int getEditada() {
		return this.editada;
	}

	public void setEditada(int editada) {
		this.editada = editada;
	}

	public long getIdProduto() {
		return this.idProduto;
	}

	public void setIdProduto(long idProduto) {
		this.idProduto = idProduto;
	}

	public int getOrdem() {
		return this.ordem;
	}

	public void setOrdem(int ordem) {
		this.ordem = ordem;
	}

	public String getTitulo() {
		return this.titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

}