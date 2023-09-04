//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2023.09.01 à 06:07:01 PM CEST 
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
 *         &lt;element ref="{http://www.abes.fr/abes/documents/tef}auteur" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://purl.org/dc/elements/1.1/}identifier" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://purl.org/dc/terms/}dateAccepted"/>
 *         &lt;element ref="{http://www.abes.fr/abes/documents/tef}thesis.degree"/>
 *         &lt;element ref="{http://www.abes.fr/abes/documents/tef}theseSurTravaux"/>
 *         &lt;element ref="{http://www.abes.fr/abes/documents/tef}avisJury"/>
 *         &lt;element ref="{http://www.abes.fr/abes/documents/tef}presidentJury"/>
 *         &lt;element ref="{http://www.abes.fr/abes/documents/tef}directeurThese" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://www.abes.fr/abes/documents/tef}membreJury" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://www.abes.fr/abes/documents/tef}rapporteur" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://www.abes.fr/abes/documents/tef}ecoleDoctorale" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://www.abes.fr/abes/documents/tef}partenaireRecherche" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://www.abes.fr/abes/documents/tef}oaiSetSpec" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://www.abes.fr/abes/documents/tef}MADSAuthority" maxOccurs="unbounded"/>
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
    "auteur",
    "identifier",
    "dateAccepted",
    "thesisDegree",
    "theseSurTravaux",
    "avisJury",
    "presidentJury",
    "directeurThese",
    "membreJury",
    "rapporteur",
    "ecoleDoctorale",
    "partenaireRecherche",
    "oaiSetSpec",
    "madsAuthority"
})
@XmlRootElement(name = "thesisAdmin")
public class ThesisAdmin {

    @XmlElement(required = true)
    protected List<Auteur> auteur;
    @XmlElement(namespace = "http://purl.org/dc/elements/1.1/", required = true)
    protected List<Identifier> identifier;
    @XmlElement(namespace = "http://purl.org/dc/terms/", required = true)
    protected DateAccepted dateAccepted;
    @XmlElement(name = "thesis.degree", required = true)
    protected ThesisDegree thesisDegree;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String theseSurTravaux;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String avisJury;
    @XmlElement(required = true)
    protected PresidentJury presidentJury;
    @XmlElement(required = true)
    protected List<DirecteurThese> directeurThese;
    @XmlElement(required = true)
    protected List<MembreJury> membreJury;
    @XmlElement(required = true)
    protected List<Rapporteur> rapporteur;
    @XmlElement(required = true)
    protected List<EcoleDoctorale> ecoleDoctorale;
    @XmlElement(required = true)
    protected List<PartenaireRecherche> partenaireRecherche;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected List<String> oaiSetSpec;
    @XmlElement(name = "MADSAuthority", required = true)
    protected List<MADSAuthority> madsAuthority;

    /**
     * Gets the value of the auteur property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the auteur property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuteur().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Auteur }
     * 
     * 
     */
    public List<Auteur> getAuteur() {
        if (auteur == null) {
            auteur = new ArrayList<Auteur>();
        }
        return this.auteur;
    }

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
     * Obtient la valeur de la propriété dateAccepted.
     * 
     * @return
     *     possible object is
     *     {@link DateAccepted }
     *     
     */
    public DateAccepted getDateAccepted() {
        return dateAccepted;
    }

    /**
     * Définit la valeur de la propriété dateAccepted.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAccepted }
     *     
     */
    public void setDateAccepted(DateAccepted value) {
        this.dateAccepted = value;
    }

    /**
     * Obtient la valeur de la propriété thesisDegree.
     * 
     * @return
     *     possible object is
     *     {@link ThesisDegree }
     *     
     */
    public ThesisDegree getThesisDegree() {
        return thesisDegree;
    }

    /**
     * Définit la valeur de la propriété thesisDegree.
     * 
     * @param value
     *     allowed object is
     *     {@link ThesisDegree }
     *     
     */
    public void setThesisDegree(ThesisDegree value) {
        this.thesisDegree = value;
    }

    /**
     * Obtient la valeur de la propriété theseSurTravaux.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTheseSurTravaux() {
        return theseSurTravaux;
    }

    /**
     * Définit la valeur de la propriété theseSurTravaux.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTheseSurTravaux(String value) {
        this.theseSurTravaux = value;
    }

    /**
     * Obtient la valeur de la propriété avisJury.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvisJury() {
        return avisJury;
    }

    /**
     * Définit la valeur de la propriété avisJury.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvisJury(String value) {
        this.avisJury = value;
    }

    /**
     * Obtient la valeur de la propriété presidentJury.
     * 
     * @return
     *     possible object is
     *     {@link PresidentJury }
     *     
     */
    public PresidentJury getPresidentJury() {
        return presidentJury;
    }

    /**
     * Définit la valeur de la propriété presidentJury.
     * 
     * @param value
     *     allowed object is
     *     {@link PresidentJury }
     *     
     */
    public void setPresidentJury(PresidentJury value) {
        this.presidentJury = value;
    }

    /**
     * Gets the value of the directeurThese property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the directeurThese property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDirecteurThese().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DirecteurThese }
     * 
     * 
     */
    public List<DirecteurThese> getDirecteurThese() {
        if (directeurThese == null) {
            directeurThese = new ArrayList<DirecteurThese>();
        }
        return this.directeurThese;
    }

    /**
     * Gets the value of the membreJury property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the membreJury property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMembreJury().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MembreJury }
     * 
     * 
     */
    public List<MembreJury> getMembreJury() {
        if (membreJury == null) {
            membreJury = new ArrayList<MembreJury>();
        }
        return this.membreJury;
    }

    /**
     * Gets the value of the rapporteur property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rapporteur property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRapporteur().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Rapporteur }
     * 
     * 
     */
    public List<Rapporteur> getRapporteur() {
        if (rapporteur == null) {
            rapporteur = new ArrayList<Rapporteur>();
        }
        return this.rapporteur;
    }

    /**
     * Gets the value of the ecoleDoctorale property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ecoleDoctorale property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEcoleDoctorale().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EcoleDoctorale }
     * 
     * 
     */
    public List<EcoleDoctorale> getEcoleDoctorale() {
        if (ecoleDoctorale == null) {
            ecoleDoctorale = new ArrayList<EcoleDoctorale>();
        }
        return this.ecoleDoctorale;
    }

    /**
     * Gets the value of the partenaireRecherche property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partenaireRecherche property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartenaireRecherche().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartenaireRecherche }
     * 
     * 
     */
    public List<PartenaireRecherche> getPartenaireRecherche() {
        if (partenaireRecherche == null) {
            partenaireRecherche = new ArrayList<PartenaireRecherche>();
        }
        return this.partenaireRecherche;
    }

    /**
     * Gets the value of the oaiSetSpec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the oaiSetSpec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOaiSetSpec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getOaiSetSpec() {
        if (oaiSetSpec == null) {
            oaiSetSpec = new ArrayList<String>();
        }
        return this.oaiSetSpec;
    }

    /**
     * Gets the value of the madsAuthority property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the madsAuthority property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMADSAuthority().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MADSAuthority }
     * 
     * 
     */
    public List<MADSAuthority> getMADSAuthority() {
        if (madsAuthority == null) {
            madsAuthority = new ArrayList<MADSAuthority>();
        }
        return this.madsAuthority;
    }

}
