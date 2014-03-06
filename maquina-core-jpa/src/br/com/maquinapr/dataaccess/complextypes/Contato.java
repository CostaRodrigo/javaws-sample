//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-661 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.01.25 at 08:21:37 PM BRST 
//


package br.com.maquinapr.dataaccess.complextypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Contato complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Contato">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="nome" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tipo" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="dataExpiracao" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="limiteDiario" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="ativo" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="contatoGrupo" type="{http://www.maquina.core.br/domain}ContatoGrupo"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Contato", propOrder = {
    "id",
    "nome",
    "email",
    "tipo",
    "dataExpiracao",
    "limiteDiario",
    "ativo",
    "contatoGrupo"
})
public class Contato {

    protected long id;
    @XmlElement(required = true)
    protected String nome;
    @XmlElement(required = true)
    protected String email;
    protected long tipo;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataExpiracao;
    protected long limiteDiario;
    protected long ativo;
    @XmlElement(required = true)
    protected ContatoGrupo contatoGrupo;

    /**
     * Gets the value of the id property.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(long value) {
        this.id = value;
    }

    /**
     * Gets the value of the nome property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNome() {
        return nome;
    }

    /**
     * Sets the value of the nome property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNome(String value) {
        this.nome = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the tipo property.
     * 
     */
    public long getTipo() {
        return tipo;
    }

    /**
     * Sets the value of the tipo property.
     * 
     */
    public void setTipo(long value) {
        this.tipo = value;
    }

    /**
     * Gets the value of the dataExpiracao property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataExpiracao() {
        return dataExpiracao;
    }

    /**
     * Sets the value of the dataExpiracao property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataExpiracao(XMLGregorianCalendar value) {
        this.dataExpiracao = value;
    }

    /**
     * Gets the value of the limiteDiario property.
     * 
     */
    public long getLimiteDiario() {
        return limiteDiario;
    }

    /**
     * Sets the value of the limiteDiario property.
     * 
     */
    public void setLimiteDiario(long value) {
        this.limiteDiario = value;
    }

    /**
     * Gets the value of the ativo property.
     * 
     */
    public long getAtivo() {
        return ativo;
    }

    /**
     * Sets the value of the ativo property.
     * 
     */
    public void setAtivo(long value) {
        this.ativo = value;
    }

    /**
     * Gets the value of the contatoGrupo property.
     * 
     * @return
     *     possible object is
     *     {@link ContatoGrupo }
     *     
     */
    public ContatoGrupo getContatoGrupo() {
        return contatoGrupo;
    }

    /**
     * Sets the value of the contatoGrupo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContatoGrupo }
     *     
     */
    public void setContatoGrupo(ContatoGrupo value) {
        this.contatoGrupo = value;
    }

}
