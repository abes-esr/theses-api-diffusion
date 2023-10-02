//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2023.09.29 à 06:05:38 PM CEST 
//


package fr.abes.theses.diffusion.model.tef;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element ref="{http://www.loc.gov/METS/}mdWrap"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "mdWrap"
})
@XmlRootElement(name = "dmdSec", namespace = "http://www.loc.gov/METS/")
public class DmdSec {

    @XmlElement(namespace = "http://www.loc.gov/METS/", required = true)
    protected MdWrap mdWrap;
    @XmlAttribute(name = "ID", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String id;

    /**
     * Obtient la valeur de la propriété mdWrap.
     * 
     * @return
     *     possible object is
     *     {@link MdWrap }
     *     
     */
    public MdWrap getMdWrap() {
        return mdWrap;
    }

    /**
     * Définit la valeur de la propriété mdWrap.
     * 
     * @param value
     *     allowed object is
     *     {@link MdWrap }
     *     
     */
    public void setMdWrap(MdWrap value) {
        this.mdWrap = value;
    }

    /**
     * Obtient la valeur de la propriété id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Définit la valeur de la propriété id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

}
