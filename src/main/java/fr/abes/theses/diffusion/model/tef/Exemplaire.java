//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2023.04.27 à 04:33:45 PM CEST 
//


package fr.abes.theses.diffusion.model.tef;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.theses.fr/namespace/tefudoc}rcr"/>
 *         &lt;element ref="{http://www.theses.fr/namespace/tefudoc}cote"/>
 *         &lt;element ref="{http://www.theses.fr/namespace/tefudoc}peb"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "rcr",
    "cote",
    "peb"
})
@XmlRootElement(name = "exemplaire", namespace = "http://www.theses.fr/namespace/tefudoc")
public class Exemplaire {

    @XmlElement(namespace = "http://www.theses.fr/namespace/tefudoc", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String rcr;
    @XmlElement(namespace = "http://www.theses.fr/namespace/tefudoc", required = true)
    protected Cote cote;
    @XmlElement(namespace = "http://www.theses.fr/namespace/tefudoc", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String peb;

    /**
     * Obtient la valeur de la propriété rcr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRcr() {
        return rcr;
    }

    /**
     * Définit la valeur de la propriété rcr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRcr(String value) {
        this.rcr = value;
    }

    /**
     * Obtient la valeur de la propriété cote.
     * 
     * @return
     *     possible object is
     *     {@link Cote }
     *     
     */
    public Cote getCote() {
        return cote;
    }

    /**
     * Définit la valeur de la propriété cote.
     * 
     * @param value
     *     allowed object is
     *     {@link Cote }
     *     
     */
    public void setCote(Cote value) {
        this.cote = value;
    }

    /**
     * Obtient la valeur de la propriété peb.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeb() {
        return peb;
    }

    /**
     * Définit la valeur de la propriété peb.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeb(String value) {
        this.peb = value;
    }

}
