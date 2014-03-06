package br.com.maquinapr.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the logotemplate database table.
 * 
 */
@Entity
@Table(name="logotemplate")
public class Logotemplate implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private long id;

	@Column(length=200)
	private String arquivo;

    @Lob()
	private String ativo;

	@Column(length=200)
	private String corfundoRGB1;

	@Column(length=200)
	private String corfundoRGB2;

	@Column(length=200)
	private String nome;

    @Lob()
	private String tipo;

	@Column(length=500)
	private String topo;

    public Logotemplate() {
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

	public String getAtivo() {
		return this.ativo;
	}

	public void setAtivo(String ativo) {
		this.ativo = ativo;
	}

	public String getCorfundoRGB1() {
		return this.corfundoRGB1;
	}

	public void setCorfundoRGB1(String corfundoRGB1) {
		this.corfundoRGB1 = corfundoRGB1;
	}

	public String getCorfundoRGB2() {
		return this.corfundoRGB2;
	}

	public void setCorfundoRGB2(String corfundoRGB2) {
		this.corfundoRGB2 = corfundoRGB2;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getTopo() {
		return this.topo;
	}

	public void setTopo(String topo) {
		this.topo = topo;
	}

}