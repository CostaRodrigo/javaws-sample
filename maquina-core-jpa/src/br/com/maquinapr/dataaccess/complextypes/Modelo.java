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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Modelo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Modelo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="nome" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="templateExterno" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tituloEmail" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="logoTemplate" type="{http://www.maquina.core.br/domain}LogoTemplate"/>
 *         &lt;element name="logoMaquina" type="{http://www.maquina.core.br/domain}LogoMaquina"/>
 *         &lt;element name="logoCliente" type="{http://www.maquina.core.br/domain}LogoCliente"/>
 *         &lt;element name="logoProduto" type="{http://www.maquina.core.br/domain}LogoProduto"/>
 *         &lt;element name="logoAssinatura" type="{http://www.maquina.core.br/domain}LogoAssinatura"/>
 *         &lt;element name="sender" type="{http://www.maquina.core.br/domain}Sender"/>
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
@XmlType(name = "Modelo", propOrder = {
    "id",
    "nome",
    "templateExterno",
    "tituloEmail",
    "logoTemplate",
    "logoMaquina",
    "logoCliente",
    "logoProduto",
    "logoAssinatura",
    "sender",
    "contatoGrupo"
})
public class Modelo {

    protected long id;
    @XmlElement(required = true)
    protected String nome;
    @XmlElement(required = true)
    protected String templateExterno;
    @XmlElement(required = true)
    protected String tituloEmail;
    @XmlElement(required = true)
    protected LogoTemplate logoTemplate;
    @XmlElement(required = true)
    protected LogoMaquina logoMaquina;
    @XmlElement(required = true)
    protected LogoCliente logoCliente;
    @XmlElement(required = true)
    protected LogoProduto logoProduto;
    @XmlElement(required = true)
    protected LogoAssinatura logoAssinatura;
    @XmlElement(required = true)
    protected Sender sender;
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
     * Gets the value of the templateExterno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemplateExterno() {
        return templateExterno;
    }

    /**
     * Sets the value of the templateExterno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemplateExterno(String value) {
        this.templateExterno = value;
    }

    /**
     * Gets the value of the tituloEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTituloEmail() {
        return tituloEmail;
    }

    /**
     * Sets the value of the tituloEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTituloEmail(String value) {
        this.tituloEmail = value;
    }

    /**
     * Gets the value of the logoTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link LogoTemplate }
     *     
     */
    public LogoTemplate getLogoTemplate() {
        return logoTemplate;
    }

    /**
     * Sets the value of the logoTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link LogoTemplate }
     *     
     */
    public void setLogoTemplate(LogoTemplate value) {
        this.logoTemplate = value;
    }

    /**
     * Gets the value of the logoMaquina property.
     * 
     * @return
     *     possible object is
     *     {@link LogoMaquina }
     *     
     */
    public LogoMaquina getLogoMaquina() {
        return logoMaquina;
    }

    /**
     * Sets the value of the logoMaquina property.
     * 
     * @param value
     *     allowed object is
     *     {@link LogoMaquina }
     *     
     */
    public void setLogoMaquina(LogoMaquina value) {
        this.logoMaquina = value;
    }

    /**
     * Gets the value of the logoCliente property.
     * 
     * @return
     *     possible object is
     *     {@link LogoCliente }
     *     
     */
    public LogoCliente getLogoCliente() {
        return logoCliente;
    }

    /**
     * Sets the value of the logoCliente property.
     * 
     * @param value
     *     allowed object is
     *     {@link LogoCliente }
     *     
     */
    public void setLogoCliente(LogoCliente value) {
        this.logoCliente = value;
    }

    /**
     * Gets the value of the logoProduto property.
     * 
     * @return
     *     possible object is
     *     {@link LogoProduto }
     *     
     */
    public LogoProduto getLogoProduto() {
        return logoProduto;
    }

    /**
     * Sets the value of the logoProduto property.
     * 
     * @param value
     *     allowed object is
     *     {@link LogoProduto }
     *     
     */
    public void setLogoProduto(LogoProduto value) {
        this.logoProduto = value;
    }

    /**
     * Gets the value of the logoAssinatura property.
     * 
     * @return
     *     possible object is
     *     {@link LogoAssinatura }
     *     
     */
    public LogoAssinatura getLogoAssinatura() {
        return logoAssinatura;
    }

    /**
     * Sets the value of the logoAssinatura property.
     * 
     * @param value
     *     allowed object is
     *     {@link LogoAssinatura }
     *     
     */
    public void setLogoAssinatura(LogoAssinatura value) {
        this.logoAssinatura = value;
    }

    /**
     * Gets the value of the sender property.
     * 
     * @return
     *     possible object is
     *     {@link Sender }
     *     
     */
    public Sender getSender() {
        return sender;
    }

    /**
     * Sets the value of the sender property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sender }
     *     
     */
    public void setSender(Sender value) {
        this.sender = value;
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
