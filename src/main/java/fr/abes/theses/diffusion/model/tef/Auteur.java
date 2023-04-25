//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2023.03.30 à 04:09:25 PM CEST 
//


package fr.abes.theses.diffusion.model.tef;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.List;


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
 *         &lt;element ref="{http://www.abes.fr/abes/documents/tef}nom"/>
 *         &lt;element ref="{http://www.abes.fr/abes/documents/tef}prenom"/>
 *         &lt;element ref="{http://www.abes.fr/abes/documents/tef}dateNaissance"/>
 *         &lt;element ref="{http://www.abes.fr/abes/documents/tef}nationalite"/>
 *         &lt;element ref="{http://www.abes.fr/abes/documents/tef}autoriteExterne" maxOccurs="unbounded"/>
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
    "nom",
    "prenom",
    "dateNaissance",
    "nationalite",
    "autoriteExterne"
})
@XmlRootElement(name = "auteur")
public class Auteur {

    @XmlElement(required = true)
    protected String nom;
    @XmlElement(required = true)
    protected String prenom;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateNaissance;
    @XmlElement(required = true)
    protected Nationalite nationalite;
    @XmlElement(required = true)
    protected List<AutoriteExterne> autoriteExterne;

    /**
     * Obtient la valeur de la propriété nom.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNom() {
        return nom;
    }

    /**
     * Définit la valeur de la propriété nom.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNom(String value) {
        this.nom = value;
    }

    /**
     * Obtient la valeur de la propriété prenom.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * Définit la valeur de la propriété prenom.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrenom(String value) {
        this.prenom = value;
    }

    /**
     * Obtient la valeur de la propriété dateNaissance.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateNaissance() {
        return dateNaissance;
    }

    /**
     * Définit la valeur de la propriété dateNaissance.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateNaissance(XMLGregorianCalendar value) {
        this.dateNaissance = value;
    }

    /**
     * Obtient la valeur de la propriété nationalite.
     * 
     * @return
     *     possible object is
     *     {@link Nationalite }
     *     
     */
    public Nationalite getNationalite() {
        return nationalite;
    }

    /**
     * Définit la valeur de la propriété nationalite.
     * 
     * @param value
     *     allowed object is
     *     {@link Nationalite }
     *     
     */
    public void setNationalite(Nationalite value) {
        this.nationalite = value;
    }

    /**
     * Gets the value of the autoriteExterne property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the autoriteExterne property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAutoriteExterne().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AutoriteExterne }
     * 
     * 
     */
    public List<AutoriteExterne> getAutoriteExterne() {
        if (autoriteExterne == null) {
            autoriteExterne = new ArrayList<AutoriteExterne>();
        }
        return this.autoriteExterne;
    }

}
