//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2023.03.30 à 04:09:25 PM CEST 
//


package fr.abes.theses.diffusion.model.tef;

import javax.xml.bind.annotation.*;
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
 *         &lt;element ref="{http://www.loc.gov/METS/}metsHdr"/>
 *         &lt;element ref="{http://www.loc.gov/METS/}dmdSec" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://www.loc.gov/METS/}amdSec" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://www.loc.gov/METS/}structMap"/>
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
    "metsHdr",
    "dmdSec",
    "amdSec",
    "structMap"
})
@XmlRootElement(name = "mets", namespace = "http://www.loc.gov/METS/")
public class Mets {

    @XmlElement(namespace = "http://www.loc.gov/METS/", required = true)
    protected MetsHdr metsHdr;
    @XmlElement(namespace = "http://www.loc.gov/METS/", required = true)
    protected List<DmdSec> dmdSec;
    @XmlElement(namespace = "http://www.loc.gov/METS/", required = true)
    protected List<AmdSec> amdSec;
    @XmlElement(namespace = "http://www.loc.gov/METS/", required = true)
    protected StructMap structMap;

    /**
     * Obtient la valeur de la propriété metsHdr.
     * 
     * @return
     *     possible object is
     *     {@link MetsHdr }
     *     
     */
    public MetsHdr getMetsHdr() {
        return metsHdr;
    }

    /**
     * Définit la valeur de la propriété metsHdr.
     * 
     * @param value
     *     allowed object is
     *     {@link MetsHdr }
     *     
     */
    public void setMetsHdr(MetsHdr value) {
        this.metsHdr = value;
    }

    /**
     * Gets the value of the dmdSec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dmdSec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDmdSec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DmdSec }
     * 
     * 
     */
    public List<DmdSec> getDmdSec() {
        if (dmdSec == null) {
            dmdSec = new ArrayList<DmdSec>();
        }
        return this.dmdSec;
    }

    /**
     * Gets the value of the amdSec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the amdSec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAmdSec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AmdSec }
     * 
     * 
     */
    public List<AmdSec> getAmdSec() {
        if (amdSec == null) {
            amdSec = new ArrayList<AmdSec>();
        }
        return this.amdSec;
    }

    /**
     * Obtient la valeur de la propriété structMap.
     * 
     * @return
     *     possible object is
     *     {@link StructMap }
     *     
     */
    public StructMap getStructMap() {
        return structMap;
    }

    /**
     * Définit la valeur de la propriété structMap.
     * 
     * @param value
     *     allowed object is
     *     {@link StructMap }
     *     
     */
    public void setStructMap(StructMap value) {
        this.structMap = value;
    }

}
