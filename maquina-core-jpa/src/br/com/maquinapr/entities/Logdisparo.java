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
 * The persistent class for the logdisparo database table.
 * 
 */
@Entity
@Table(name="logdisparo")
public class Logdisparo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private long id;

    @Temporal( TemporalType.TIMESTAMP)
	private Date datahoraenvio;

	@Column(length=200)
	private String excecao;

	@Column(nullable=false)
	private long idDisparo;

	@Column(length=200)
	private String status;

    public Logdisparo() {
    }

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getDatahoraenvio() {
		return this.datahoraenvio;
	}

	public void setDatahoraenvio(Date datahoraenvio) {
		this.datahoraenvio = datahoraenvio;
	}

	public String getExcecao() {
		return this.excecao;
	}

	public void setExcecao(String excecao) {
		this.excecao = excecao;
	}

	public long getIdDisparo() {
		return this.idDisparo;
	}

	public void setIdDisparo(long idDisparo) {
		this.idDisparo = idDisparo;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}