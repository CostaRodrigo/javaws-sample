//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-661 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.01.25 at 08:21:37 PM BRST 
//


package br.com.maquinapr.dataaccess.complextypes;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for listaNoticiaClipping complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="listaNoticiaClipping">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="noticiaClipping" type="{http://www.maquina.core.br/domain}NoticiaClipping" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listaNoticiaClipping", propOrder = {
    "noticiaClipping"
})
public class ListaNoticiaClipping {

    @XmlElement(required = true)
    protected List<NoticiaClipping> noticiaClipping;

    /**
     * Gets the value of the noticiaClipping property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the noticiaClipping property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNoticiaClipping().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NoticiaClipping }
     * 
     * 
     */
    public List<NoticiaClipping> getNoticiaClipping() {
        if (noticiaClipping == null) {
            noticiaClipping = new ArrayList<NoticiaClipping>();
        }
        return this.noticiaClipping;
    }

}
