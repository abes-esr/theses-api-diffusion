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
 *         &lt;element ref="{http://www.abes.fr/abes/documents/tef}vedetteRameauNomCommun" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://www.abes.fr/abes/documents/tef}vedetteRameauAuteurTitre" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://www.abes.fr/abes/documents/tef}vedetteRameauCollectivite" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://www.abes.fr/abes/documents/tef}vedetteRameauFamille" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://www.abes.fr/abes/documents/tef}vedetteRameauNomGeographique" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://www.abes.fr/abes/documents/tef}vedetteRameauPersonne" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://www.abes.fr/abes/documents/tef}vedetteRameauTitre" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang use="required""/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "vedetteRameauNomCommun",
    "vedetteRameauAuteurTitre",
    "vedetteRameauCollectivite",
    "vedetteRameauFamille",
    "vedetteRameauNomGeographique",
    "vedetteRameauPersonne",
    "vedetteRameauTitre"
})
@XmlRootElement(name = "sujetRameau")
public class SujetRameau {

    @XmlElement(required = true)
    protected List<VedetteRameauNomCommun> vedetteRameauNomCommun;
    @XmlElement(required = true)
    protected List<VedetteRameauAuteurTitre> vedetteRameauAuteurTitre;
    @XmlElement(required = true)
    protected List<VedetteRameauCollectivite> vedetteRameauCollectivite;
    @XmlElement(required = true)
    protected List<VedetteRameauFamille> vedetteRameauFamille;
    @XmlElement(required = true)
    protected List<VedetteRameauNomGeographique> vedetteRameauNomGeographique;
    @XmlElement(required = true)
    protected List<VedetteRameauPersonne> vedetteRameauPersonne;
    @XmlElement(required = true)
    protected List<VedetteRameauTitre> vedetteRameauTitre;
    @XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String lang;

    /**
     * Gets the value of the vedetteRameauNomCommun property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vedetteRameauNomCommun property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVedetteRameauNomCommun().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VedetteRameauNomCommun }
     * 
     * 
     */
    public List<VedetteRameauNomCommun> getVedetteRameauNomCommun() {
        if (vedetteRameauNomCommun == null) {
            vedetteRameauNomCommun = new ArrayList<VedetteRameauNomCommun>();
        }
        return this.vedetteRameauNomCommun;
    }

    /**
     * Gets the value of the vedetteRameauAuteurTitre property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vedetteRameauAuteurTitre property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVedetteRameauAuteurTitre().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VedetteRameauAuteurTitre }
     * 
     * 
     */
    public List<VedetteRameauAuteurTitre> getVedetteRameauAuteurTitre() {
        if (vedetteRameauAuteurTitre == null) {
            vedetteRameauAuteurTitre = new ArrayList<VedetteRameauAuteurTitre>();
        }
        return this.vedetteRameauAuteurTitre;
    }

    /**
     * Gets the value of the vedetteRameauCollectivite property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vedetteRameauCollectivite property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVedetteRameauCollectivite().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VedetteRameauCollectivite }
     * 
     * 
     */
    public List<VedetteRameauCollectivite> getVedetteRameauCollectivite() {
        if (vedetteRameauCollectivite == null) {
            vedetteRameauCollectivite = new ArrayList<VedetteRameauCollectivite>();
        }
        return this.vedetteRameauCollectivite;
    }

    /**
     * Gets the value of the vedetteRameauFamille property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vedetteRameauFamille property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVedetteRameauFamille().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VedetteRameauFamille }
     * 
     * 
     */
    public List<VedetteRameauFamille> getVedetteRameauFamille() {
        if (vedetteRameauFamille == null) {
            vedetteRameauFamille = new ArrayList<VedetteRameauFamille>();
        }
        return this.vedetteRameauFamille;
    }

    /**
     * Gets the value of the vedetteRameauNomGeographique property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vedetteRameauNomGeographique property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVedetteRameauNomGeographique().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VedetteRameauNomGeographique }
     * 
     * 
     */
    public List<VedetteRameauNomGeographique> getVedetteRameauNomGeographique() {
        if (vedetteRameauNomGeographique == null) {
            vedetteRameauNomGeographique = new ArrayList<VedetteRameauNomGeographique>();
        }
        return this.vedetteRameauNomGeographique;
    }

    /**
     * Gets the value of the vedetteRameauPersonne property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vedetteRameauPersonne property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVedetteRameauPersonne().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VedetteRameauPersonne }
     * 
     * 
     */
    public List<VedetteRameauPersonne> getVedetteRameauPersonne() {
        if (vedetteRameauPersonne == null) {
            vedetteRameauPersonne = new ArrayList<VedetteRameauPersonne>();
        }
        return this.vedetteRameauPersonne;
    }

    /**
     * Gets the value of the vedetteRameauTitre property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vedetteRameauTitre property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVedetteRameauTitre().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VedetteRameauTitre }
     * 
     * 
     */
    public List<VedetteRameauTitre> getVedetteRameauTitre() {
        if (vedetteRameauTitre == null) {
            vedetteRameauTitre = new ArrayList<VedetteRameauTitre>();
        }
        return this.vedetteRameauTitre;
    }

    /**
     * Obtient la valeur de la propriété lang.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang() {
        return lang;
    }

    /**
     * Définit la valeur de la propriété lang.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLang(String value) {
        this.lang = value;
    }

}
