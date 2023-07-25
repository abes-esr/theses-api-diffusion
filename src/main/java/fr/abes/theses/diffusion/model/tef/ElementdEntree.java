//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2023.07.25 à 11:30:51 AM CEST 
//


package fr.abes.theses.diffusion.model.tef;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
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
 *       &lt;attribute name="autoriteExterne" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="autoriteSource" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "content"
})
@XmlRootElement(name = "elementdEntree")
public class ElementdEntree {

    @XmlValue
    protected String content;
    @XmlAttribute(name = "autoriteExterne", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String autoriteExterne;
    @XmlAttribute(name = "autoriteSource", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String autoriteSource;

    /**
     * Obtient la valeur de la propriété content.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContent() {
        return content;
    }

    /**
     * Définit la valeur de la propriété content.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContent(String value) {
        this.content = value;
    }

    /**
     * Obtient la valeur de la propriété autoriteExterne.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutoriteExterne() {
        return autoriteExterne;
    }

    /**
     * Définit la valeur de la propriété autoriteExterne.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutoriteExterne(String value) {
        this.autoriteExterne = value;
    }

    /**
     * Obtient la valeur de la propriété autoriteSource.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutoriteSource() {
        return autoriteSource;
    }

    /**
     * Définit la valeur de la propriété autoriteSource.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutoriteSource(String value) {
        this.autoriteSource = value;
    }

}
