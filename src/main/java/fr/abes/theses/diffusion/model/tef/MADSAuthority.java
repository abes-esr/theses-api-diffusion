//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2023.03.30 à 04:09:25 PM CEST 
//


package fr.abes.theses.diffusion.model.tef;

import javax.xml.bind.annotation.*;
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
 *         &lt;element ref="{http://www.abes.fr/abes/documents/tef}personMADS"/>
 *       &lt;/sequence>
 *       &lt;attribute name="authorityID" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "personMADS"
})
@XmlRootElement(name = "MADSAuthority")
public class MADSAuthority {

    @XmlElement(required = true)
    protected PersonMADS personMADS;
    @XmlAttribute(name = "authorityID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String authorityID;
    @XmlAttribute(name = "type", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String type;

    /**
     * Obtient la valeur de la propriété personMADS.
     * 
     * @return
     *     possible object is
     *     {@link PersonMADS }
     *     
     */
    public PersonMADS getPersonMADS() {
        return personMADS;
    }

    /**
     * Définit la valeur de la propriété personMADS.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonMADS }
     *     
     */
    public void setPersonMADS(PersonMADS value) {
        this.personMADS = value;
    }

    /**
     * Obtient la valeur de la propriété authorityID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorityID() {
        return authorityID;
    }

    /**
     * Définit la valeur de la propriété authorityID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorityID(String value) {
        this.authorityID = value;
    }

    /**
     * Obtient la valeur de la propriété type.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
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
    public void setType(String value) {
        this.type = value;
    }

}
