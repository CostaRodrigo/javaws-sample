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
 * <p>Java class for LogoMaquina complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LogoMaquina">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="nome" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="arquivo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ativo" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LogoMaquina", propOrder = {
    "id",
    "nome",
    "arquivo",
    "ativo"
})
public class LogoMaquina {

    protected long id;
    @XmlElement(required = true)
    protected String nome;
    @XmlElement(required = true)
    protected String arquivo;
    protected long ativo;

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
     * Gets the value of the arquivo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArquivo() {
        return arquivo;
    }

    /**
     * Sets the value of the arquivo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArquivo(String value) {
        this.arquivo = value;
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

}
