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
 *         &lt;element ref="{http://www.loc.gov/METS/}xmlData"/>
 *       &lt;/sequence>
 *       &lt;attribute name="MDTYPE" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="OTHERMDTYPE" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "xmlData"
})
@XmlRootElement(name = "mdWrap", namespace = "http://www.loc.gov/METS/")
public class MdWrap {

    @XmlElement(namespace = "http://www.loc.gov/METS/", required = true)
    protected XmlData xmlData;
    @XmlAttribute(name = "MDTYPE", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String mdtype;
    @XmlAttribute(name = "OTHERMDTYPE", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String othermdtype;

    /**
     * Obtient la valeur de la propriété xmlData.
     * 
     * @return
     *     possible object is
     *     {@link XmlData }
     *     
     */
    public XmlData getXmlData() {
        return xmlData;
    }

    /**
     * Définit la valeur de la propriété xmlData.
     * 
     * @param value
     *     allowed object is
     *     {@link XmlData }
     *     
     */
    public void setXmlData(XmlData value) {
        this.xmlData = value;
    }

    /**
     * Obtient la valeur de la propriété mdtype.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMDTYPE() {
        return mdtype;
    }

    /**
     * Définit la valeur de la propriété mdtype.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMDTYPE(String value) {
        this.mdtype = value;
    }

    /**
     * Obtient la valeur de la propriété othermdtype.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOTHERMDTYPE() {
        return othermdtype;
    }

    /**
     * Définit la valeur de la propriété othermdtype.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOTHERMDTYPE(String value) {
        this.othermdtype = value;
    }

}
