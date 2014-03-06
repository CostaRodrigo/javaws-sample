package br.com.maquinapr.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



/**
 * The persistent class for the noticiaclipping database table.
 * 
 */
@Entity
@Table(name="noticiaclipping")
public class Noticiaclipping implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private long id;

	private long idNoticia;

	@Column(length=200)
	private String mobileURL;

	@Column(length=200)
	private String webURL;

    public Noticiaclipping() {
    }

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getIdNoticia() {
		return this.idNoticia;
	}

	public void setIdNoticia(long idNoticia) {
		this.idNoticia = idNoticia;
	}

	public String getMobileURL() {
		return this.mobileURL;
	}

	public void setMobileURL(String mobileURL) {
		this.mobileURL = mobileURL;
	}

	public String getWebURL() {
		return this.webURL;
	}

	public void setWebURL(String webURL) {
		this.webURL = webURL;
	}

}