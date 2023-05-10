//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2023.04.27 à 04:33:45 PM CEST 
//


package fr.abes.theses.diffusion.model.tef;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *         &lt;element ref="{http://www.loc.gov/METS/}div" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ADMID" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="CONTENTIDS" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="DMDID" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="TYPE" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "div"
})
@XmlRootElement(name = "div", namespace = "http://www.loc.gov/METS/")
public class Div {

    @XmlElement(namespace = "http://www.loc.gov/METS/")
    protected Div div;
    @XmlAttribute(name = "ADMID")
    @XmlSchemaType(name = "anySimpleType")
    protected String admid;
    @XmlAttribute(name = "CONTENTIDS", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String contentids;
    @XmlAttribute(name = "DMDID", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String dmdid;
    @XmlAttribute(name = "TYPE", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String type;

    /**
     * Obtient la valeur de la propriété div.
     * 
     * @return
     *     possible object is
     *     {@link Div }
     *     
     */
    public Div getDiv() {
        return div;
    }

    /**
     * Définit la valeur de la propriété div.
     * 
     * @param value
     *     allowed object is
     *     {@link Div }
     *     
     */
    public void setDiv(Div value) {
        this.div = value;
    }

    /**
     * Obtient la valeur de la propriété admid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADMID() {
        return admid;
    }

    /**
     * Définit la valeur de la propriété admid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADMID(String value) {
        this.admid = value;
    }

    /**
     * Obtient la valeur de la propriété contentids.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCONTENTIDS() {
        return contentids;
    }

    /**
     * Définit la valeur de la propriété contentids.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCONTENTIDS(String value) {
        this.contentids = value;
    }

    /**
     * Obtient la valeur de la propriété dmdid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDMDID() {
        return dmdid;
    }

    /**
     * Définit la valeur de la propriété dmdid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDMDID(String value) {
        this.dmdid = value;
    }

    /**
     * Obtient la valeur de la propriété type.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTYPE() {
        return type;
    }

    /**
     * Définit la valeur de la propriété type.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTYPE(String value) {
        this.type = value;
    }

}
