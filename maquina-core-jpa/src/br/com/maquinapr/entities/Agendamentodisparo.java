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
 * The persistent class for the agendamentodisparo database table.
 * 
 */
@Entity
@Table(name="agendamentodisparo")
public class Agendamentodisparo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private long id;

    @Temporal( TemporalType.TIMESTAMP)
	private Date datahoraagendamento;

	@Column(nullable=false)
	private long idDisparo;

	@Column(length=200)
	private String status;

    public Agendamentodisparo() {
    }

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getDatahoraagendamento() {
		return this.datahoraagendamento;
	}

	public void setDatahoraagendamento(Date datahoraagendamento) {
		this.datahoraagendamento = datahoraagendamento;
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