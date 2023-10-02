//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2023.09.29 à 06:05:38 PM CEST 
//


package fr.abes.theses.diffusion.model.tef;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element ref="{http://purl.org/dc/elements/1.1/}identifier" maxOccurs="unbounded"/>
 *         &lt;sequence minOccurs="0">
 *           &lt;element ref="{http://www.theses.fr/namespace/tefudoc}ISBN"/>
 *           &lt;element ref="{http://www.theses.fr/namespace/tefudoc}collation"/>
 *           &lt;element ref="{http://www.theses.fr/namespace/tefudoc}biblioIndex"/>
 *           &lt;element ref="{http://www.theses.fr/namespace/tefudoc}noteGenerale"/>
 *           &lt;element ref="{http://www.theses.fr/namespace/tefudoc}exemplaires"/>
 *         &lt;/sequence>
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
    "identifier",
    "isbn",
    "collation",
    "biblioIndex",
    "noteGenerale",
    "exemplaires"
})
@XmlRootElement(name = "edition")
public class Edition {

    @XmlElement(namespace = "http://purl.org/dc/elements/1.1/", required = true)
    protected List<Identifier> identifier;
    @XmlElement(name = "ISBN", namespace = "http://www.theses.fr/namespace/tefudoc")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String isbn;
    @XmlElement(namespace = "http://www.theses.fr/namespace/tefudoc")
    protected String collation;
    @XmlElement(namespace = "http://www.theses.fr/namespace/tefudoc")
    protected String biblioIndex;
    @XmlElement(namespace = "http://www.theses.fr/namespace/tefudoc")
    protected String noteGenerale;
    @XmlElement(namespace = "http://www.theses.fr/namespace/tefudoc")
    protected Exemplaires exemplaires;

    /**
     * Gets the value of the identifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the identifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Identifier }
     * 
     * 
     */
    public List<Identifier> getIdentifier() {
        if (identifier == null) {
            identifier = new ArrayList<Identifier>();
        }
        return this.identifier;
    }

    /**
     * Obtient la valeur de la propriété isbn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISBN() {
        return isbn;
    }

    /**
     * Définit la valeur de la propriété isbn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISBN(String value) {
        this.isbn = value;
    }

    /**
     * Obtient la valeur de la propriété collation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollation() {
        return collation;
    }

    /**
     * Définit la valeur de la propriété collation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollation(String value) {
        this.collation = value;
    }

    /**
     * Obtient la valeur de la propriété biblioIndex.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBiblioIndex() {
        return biblioIndex;
    }

    /**
     * Définit la valeur de la propriété biblioIndex.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBiblioIndex(String value) {
        this.biblioIndex = value;
    }

    /**
     * Obtient la valeur de la propriété noteGenerale.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoteGenerale() {
        return noteGenerale;
    }

    /**
     * Définit la valeur de la propriété noteGenerale.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoteGenerale(String value) {
        this.noteGenerale = value;
    }

    /**
     * Obtient la valeur de la propriété exemplaires.
     * 
     * @return
     *     possible object is
     *     {@link Exemplaires }
     *     
     */
    public Exemplaires getExemplaires() {
        return exemplaires;
    }

    /**
     * Définit la valeur de la propriété exemplaires.
     * 
     * @param value
     *     allowed object is
     *     {@link Exemplaires }
     *     
     */
    public void setExemplaires(Exemplaires value) {
        this.exemplaires = value;
    }

}
