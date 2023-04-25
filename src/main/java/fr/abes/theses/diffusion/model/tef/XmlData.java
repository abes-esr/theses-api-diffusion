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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://www.abes.fr/abes/documents/tef}edition"/>
 *         &lt;element ref="{http://www.abes.fr/abes/documents/tef}thesisAdmin"/>
 *         &lt;element ref="{http://www.abes.fr/abes/documents/tef}thesisRecord"/>
 *         &lt;sequence>
 *           &lt;element name="star_gestion" form="unqualified">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="traitements" form="unqualified">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="entree" form="unqualified">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;attribute name="agentImport" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *                                       &lt;attribute name="completudeImport" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *                                       &lt;attribute name="date" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *                                       &lt;attribute name="idSource" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                       &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="step" form="unqualified">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;attribute name="agentImport" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                       &lt;attribute name="date" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                       &lt;attribute name="idStep" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="maj" form="unqualified">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;attribute name="BIBL" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *                                       &lt;attribute name="FICH" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *                                       &lt;attribute name="SCOL" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *                                       &lt;attribute name="VALID" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *                                       &lt;attribute name="date" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *                                       &lt;attribute name="import" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="facile" form="unqualified">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;attribute name="BIBL" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *                                       &lt;attribute name="FICH" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *                                       &lt;attribute name="SCOL" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *                                       &lt;attribute name="VALID" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *                                       &lt;attribute name="date" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *                                       &lt;attribute name="import" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *                                       &lt;attribute name="indicFacile" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *                                       &lt;attribute name="trace" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="ctrlUrl" form="unqualified">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;attribute name="date" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                       &lt;attribute name="erreurUrl" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *                                       &lt;attribute name="indicCtrlUrl" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="remonteeArchive" form="unqualified">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;attribute name="date" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                       &lt;attribute name="indicRemonteeArchive" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *                                       &lt;attribute name="trace" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="purge" form="unqualified">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;attribute name="date" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                       &lt;attribute name="indicPurge" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="invalidation" form="unqualified">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;attribute name="date" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                       &lt;attribute name="indicInvalidation" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *                                       &lt;attribute name="note" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="sorties" form="unqualified">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="cines" form="unqualified">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 &lt;attribute name="dateCines" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *                                                 &lt;attribute name="indicCines" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *                                                 &lt;attribute name="trace" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                               &lt;/restriction>
 *                                             &lt;/complexContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                         &lt;element name="sudoc" form="unqualified">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 &lt;sequence>
 *                                                   &lt;element name="RCR" form="unqualified">
 *                                                     &lt;complexType>
 *                                                       &lt;complexContent>
 *                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                           &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *                                                         &lt;/restriction>
 *                                                       &lt;/complexContent>
 *                                                     &lt;/complexType>
 *                                                   &lt;/element>
 *                                                   &lt;element name="EPN" form="unqualified">
 *                                                     &lt;complexType>
 *                                                       &lt;complexContent>
 *                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;/restriction>
 *                                                       &lt;/complexContent>
 *                                                     &lt;/complexType>
 *                                                   &lt;/element>
 *                                                 &lt;/sequence>
 *                                                 &lt;attribute name="PPN" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *                                                 &lt;attribute name="dateSudoc" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *                                                 &lt;attribute name="indicSudoc" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *                                                 &lt;attribute name="majSudoc" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *                                                 &lt;attribute name="trace" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                               &lt;/restriction>
 *                                             &lt;/complexContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                         &lt;element name="diffusion" form="unqualified">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 &lt;sequence>
 *                                                   &lt;element name="etabDiffuseur" form="unqualified">
 *                                                     &lt;complexType>
 *                                                       &lt;complexContent>
 *                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                           &lt;sequence>
 *                                                             &lt;element name="urlEtabDiffuseur" form="unqualified">
 *                                                               &lt;complexType>
 *                                                                 &lt;complexContent>
 *                                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                     &lt;attribute name="majUrlEtabDiffuseur" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                                                   &lt;/restriction>
 *                                                                 &lt;/complexContent>
 *                                                               &lt;/complexType>
 *                                                             &lt;/element>
 *                                                           &lt;/sequence>
 *                                                           &lt;attribute name="editeurScientifiqueLieu" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                                           &lt;attribute name="editeurScientifiqueNom" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                                           &lt;attribute name="etabDiffuseurPolEtablissement" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *                                                         &lt;/restriction>
 *                                                       &lt;/complexContent>
 *                                                     &lt;/complexType>
 *                                                   &lt;/element>
 *                                                   &lt;element name="abesDiffuseur" form="unqualified">
 *                                                     &lt;complexType>
 *                                                       &lt;complexContent>
 *                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                           &lt;attribute name="FichEtabDiffAbesIntranet" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *                                                           &lt;attribute name="abesDiffuseurPolEtablissement" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *                                                           &lt;attribute name="dateAbesDiffuseur" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *                                                           &lt;attribute name="indicAbesDiffuseur" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *                                                           &lt;attribute name="majAbesDiffuseur" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *                                                           &lt;attribute name="urlAbesDiffuseur" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                                         &lt;/restriction>
 *                                                       &lt;/complexContent>
 *                                                     &lt;/complexType>
 *                                                   &lt;/element>
 *                                                   &lt;element name="ccsd" form="unqualified">
 *                                                     &lt;complexType>
 *                                                       &lt;complexContent>
 *                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                           &lt;attribute name="ccsdDiffuseurPolEtablissement" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *                                                           &lt;attribute name="dateCcsd" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                                           &lt;attribute name="identifiantCcsd" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                                           &lt;attribute name="indicCcsd" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *                                                           &lt;attribute name="majCcsd" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                                           &lt;attribute name="numVersion" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                                           &lt;attribute name="pwdCcsd" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                                           &lt;attribute name="trace" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                                           &lt;attribute name="urlCcsd" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                                         &lt;/restriction>
 *                                                       &lt;/complexContent>
 *                                                     &lt;/complexType>
 *                                                   &lt;/element>
 *                                                   &lt;element name="autresEtabDiffuseurs" form="unqualified">
 *                                                     &lt;complexType>
 *                                                       &lt;complexContent>
 *                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;/restriction>
 *                                                       &lt;/complexContent>
 *                                                     &lt;/complexType>
 *                                                   &lt;/element>
 *                                                   &lt;element name="oai" form="unqualified">
 *                                                     &lt;complexType>
 *                                                       &lt;complexContent>
 *                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                           &lt;attribute name="dateOai" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *                                                           &lt;attribute name="indicOai" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *                                                           &lt;attribute name="majOai" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *                                                           &lt;attribute name="trace" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                                         &lt;/restriction>
 *                                                       &lt;/complexContent>
 *                                                     &lt;/complexType>
 *                                                   &lt;/element>
 *                                                 &lt;/sequence>
 *                                                 &lt;attribute name="conformitePolDiffusion" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *                                                 &lt;attribute name="restrictionTemporelleFin" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                                 &lt;attribute name="restrictionTemporelleType" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *                                                 &lt;attribute name="typeDiffusion" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *                                                 &lt;attribute name="urlPerenne" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *                                               &lt;/restriction>
 *                                             &lt;/complexContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                       &lt;/sequence>
 *                                       &lt;attribute name="date" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                             &lt;/sequence>
 *                             &lt;attribute name="scenario" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                   &lt;/sequence>
 *                   &lt;attribute name="ID_THESE" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *                   &lt;attribute name="codeEtab" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *                   &lt;attribute name="enProd" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *                   &lt;attribute name="etat" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *                   &lt;attribute name="libEtab" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                   &lt;attribute name="ppnEtab" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *                   &lt;attribute name="scenarioEtab" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="step_gestion" form="unqualified">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;attribute name="stepEtat" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/sequence>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "edition",
    "thesisAdmin",
    "thesisRecord",
    "starGestion",
    "stepGestion"
})
@XmlRootElement(name = "xmlData", namespace = "http://www.loc.gov/METS/")
public class XmlData {

    protected Edition edition;
    protected ThesisAdmin thesisAdmin;
    protected ThesisRecord thesisRecord;
    @XmlElement(name = "star_gestion", namespace = "")
    protected XmlData.StarGestion starGestion;
    @XmlElement(name = "step_gestion", namespace = "")
    protected XmlData.StepGestion stepGestion;

    /**
     * Obtient la valeur de la propriété edition.
     * 
     * @return
     *     possible object is
     *     {@link Edition }
     *     
     */
    public Edition getEdition() {
        return edition;
    }

    /**
     * Définit la valeur de la propriété edition.
     * 
     * @param value
     *     allowed object is
     *     {@link Edition }
     *     
     */
    public void setEdition(Edition value) {
        this.edition = value;
    }

    /**
     * Obtient la valeur de la propriété thesisAdmin.
     * 
     * @return
     *     possible object is
     *     {@link ThesisAdmin }
     *     
     */
    public ThesisAdmin getThesisAdmin() {
        return thesisAdmin;
    }

    /**
     * Définit la valeur de la propriété thesisAdmin.
     * 
     * @param value
     *     allowed object is
     *     {@link ThesisAdmin }
     *     
     */
    public void setThesisAdmin(ThesisAdmin value) {
        this.thesisAdmin = value;
    }

    /**
     * Obtient la valeur de la propriété thesisRecord.
     * 
     * @return
     *     possible object is
     *     {@link ThesisRecord }
     *     
     */
    public ThesisRecord getThesisRecord() {
        return thesisRecord;
    }

    /**
     * Définit la valeur de la propriété thesisRecord.
     * 
     * @param value
     *     allowed object is
     *     {@link ThesisRecord }
     *     
     */
    public void setThesisRecord(ThesisRecord value) {
        this.thesisRecord = value;
    }

    /**
     * Obtient la valeur de la propriété starGestion.
     * 
     * @return
     *     possible object is
     *     {@link StarGestion }
     *     
     */
    public StarGestion getStarGestion() {
        return starGestion;
    }

    /**
     * Définit la valeur de la propriété starGestion.
     * 
     * @param value
     *     allowed object is
     *     {@link StarGestion }
     *     
     */
    public void setStarGestion(StarGestion value) {
        this.starGestion = value;
    }

    /**
     * Obtient la valeur de la propriété stepGestion.
     * 
     * @return
     *     possible object is
     *     {@link StepGestion }
     *     
     */
    public StepGestion getStepGestion() {
        return stepGestion;
    }

    /**
     * Définit la valeur de la propriété stepGestion.
     * 
     * @param value
     *     allowed object is
     *     {@link StepGestion }
     *     
     */
    public void setStepGestion(StepGestion value) {
        this.stepGestion = value;
    }


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
     *         &lt;element name="traitements" form="unqualified">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="entree" form="unqualified">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="agentImport" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
     *                           &lt;attribute name="completudeImport" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
     *                           &lt;attribute name="date" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *                           &lt;attribute name="idSource" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                           &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="step" form="unqualified">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="agentImport" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                           &lt;attribute name="date" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                           &lt;attribute name="idStep" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="maj" form="unqualified">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="BIBL" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
     *                           &lt;attribute name="FICH" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
     *                           &lt;attribute name="SCOL" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
     *                           &lt;attribute name="VALID" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
     *                           &lt;attribute name="date" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *                           &lt;attribute name="import" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="facile" form="unqualified">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="BIBL" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
     *                           &lt;attribute name="FICH" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
     *                           &lt;attribute name="SCOL" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
     *                           &lt;attribute name="VALID" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
     *                           &lt;attribute name="date" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *                           &lt;attribute name="import" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
     *                           &lt;attribute name="indicFacile" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
     *                           &lt;attribute name="trace" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="ctrlUrl" form="unqualified">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="date" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                           &lt;attribute name="erreurUrl" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
     *                           &lt;attribute name="indicCtrlUrl" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="remonteeArchive" form="unqualified">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="date" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                           &lt;attribute name="indicRemonteeArchive" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
     *                           &lt;attribute name="trace" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="purge" form="unqualified">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="date" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                           &lt;attribute name="indicPurge" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="invalidation" form="unqualified">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="date" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                           &lt;attribute name="indicInvalidation" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
     *                           &lt;attribute name="note" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="sorties" form="unqualified">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="cines" form="unqualified">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="dateCines" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *                                     &lt;attribute name="indicCines" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
     *                                     &lt;attribute name="trace" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="sudoc" form="unqualified">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="RCR" form="unqualified">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="EPN" form="unqualified">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                     &lt;attribute name="PPN" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
     *                                     &lt;attribute name="dateSudoc" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *                                     &lt;attribute name="indicSudoc" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
     *                                     &lt;attribute name="majSudoc" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *                                     &lt;attribute name="trace" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="diffusion" form="unqualified">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="etabDiffuseur" form="unqualified">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="urlEtabDiffuseur" form="unqualified">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;attribute name="majUrlEtabDiffuseur" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                               &lt;/sequence>
     *                                               &lt;attribute name="editeurScientifiqueLieu" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                                               &lt;attribute name="editeurScientifiqueNom" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                                               &lt;attribute name="etabDiffuseurPolEtablissement" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="abesDiffuseur" form="unqualified">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;attribute name="FichEtabDiffAbesIntranet" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
     *                                               &lt;attribute name="abesDiffuseurPolEtablissement" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
     *                                               &lt;attribute name="dateAbesDiffuseur" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *                                               &lt;attribute name="indicAbesDiffuseur" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
     *                                               &lt;attribute name="majAbesDiffuseur" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *                                               &lt;attribute name="urlAbesDiffuseur" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="ccsd" form="unqualified">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;attribute name="ccsdDiffuseurPolEtablissement" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
     *                                               &lt;attribute name="dateCcsd" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                                               &lt;attribute name="identifiantCcsd" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                                               &lt;attribute name="indicCcsd" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
     *                                               &lt;attribute name="majCcsd" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                                               &lt;attribute name="numVersion" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                                               &lt;attribute name="pwdCcsd" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                                               &lt;attribute name="trace" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                                               &lt;attribute name="urlCcsd" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="autresEtabDiffuseurs" form="unqualified">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="oai" form="unqualified">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;attribute name="dateOai" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *                                               &lt;attribute name="indicOai" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
     *                                               &lt;attribute name="majOai" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *                                               &lt;attribute name="trace" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                     &lt;attribute name="conformitePolDiffusion" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
     *                                     &lt;attribute name="restrictionTemporelleFin" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                                     &lt;attribute name="restrictionTemporelleType" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
     *                                     &lt;attribute name="typeDiffusion" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
     *                                     &lt;attribute name="urlPerenne" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                           &lt;attribute name="date" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="scenario" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="ID_THESE" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
     *       &lt;attribute name="codeEtab" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
     *       &lt;attribute name="enProd" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
     *       &lt;attribute name="etat" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
     *       &lt;attribute name="libEtab" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *       &lt;attribute name="ppnEtab" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
     *       &lt;attribute name="scenarioEtab" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "traitements"
    })
    public static class StarGestion {

        @XmlElement(namespace = "", required = true)
        protected XmlData.StarGestion.Traitements traitements;
        @XmlAttribute(name = "ID_THESE", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "NCName")
        protected String idthese;
        @XmlAttribute(name = "codeEtab", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "NCName")
        protected String codeEtab;
        @XmlAttribute(name = "enProd", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "NCName")
        protected String enProd;
        @XmlAttribute(name = "etat", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "NCName")
        protected String etat;
        @XmlAttribute(name = "libEtab", required = true)
        @XmlSchemaType(name = "anySimpleType")
        protected String libEtab;
        @XmlAttribute(name = "ppnEtab", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "NMTOKEN")
        protected String ppnEtab;
        @XmlAttribute(name = "scenarioEtab", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "NCName")
        protected String scenarioEtab;

        /**
         * Obtient la valeur de la propriété traitements.
         * 
         * @return
         *     possible object is
         *     {@link Traitements }
         *     
         */
        public Traitements getTraitements() {
            return traitements;
        }

        /**
         * Définit la valeur de la propriété traitements.
         * 
         * @param value
         *     allowed object is
         *     {@link Traitements }
         *     
         */
        public void setTraitements(Traitements value) {
            this.traitements = value;
        }

        /**
         * Obtient la valeur de la propriété idthese.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIDTHESE() {
            return idthese;
        }

        /**
         * Définit la valeur de la propriété idthese.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIDTHESE(String value) {
            this.idthese = value;
        }

        /**
         * Obtient la valeur de la propriété codeEtab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCodeEtab() {
            return codeEtab;
        }

        /**
         * Définit la valeur de la propriété codeEtab.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCodeEtab(String value) {
            this.codeEtab = value;
        }

        /**
         * Obtient la valeur de la propriété enProd.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEnProd() {
            return enProd;
        }

        /**
         * Définit la valeur de la propriété enProd.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEnProd(String value) {
            this.enProd = value;
        }

        /**
         * Obtient la valeur de la propriété etat.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEtat() {
            return etat;
        }

        /**
         * Définit la valeur de la propriété etat.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEtat(String value) {
            this.etat = value;
        }

        /**
         * Obtient la valeur de la propriété libEtab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLibEtab() {
            return libEtab;
        }

        /**
         * Définit la valeur de la propriété libEtab.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLibEtab(String value) {
            this.libEtab = value;
        }

        /**
         * Obtient la valeur de la propriété ppnEtab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPpnEtab() {
            return ppnEtab;
        }

        /**
         * Définit la valeur de la propriété ppnEtab.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPpnEtab(String value) {
            this.ppnEtab = value;
        }

        /**
         * Obtient la valeur de la propriété scenarioEtab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getScenarioEtab() {
            return scenarioEtab;
        }

        /**
         * Définit la valeur de la propriété scenarioEtab.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setScenarioEtab(String value) {
            this.scenarioEtab = value;
        }


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
         *         &lt;element name="entree" form="unqualified">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="agentImport" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
         *                 &lt;attribute name="completudeImport" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
         *                 &lt;attribute name="date" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
         *                 &lt;attribute name="idSource" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                 &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="step" form="unqualified">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="agentImport" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                 &lt;attribute name="date" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                 &lt;attribute name="idStep" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="maj" form="unqualified">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="BIBL" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
         *                 &lt;attribute name="FICH" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
         *                 &lt;attribute name="SCOL" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
         *                 &lt;attribute name="VALID" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
         *                 &lt;attribute name="date" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
         *                 &lt;attribute name="import" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="facile" form="unqualified">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="BIBL" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
         *                 &lt;attribute name="FICH" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
         *                 &lt;attribute name="SCOL" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
         *                 &lt;attribute name="VALID" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
         *                 &lt;attribute name="date" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
         *                 &lt;attribute name="import" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
         *                 &lt;attribute name="indicFacile" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
         *                 &lt;attribute name="trace" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="ctrlUrl" form="unqualified">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="date" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                 &lt;attribute name="erreurUrl" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
         *                 &lt;attribute name="indicCtrlUrl" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="remonteeArchive" form="unqualified">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="date" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                 &lt;attribute name="indicRemonteeArchive" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
         *                 &lt;attribute name="trace" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="purge" form="unqualified">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="date" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                 &lt;attribute name="indicPurge" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="invalidation" form="unqualified">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="date" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                 &lt;attribute name="indicInvalidation" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
         *                 &lt;attribute name="note" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="sorties" form="unqualified">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="cines" form="unqualified">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="dateCines" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
         *                           &lt;attribute name="indicCines" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
         *                           &lt;attribute name="trace" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="sudoc" form="unqualified">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="RCR" form="unqualified">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="EPN" form="unqualified">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                           &lt;attribute name="PPN" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
         *                           &lt;attribute name="dateSudoc" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
         *                           &lt;attribute name="indicSudoc" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
         *                           &lt;attribute name="majSudoc" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
         *                           &lt;attribute name="trace" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="diffusion" form="unqualified">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="etabDiffuseur" form="unqualified">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="urlEtabDiffuseur" form="unqualified">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;attribute name="majUrlEtabDiffuseur" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                     &lt;/sequence>
         *                                     &lt;attribute name="editeurScientifiqueLieu" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                                     &lt;attribute name="editeurScientifiqueNom" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                                     &lt;attribute name="etabDiffuseurPolEtablissement" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="abesDiffuseur" form="unqualified">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;attribute name="FichEtabDiffAbesIntranet" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
         *                                     &lt;attribute name="abesDiffuseurPolEtablissement" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
         *                                     &lt;attribute name="dateAbesDiffuseur" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
         *                                     &lt;attribute name="indicAbesDiffuseur" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
         *                                     &lt;attribute name="majAbesDiffuseur" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
         *                                     &lt;attribute name="urlAbesDiffuseur" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="ccsd" form="unqualified">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;attribute name="ccsdDiffuseurPolEtablissement" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
         *                                     &lt;attribute name="dateCcsd" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                                     &lt;attribute name="identifiantCcsd" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                                     &lt;attribute name="indicCcsd" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
         *                                     &lt;attribute name="majCcsd" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                                     &lt;attribute name="numVersion" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                                     &lt;attribute name="pwdCcsd" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                                     &lt;attribute name="trace" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                                     &lt;attribute name="urlCcsd" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="autresEtabDiffuseurs" form="unqualified">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="oai" form="unqualified">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;attribute name="dateOai" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
         *                                     &lt;attribute name="indicOai" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
         *                                     &lt;attribute name="majOai" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
         *                                     &lt;attribute name="trace" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                           &lt;attribute name="conformitePolDiffusion" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
         *                           &lt;attribute name="restrictionTemporelleFin" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                           &lt;attribute name="restrictionTemporelleType" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
         *                           &lt;attribute name="typeDiffusion" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
         *                           &lt;attribute name="urlPerenne" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *                 &lt;attribute name="date" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="scenario" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "entree",
            "step",
            "maj",
            "facile",
            "ctrlUrl",
            "remonteeArchive",
            "purge",
            "invalidation",
            "sorties"
        })
        public static class Traitements {

            @XmlElement(namespace = "", required = true)
            protected XmlData.StarGestion.Traitements.Entree entree;
            @XmlElement(namespace = "", required = true)
            protected XmlData.StarGestion.Traitements.Step step;
            @XmlElement(namespace = "", required = true)
            protected XmlData.StarGestion.Traitements.Maj maj;
            @XmlElement(namespace = "", required = true)
            protected XmlData.StarGestion.Traitements.Facile facile;
            @XmlElement(namespace = "", required = true)
            protected XmlData.StarGestion.Traitements.CtrlUrl ctrlUrl;
            @XmlElement(namespace = "", required = true)
            protected XmlData.StarGestion.Traitements.RemonteeArchive remonteeArchive;
            @XmlElement(namespace = "", required = true)
            protected XmlData.StarGestion.Traitements.Purge purge;
            @XmlElement(namespace = "", required = true)
            protected XmlData.StarGestion.Traitements.Invalidation invalidation;
            @XmlElement(namespace = "", required = true)
            protected XmlData.StarGestion.Traitements.Sorties sorties;
            @XmlAttribute(name = "scenario", required = true)
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "NCName")
            protected String scenario;

            /**
             * Obtient la valeur de la propriété entree.
             * 
             * @return
             *     possible object is
             *     {@link Entree }
             *     
             */
            public Entree getEntree() {
                return entree;
            }

            /**
             * Définit la valeur de la propriété entree.
             * 
             * @param value
             *     allowed object is
             *     {@link Entree }
             *     
             */
            public void setEntree(Entree value) {
                this.entree = value;
            }

            /**
             * Obtient la valeur de la propriété step.
             * 
             * @return
             *     possible object is
             *     {@link Step }
             *     
             */
            public Step getStep() {
                return step;
            }

            /**
             * Définit la valeur de la propriété step.
             * 
             * @param value
             *     allowed object is
             *     {@link Step }
             *     
             */
            public void setStep(Step value) {
                this.step = value;
            }

            /**
             * Obtient la valeur de la propriété maj.
             * 
             * @return
             *     possible object is
             *     {@link Maj }
             *     
             */
            public Maj getMaj() {
                return maj;
            }

            /**
             * Définit la valeur de la propriété maj.
             * 
             * @param value
             *     allowed object is
             *     {@link Maj }
             *     
             */
            public void setMaj(Maj value) {
                this.maj = value;
            }

            /**
             * Obtient la valeur de la propriété facile.
             * 
             * @return
             *     possible object is
             *     {@link Facile }
             *     
             */
            public Facile getFacile() {
                return facile;
            }

            /**
             * Définit la valeur de la propriété facile.
             * 
             * @param value
             *     allowed object is
             *     {@link Facile }
             *     
             */
            public void setFacile(Facile value) {
                this.facile = value;
            }

            /**
             * Obtient la valeur de la propriété ctrlUrl.
             * 
             * @return
             *     possible object is
             *     {@link CtrlUrl }
             *     
             */
            public CtrlUrl getCtrlUrl() {
                return ctrlUrl;
            }

            /**
             * Définit la valeur de la propriété ctrlUrl.
             * 
             * @param value
             *     allowed object is
             *     {@link CtrlUrl }
             *     
             */
            public void setCtrlUrl(CtrlUrl value) {
                this.ctrlUrl = value;
            }

            /**
             * Obtient la valeur de la propriété remonteeArchive.
             * 
             * @return
             *     possible object is
             *     {@link RemonteeArchive }
             *     
             */
            public RemonteeArchive getRemonteeArchive() {
                return remonteeArchive;
            }

            /**
             * Définit la valeur de la propriété remonteeArchive.
             * 
             * @param value
             *     allowed object is
             *     {@link RemonteeArchive }
             *     
             */
            public void setRemonteeArchive(RemonteeArchive value) {
                this.remonteeArchive = value;
            }

            /**
             * Obtient la valeur de la propriété purge.
             * 
             * @return
             *     possible object is
             *     {@link Purge }
             *     
             */
            public Purge getPurge() {
                return purge;
            }

            /**
             * Définit la valeur de la propriété purge.
             * 
             * @param value
             *     allowed object is
             *     {@link Purge }
             *     
             */
            public void setPurge(Purge value) {
                this.purge = value;
            }

            /**
             * Obtient la valeur de la propriété invalidation.
             * 
             * @return
             *     possible object is
             *     {@link Invalidation }
             *     
             */
            public Invalidation getInvalidation() {
                return invalidation;
            }

            /**
             * Définit la valeur de la propriété invalidation.
             * 
             * @param value
             *     allowed object is
             *     {@link Invalidation }
             *     
             */
            public void setInvalidation(Invalidation value) {
                this.invalidation = value;
            }

            /**
             * Obtient la valeur de la propriété sorties.
             * 
             * @return
             *     possible object is
             *     {@link Sorties }
             *     
             */
            public Sorties getSorties() {
                return sorties;
            }

            /**
             * Définit la valeur de la propriété sorties.
             * 
             * @param value
             *     allowed object is
             *     {@link Sorties }
             *     
             */
            public void setSorties(Sorties value) {
                this.sorties = value;
            }

            /**
             * Obtient la valeur de la propriété scenario.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getScenario() {
                return scenario;
            }

            /**
             * Définit la valeur de la propriété scenario.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setScenario(String value) {
                this.scenario = value;
            }


            /**
             * <p>Classe Java pour anonymous complex type.
             * 
             * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;attribute name="date" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *       &lt;attribute name="erreurUrl" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *       &lt;attribute name="indicCtrlUrl" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class CtrlUrl {

                @XmlAttribute(name = "date", required = true)
                @XmlSchemaType(name = "anySimpleType")
                protected String date;
                @XmlAttribute(name = "erreurUrl", required = true)
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "NCName")
                protected String erreurUrl;
                @XmlAttribute(name = "indicCtrlUrl", required = true)
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "NCName")
                protected String indicCtrlUrl;

                /**
                 * Obtient la valeur de la propriété date.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDate() {
                    return date;
                }

                /**
                 * Définit la valeur de la propriété date.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDate(String value) {
                    this.date = value;
                }

                /**
                 * Obtient la valeur de la propriété erreurUrl.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getErreurUrl() {
                    return erreurUrl;
                }

                /**
                 * Définit la valeur de la propriété erreurUrl.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setErreurUrl(String value) {
                    this.erreurUrl = value;
                }

                /**
                 * Obtient la valeur de la propriété indicCtrlUrl.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getIndicCtrlUrl() {
                    return indicCtrlUrl;
                }

                /**
                 * Définit la valeur de la propriété indicCtrlUrl.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setIndicCtrlUrl(String value) {
                    this.indicCtrlUrl = value;
                }

            }


            /**
             * <p>Classe Java pour anonymous complex type.
             * 
             * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;attribute name="agentImport" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
             *       &lt;attribute name="completudeImport" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *       &lt;attribute name="date" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
             *       &lt;attribute name="idSource" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *       &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Entree {

                @XmlAttribute(name = "agentImport", required = true)
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "NMTOKEN")
                protected String agentImport;
                @XmlAttribute(name = "completudeImport", required = true)
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "NCName")
                protected String completudeImport;
                @XmlAttribute(name = "date", required = true)
                @XmlSchemaType(name = "dateTime")
                protected XMLGregorianCalendar date;
                @XmlAttribute(name = "idSource", required = true)
                @XmlSchemaType(name = "anySimpleType")
                protected String idSource;
                @XmlAttribute(name = "type", required = true)
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "NCName")
                protected String type;

                /**
                 * Obtient la valeur de la propriété agentImport.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAgentImport() {
                    return agentImport;
                }

                /**
                 * Définit la valeur de la propriété agentImport.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAgentImport(String value) {
                    this.agentImport = value;
                }

                /**
                 * Obtient la valeur de la propriété completudeImport.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCompletudeImport() {
                    return completudeImport;
                }

                /**
                 * Définit la valeur de la propriété completudeImport.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCompletudeImport(String value) {
                    this.completudeImport = value;
                }

                /**
                 * Obtient la valeur de la propriété date.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getDate() {
                    return date;
                }

                /**
                 * Définit la valeur de la propriété date.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setDate(XMLGregorianCalendar value) {
                    this.date = value;
                }

                /**
                 * Obtient la valeur de la propriété idSource.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getIdSource() {
                    return idSource;
                }

                /**
                 * Définit la valeur de la propriété idSource.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setIdSource(String value) {
                    this.idSource = value;
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


            /**
             * <p>Classe Java pour anonymous complex type.
             * 
             * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;attribute name="BIBL" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *       &lt;attribute name="FICH" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *       &lt;attribute name="SCOL" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *       &lt;attribute name="VALID" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *       &lt;attribute name="date" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
             *       &lt;attribute name="import" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *       &lt;attribute name="indicFacile" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *       &lt;attribute name="trace" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Facile {

                @XmlAttribute(name = "BIBL", required = true)
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "NCName")
                protected String bibl;
                @XmlAttribute(name = "FICH", required = true)
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "NCName")
                protected String fich;
                @XmlAttribute(name = "SCOL", required = true)
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "NCName")
                protected String scol;
                @XmlAttribute(name = "VALID", required = true)
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "NCName")
                protected String valid;
                @XmlAttribute(name = "date", required = true)
                @XmlSchemaType(name = "dateTime")
                protected XMLGregorianCalendar date;
                @XmlAttribute(name = "import", required = true)
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "NCName")
                protected String _import;
                @XmlAttribute(name = "indicFacile", required = true)
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "NCName")
                protected String indicFacile;
                @XmlAttribute(name = "trace", required = true)
                @XmlSchemaType(name = "anySimpleType")
                protected String trace;

                /**
                 * Obtient la valeur de la propriété bibl.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getBIBL() {
                    return bibl;
                }

                /**
                 * Définit la valeur de la propriété bibl.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setBIBL(String value) {
                    this.bibl = value;
                }

                /**
                 * Obtient la valeur de la propriété fich.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFICH() {
                    return fich;
                }

                /**
                 * Définit la valeur de la propriété fich.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFICH(String value) {
                    this.fich = value;
                }

                /**
                 * Obtient la valeur de la propriété scol.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSCOL() {
                    return scol;
                }

                /**
                 * Définit la valeur de la propriété scol.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSCOL(String value) {
                    this.scol = value;
                }

                /**
                 * Obtient la valeur de la propriété valid.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getVALID() {
                    return valid;
                }

                /**
                 * Définit la valeur de la propriété valid.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setVALID(String value) {
                    this.valid = value;
                }

                /**
                 * Obtient la valeur de la propriété date.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getDate() {
                    return date;
                }

                /**
                 * Définit la valeur de la propriété date.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setDate(XMLGregorianCalendar value) {
                    this.date = value;
                }

                /**
                 * Obtient la valeur de la propriété import.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getImport() {
                    return _import;
                }

                /**
                 * Définit la valeur de la propriété import.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setImport(String value) {
                    this._import = value;
                }

                /**
                 * Obtient la valeur de la propriété indicFacile.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getIndicFacile() {
                    return indicFacile;
                }

                /**
                 * Définit la valeur de la propriété indicFacile.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setIndicFacile(String value) {
                    this.indicFacile = value;
                }

                /**
                 * Obtient la valeur de la propriété trace.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTrace() {
                    return trace;
                }

                /**
                 * Définit la valeur de la propriété trace.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTrace(String value) {
                    this.trace = value;
                }

            }


            /**
             * <p>Classe Java pour anonymous complex type.
             * 
             * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;attribute name="date" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *       &lt;attribute name="indicInvalidation" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *       &lt;attribute name="note" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Invalidation {

                @XmlAttribute(name = "date", required = true)
                @XmlSchemaType(name = "anySimpleType")
                protected String date;
                @XmlAttribute(name = "indicInvalidation", required = true)
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "NCName")
                protected String indicInvalidation;
                @XmlAttribute(name = "note", required = true)
                @XmlSchemaType(name = "anySimpleType")
                protected String note;

                /**
                 * Obtient la valeur de la propriété date.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDate() {
                    return date;
                }

                /**
                 * Définit la valeur de la propriété date.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDate(String value) {
                    this.date = value;
                }

                /**
                 * Obtient la valeur de la propriété indicInvalidation.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getIndicInvalidation() {
                    return indicInvalidation;
                }

                /**
                 * Définit la valeur de la propriété indicInvalidation.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setIndicInvalidation(String value) {
                    this.indicInvalidation = value;
                }

                /**
                 * Obtient la valeur de la propriété note.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNote() {
                    return note;
                }

                /**
                 * Définit la valeur de la propriété note.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNote(String value) {
                    this.note = value;
                }

            }


            /**
             * <p>Classe Java pour anonymous complex type.
             * 
             * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;attribute name="BIBL" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *       &lt;attribute name="FICH" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *       &lt;attribute name="SCOL" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *       &lt;attribute name="VALID" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *       &lt;attribute name="date" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
             *       &lt;attribute name="import" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Maj {

                @XmlAttribute(name = "BIBL", required = true)
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "NCName")
                protected String bibl;
                @XmlAttribute(name = "FICH", required = true)
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "NCName")
                protected String fich;
                @XmlAttribute(name = "SCOL", required = true)
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "NCName")
                protected String scol;
                @XmlAttribute(name = "VALID", required = true)
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "NCName")
                protected String valid;
                @XmlAttribute(name = "date", required = true)
                @XmlSchemaType(name = "dateTime")
                protected XMLGregorianCalendar date;
                @XmlAttribute(name = "import", required = true)
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "NCName")
                protected String _import;

                /**
                 * Obtient la valeur de la propriété bibl.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getBIBL() {
                    return bibl;
                }

                /**
                 * Définit la valeur de la propriété bibl.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setBIBL(String value) {
                    this.bibl = value;
                }

                /**
                 * Obtient la valeur de la propriété fich.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFICH() {
                    return fich;
                }

                /**
                 * Définit la valeur de la propriété fich.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFICH(String value) {
                    this.fich = value;
                }

                /**
                 * Obtient la valeur de la propriété scol.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSCOL() {
                    return scol;
                }

                /**
                 * Définit la valeur de la propriété scol.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSCOL(String value) {
                    this.scol = value;
                }

                /**
                 * Obtient la valeur de la propriété valid.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getVALID() {
                    return valid;
                }

                /**
                 * Définit la valeur de la propriété valid.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setVALID(String value) {
                    this.valid = value;
                }

                /**
                 * Obtient la valeur de la propriété date.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getDate() {
                    return date;
                }

                /**
                 * Définit la valeur de la propriété date.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setDate(XMLGregorianCalendar value) {
                    this.date = value;
                }

                /**
                 * Obtient la valeur de la propriété import.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getImport() {
                    return _import;
                }

                /**
                 * Définit la valeur de la propriété import.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setImport(String value) {
                    this._import = value;
                }

            }


            /**
             * <p>Classe Java pour anonymous complex type.
             * 
             * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;attribute name="date" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *       &lt;attribute name="indicPurge" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Purge {

                @XmlAttribute(name = "date", required = true)
                @XmlSchemaType(name = "anySimpleType")
                protected String date;
                @XmlAttribute(name = "indicPurge", required = true)
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "NCName")
                protected String indicPurge;

                /**
                 * Obtient la valeur de la propriété date.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDate() {
                    return date;
                }

                /**
                 * Définit la valeur de la propriété date.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDate(String value) {
                    this.date = value;
                }

                /**
                 * Obtient la valeur de la propriété indicPurge.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getIndicPurge() {
                    return indicPurge;
                }

                /**
                 * Définit la valeur de la propriété indicPurge.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setIndicPurge(String value) {
                    this.indicPurge = value;
                }

            }


            /**
             * <p>Classe Java pour anonymous complex type.
             * 
             * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;attribute name="date" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *       &lt;attribute name="indicRemonteeArchive" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *       &lt;attribute name="trace" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class RemonteeArchive {

                @XmlAttribute(name = "date", required = true)
                @XmlSchemaType(name = "anySimpleType")
                protected String date;
                @XmlAttribute(name = "indicRemonteeArchive", required = true)
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "NCName")
                protected String indicRemonteeArchive;
                @XmlAttribute(name = "trace", required = true)
                @XmlSchemaType(name = "anySimpleType")
                protected String trace;

                /**
                 * Obtient la valeur de la propriété date.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDate() {
                    return date;
                }

                /**
                 * Définit la valeur de la propriété date.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDate(String value) {
                    this.date = value;
                }

                /**
                 * Obtient la valeur de la propriété indicRemonteeArchive.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getIndicRemonteeArchive() {
                    return indicRemonteeArchive;
                }

                /**
                 * Définit la valeur de la propriété indicRemonteeArchive.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setIndicRemonteeArchive(String value) {
                    this.indicRemonteeArchive = value;
                }

                /**
                 * Obtient la valeur de la propriété trace.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTrace() {
                    return trace;
                }

                /**
                 * Définit la valeur de la propriété trace.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTrace(String value) {
                    this.trace = value;
                }

            }


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
             *         &lt;element name="cines" form="unqualified">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="dateCines" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
             *                 &lt;attribute name="indicCines" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *                 &lt;attribute name="trace" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="sudoc" form="unqualified">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="RCR" form="unqualified">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="EPN" form="unqualified">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *                 &lt;attribute name="PPN" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
             *                 &lt;attribute name="dateSudoc" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
             *                 &lt;attribute name="indicSudoc" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *                 &lt;attribute name="majSudoc" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
             *                 &lt;attribute name="trace" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="diffusion" form="unqualified">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="etabDiffuseur" form="unqualified">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="urlEtabDiffuseur" form="unqualified">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;attribute name="majUrlEtabDiffuseur" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                           &lt;/sequence>
             *                           &lt;attribute name="editeurScientifiqueLieu" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *                           &lt;attribute name="editeurScientifiqueNom" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *                           &lt;attribute name="etabDiffuseurPolEtablissement" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="abesDiffuseur" form="unqualified">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attribute name="FichEtabDiffAbesIntranet" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *                           &lt;attribute name="abesDiffuseurPolEtablissement" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *                           &lt;attribute name="dateAbesDiffuseur" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
             *                           &lt;attribute name="indicAbesDiffuseur" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *                           &lt;attribute name="majAbesDiffuseur" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
             *                           &lt;attribute name="urlAbesDiffuseur" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="ccsd" form="unqualified">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attribute name="ccsdDiffuseurPolEtablissement" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *                           &lt;attribute name="dateCcsd" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *                           &lt;attribute name="identifiantCcsd" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *                           &lt;attribute name="indicCcsd" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *                           &lt;attribute name="majCcsd" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *                           &lt;attribute name="numVersion" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *                           &lt;attribute name="pwdCcsd" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *                           &lt;attribute name="trace" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *                           &lt;attribute name="urlCcsd" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="autresEtabDiffuseurs" form="unqualified">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="oai" form="unqualified">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attribute name="dateOai" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
             *                           &lt;attribute name="indicOai" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *                           &lt;attribute name="majOai" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
             *                           &lt;attribute name="trace" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *                 &lt;attribute name="conformitePolDiffusion" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *                 &lt;attribute name="restrictionTemporelleFin" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *                 &lt;attribute name="restrictionTemporelleType" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *                 &lt;attribute name="typeDiffusion" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
             *                 &lt;attribute name="urlPerenne" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *       &lt;attribute name="date" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "cines",
                "sudoc",
                "diffusion"
            })
            public static class Sorties {

                @XmlElement(namespace = "", required = true)
                protected XmlData.StarGestion.Traitements.Sorties.Cines cines;
                @XmlElement(namespace = "", required = true)
                protected XmlData.StarGestion.Traitements.Sorties.Sudoc sudoc;
                @XmlElement(namespace = "", required = true)
                protected XmlData.StarGestion.Traitements.Sorties.Diffusion diffusion;
                @XmlAttribute(name = "date", required = true)
                @XmlSchemaType(name = "anySimpleType")
                protected String date;

                /**
                 * Obtient la valeur de la propriété cines.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Cines }
                 *     
                 */
                public Cines getCines() {
                    return cines;
                }

                /**
                 * Définit la valeur de la propriété cines.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Cines }
                 *     
                 */
                public void setCines(Cines value) {
                    this.cines = value;
                }

                /**
                 * Obtient la valeur de la propriété sudoc.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Sudoc }
                 *     
                 */
                public Sudoc getSudoc() {
                    return sudoc;
                }

                /**
                 * Définit la valeur de la propriété sudoc.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Sudoc }
                 *     
                 */
                public void setSudoc(Sudoc value) {
                    this.sudoc = value;
                }

                /**
                 * Obtient la valeur de la propriété diffusion.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Diffusion }
                 *     
                 */
                public Diffusion getDiffusion() {
                    return diffusion;
                }

                /**
                 * Définit la valeur de la propriété diffusion.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Diffusion }
                 *     
                 */
                public void setDiffusion(Diffusion value) {
                    this.diffusion = value;
                }

                /**
                 * Obtient la valeur de la propriété date.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDate() {
                    return date;
                }

                /**
                 * Définit la valeur de la propriété date.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDate(String value) {
                    this.date = value;
                }


                /**
                 * <p>Classe Java pour anonymous complex type.
                 * 
                 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;attribute name="dateCines" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
                 *       &lt;attribute name="indicCines" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
                 *       &lt;attribute name="trace" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Cines {

                    @XmlAttribute(name = "dateCines", required = true)
                    @XmlSchemaType(name = "dateTime")
                    protected XMLGregorianCalendar dateCines;
                    @XmlAttribute(name = "indicCines", required = true)
                    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                    @XmlSchemaType(name = "NCName")
                    protected String indicCines;
                    @XmlAttribute(name = "trace", required = true)
                    @XmlSchemaType(name = "anySimpleType")
                    protected String trace;

                    /**
                     * Obtient la valeur de la propriété dateCines.
                     * 
                     * @return
                     *     possible object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public XMLGregorianCalendar getDateCines() {
                        return dateCines;
                    }

                    /**
                     * Définit la valeur de la propriété dateCines.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public void setDateCines(XMLGregorianCalendar value) {
                        this.dateCines = value;
                    }

                    /**
                     * Obtient la valeur de la propriété indicCines.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getIndicCines() {
                        return indicCines;
                    }

                    /**
                     * Définit la valeur de la propriété indicCines.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setIndicCines(String value) {
                        this.indicCines = value;
                    }

                    /**
                     * Obtient la valeur de la propriété trace.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getTrace() {
                        return trace;
                    }

                    /**
                     * Définit la valeur de la propriété trace.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setTrace(String value) {
                        this.trace = value;
                    }

                }


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
                 *         &lt;element name="etabDiffuseur" form="unqualified">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="urlEtabDiffuseur" form="unqualified">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;attribute name="majUrlEtabDiffuseur" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                 *                         &lt;/restriction>
                 *                       &lt;/complexContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                 &lt;/sequence>
                 *                 &lt;attribute name="editeurScientifiqueLieu" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                 *                 &lt;attribute name="editeurScientifiqueNom" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                 *                 &lt;attribute name="etabDiffuseurPolEtablissement" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="abesDiffuseur" form="unqualified">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attribute name="FichEtabDiffAbesIntranet" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
                 *                 &lt;attribute name="abesDiffuseurPolEtablissement" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
                 *                 &lt;attribute name="dateAbesDiffuseur" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
                 *                 &lt;attribute name="indicAbesDiffuseur" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
                 *                 &lt;attribute name="majAbesDiffuseur" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
                 *                 &lt;attribute name="urlAbesDiffuseur" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="ccsd" form="unqualified">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attribute name="ccsdDiffuseurPolEtablissement" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
                 *                 &lt;attribute name="dateCcsd" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                 *                 &lt;attribute name="identifiantCcsd" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                 *                 &lt;attribute name="indicCcsd" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
                 *                 &lt;attribute name="majCcsd" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                 *                 &lt;attribute name="numVersion" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                 *                 &lt;attribute name="pwdCcsd" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                 *                 &lt;attribute name="trace" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                 *                 &lt;attribute name="urlCcsd" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="autresEtabDiffuseurs" form="unqualified">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="oai" form="unqualified">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attribute name="dateOai" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
                 *                 &lt;attribute name="indicOai" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
                 *                 &lt;attribute name="majOai" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
                 *                 &lt;attribute name="trace" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *       &lt;/sequence>
                 *       &lt;attribute name="conformitePolDiffusion" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
                 *       &lt;attribute name="restrictionTemporelleFin" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                 *       &lt;attribute name="restrictionTemporelleType" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
                 *       &lt;attribute name="typeDiffusion" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
                 *       &lt;attribute name="urlPerenne" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "etabDiffuseur",
                    "abesDiffuseur",
                    "ccsd",
                    "autresEtabDiffuseurs",
                    "oai"
                })
                public static class Diffusion {

                    @XmlElement(namespace = "", required = true)
                    protected XmlData.StarGestion.Traitements.Sorties.Diffusion.EtabDiffuseur etabDiffuseur;
                    @XmlElement(namespace = "", required = true)
                    protected XmlData.StarGestion.Traitements.Sorties.Diffusion.AbesDiffuseur abesDiffuseur;
                    @XmlElement(namespace = "", required = true)
                    protected XmlData.StarGestion.Traitements.Sorties.Diffusion.Ccsd ccsd;
                    @XmlElement(namespace = "", required = true)
                    protected XmlData.StarGestion.Traitements.Sorties.Diffusion.AutresEtabDiffuseurs autresEtabDiffuseurs;
                    @XmlElement(namespace = "", required = true)
                    protected XmlData.StarGestion.Traitements.Sorties.Diffusion.Oai oai;
                    @XmlAttribute(name = "conformitePolDiffusion", required = true)
                    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                    @XmlSchemaType(name = "NCName")
                    protected String conformitePolDiffusion;
                    @XmlAttribute(name = "restrictionTemporelleFin", required = true)
                    @XmlSchemaType(name = "anySimpleType")
                    protected String restrictionTemporelleFin;
                    @XmlAttribute(name = "restrictionTemporelleType", required = true)
                    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                    @XmlSchemaType(name = "NCName")
                    protected String restrictionTemporelleType;
                    @XmlAttribute(name = "typeDiffusion", required = true)
                    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                    @XmlSchemaType(name = "NCName")
                    protected String typeDiffusion;
                    @XmlAttribute(name = "urlPerenne", required = true)
                    @XmlSchemaType(name = "anyURI")
                    protected String urlPerenne;

                    /**
                     * Obtient la valeur de la propriété etabDiffuseur.
                     * 
                     * @return
                     *     possible object is
                     *     {@link EtabDiffuseur }
                     *     
                     */
                    public EtabDiffuseur getEtabDiffuseur() {
                        return etabDiffuseur;
                    }

                    /**
                     * Définit la valeur de la propriété etabDiffuseur.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link EtabDiffuseur }
                     *     
                     */
                    public void setEtabDiffuseur(EtabDiffuseur value) {
                        this.etabDiffuseur = value;
                    }

                    /**
                     * Obtient la valeur de la propriété abesDiffuseur.
                     * 
                     * @return
                     *     possible object is
                     *     {@link AbesDiffuseur }
                     *     
                     */
                    public AbesDiffuseur getAbesDiffuseur() {
                        return abesDiffuseur;
                    }

                    /**
                     * Définit la valeur de la propriété abesDiffuseur.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link AbesDiffuseur }
                     *     
                     */
                    public void setAbesDiffuseur(AbesDiffuseur value) {
                        this.abesDiffuseur = value;
                    }

                    /**
                     * Obtient la valeur de la propriété ccsd.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Ccsd }
                     *     
                     */
                    public Ccsd getCcsd() {
                        return ccsd;
                    }

                    /**
                     * Définit la valeur de la propriété ccsd.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Ccsd }
                     *     
                     */
                    public void setCcsd(Ccsd value) {
                        this.ccsd = value;
                    }

                    /**
                     * Obtient la valeur de la propriété autresEtabDiffuseurs.
                     * 
                     * @return
                     *     possible object is
                     *     {@link AutresEtabDiffuseurs }
                     *     
                     */
                    public AutresEtabDiffuseurs getAutresEtabDiffuseurs() {
                        return autresEtabDiffuseurs;
                    }

                    /**
                     * Définit la valeur de la propriété autresEtabDiffuseurs.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link AutresEtabDiffuseurs }
                     *     
                     */
                    public void setAutresEtabDiffuseurs(AutresEtabDiffuseurs value) {
                        this.autresEtabDiffuseurs = value;
                    }

                    /**
                     * Obtient la valeur de la propriété oai.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Oai }
                     *     
                     */
                    public Oai getOai() {
                        return oai;
                    }

                    /**
                     * Définit la valeur de la propriété oai.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Oai }
                     *     
                     */
                    public void setOai(Oai value) {
                        this.oai = value;
                    }

                    /**
                     * Obtient la valeur de la propriété conformitePolDiffusion.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getConformitePolDiffusion() {
                        return conformitePolDiffusion;
                    }

                    /**
                     * Définit la valeur de la propriété conformitePolDiffusion.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setConformitePolDiffusion(String value) {
                        this.conformitePolDiffusion = value;
                    }

                    /**
                     * Obtient la valeur de la propriété restrictionTemporelleFin.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getRestrictionTemporelleFin() {
                        return restrictionTemporelleFin;
                    }

                    /**
                     * Définit la valeur de la propriété restrictionTemporelleFin.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setRestrictionTemporelleFin(String value) {
                        this.restrictionTemporelleFin = value;
                    }

                    /**
                     * Obtient la valeur de la propriété restrictionTemporelleType.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getRestrictionTemporelleType() {
                        return restrictionTemporelleType;
                    }

                    /**
                     * Définit la valeur de la propriété restrictionTemporelleType.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setRestrictionTemporelleType(String value) {
                        this.restrictionTemporelleType = value;
                    }

                    /**
                     * Obtient la valeur de la propriété typeDiffusion.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getTypeDiffusion() {
                        return typeDiffusion;
                    }

                    /**
                     * Définit la valeur de la propriété typeDiffusion.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setTypeDiffusion(String value) {
                        this.typeDiffusion = value;
                    }

                    /**
                     * Obtient la valeur de la propriété urlPerenne.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getUrlPerenne() {
                        return urlPerenne;
                    }

                    /**
                     * Définit la valeur de la propriété urlPerenne.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setUrlPerenne(String value) {
                        this.urlPerenne = value;
                    }


                    /**
                     * <p>Classe Java pour anonymous complex type.
                     * 
                     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;attribute name="FichEtabDiffAbesIntranet" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
                     *       &lt;attribute name="abesDiffuseurPolEtablissement" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
                     *       &lt;attribute name="dateAbesDiffuseur" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
                     *       &lt;attribute name="indicAbesDiffuseur" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
                     *       &lt;attribute name="majAbesDiffuseur" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
                     *       &lt;attribute name="urlAbesDiffuseur" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class AbesDiffuseur {

                        @XmlAttribute(name = "FichEtabDiffAbesIntranet", required = true)
                        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                        @XmlSchemaType(name = "NCName")
                        protected String fichEtabDiffAbesIntranet;
                        @XmlAttribute(name = "abesDiffuseurPolEtablissement", required = true)
                        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                        @XmlSchemaType(name = "NCName")
                        protected String abesDiffuseurPolEtablissement;
                        @XmlAttribute(name = "dateAbesDiffuseur", required = true)
                        @XmlSchemaType(name = "dateTime")
                        protected XMLGregorianCalendar dateAbesDiffuseur;
                        @XmlAttribute(name = "indicAbesDiffuseur", required = true)
                        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                        @XmlSchemaType(name = "NCName")
                        protected String indicAbesDiffuseur;
                        @XmlAttribute(name = "majAbesDiffuseur", required = true)
                        @XmlSchemaType(name = "dateTime")
                        protected XMLGregorianCalendar majAbesDiffuseur;
                        @XmlAttribute(name = "urlAbesDiffuseur", required = true)
                        @XmlSchemaType(name = "anySimpleType")
                        protected String urlAbesDiffuseur;

                        /**
                         * Obtient la valeur de la propriété fichEtabDiffAbesIntranet.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getFichEtabDiffAbesIntranet() {
                            return fichEtabDiffAbesIntranet;
                        }

                        /**
                         * Définit la valeur de la propriété fichEtabDiffAbesIntranet.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setFichEtabDiffAbesIntranet(String value) {
                            this.fichEtabDiffAbesIntranet = value;
                        }

                        /**
                         * Obtient la valeur de la propriété abesDiffuseurPolEtablissement.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getAbesDiffuseurPolEtablissement() {
                            return abesDiffuseurPolEtablissement;
                        }

                        /**
                         * Définit la valeur de la propriété abesDiffuseurPolEtablissement.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setAbesDiffuseurPolEtablissement(String value) {
                            this.abesDiffuseurPolEtablissement = value;
                        }

                        /**
                         * Obtient la valeur de la propriété dateAbesDiffuseur.
                         * 
                         * @return
                         *     possible object is
                         *     {@link XMLGregorianCalendar }
                         *     
                         */
                        public XMLGregorianCalendar getDateAbesDiffuseur() {
                            return dateAbesDiffuseur;
                        }

                        /**
                         * Définit la valeur de la propriété dateAbesDiffuseur.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link XMLGregorianCalendar }
                         *     
                         */
                        public void setDateAbesDiffuseur(XMLGregorianCalendar value) {
                            this.dateAbesDiffuseur = value;
                        }

                        /**
                         * Obtient la valeur de la propriété indicAbesDiffuseur.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getIndicAbesDiffuseur() {
                            return indicAbesDiffuseur;
                        }

                        /**
                         * Définit la valeur de la propriété indicAbesDiffuseur.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setIndicAbesDiffuseur(String value) {
                            this.indicAbesDiffuseur = value;
                        }

                        /**
                         * Obtient la valeur de la propriété majAbesDiffuseur.
                         * 
                         * @return
                         *     possible object is
                         *     {@link XMLGregorianCalendar }
                         *     
                         */
                        public XMLGregorianCalendar getMajAbesDiffuseur() {
                            return majAbesDiffuseur;
                        }

                        /**
                         * Définit la valeur de la propriété majAbesDiffuseur.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link XMLGregorianCalendar }
                         *     
                         */
                        public void setMajAbesDiffuseur(XMLGregorianCalendar value) {
                            this.majAbesDiffuseur = value;
                        }

                        /**
                         * Obtient la valeur de la propriété urlAbesDiffuseur.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getUrlAbesDiffuseur() {
                            return urlAbesDiffuseur;
                        }

                        /**
                         * Définit la valeur de la propriété urlAbesDiffuseur.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setUrlAbesDiffuseur(String value) {
                            this.urlAbesDiffuseur = value;
                        }

                    }


                    /**
                     * <p>Classe Java pour anonymous complex type.
                     * 
                     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class AutresEtabDiffuseurs {


                    }


                    /**
                     * <p>Classe Java pour anonymous complex type.
                     * 
                     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;attribute name="ccsdDiffuseurPolEtablissement" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
                     *       &lt;attribute name="dateCcsd" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                     *       &lt;attribute name="identifiantCcsd" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                     *       &lt;attribute name="indicCcsd" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
                     *       &lt;attribute name="majCcsd" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                     *       &lt;attribute name="numVersion" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                     *       &lt;attribute name="pwdCcsd" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                     *       &lt;attribute name="trace" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                     *       &lt;attribute name="urlCcsd" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class Ccsd {

                        @XmlAttribute(name = "ccsdDiffuseurPolEtablissement", required = true)
                        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                        @XmlSchemaType(name = "NCName")
                        protected String ccsdDiffuseurPolEtablissement;
                        @XmlAttribute(name = "dateCcsd", required = true)
                        @XmlSchemaType(name = "anySimpleType")
                        protected String dateCcsd;
                        @XmlAttribute(name = "identifiantCcsd", required = true)
                        @XmlSchemaType(name = "anySimpleType")
                        protected String identifiantCcsd;
                        @XmlAttribute(name = "indicCcsd", required = true)
                        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                        @XmlSchemaType(name = "NCName")
                        protected String indicCcsd;
                        @XmlAttribute(name = "majCcsd", required = true)
                        @XmlSchemaType(name = "anySimpleType")
                        protected String majCcsd;
                        @XmlAttribute(name = "numVersion", required = true)
                        @XmlSchemaType(name = "anySimpleType")
                        protected String numVersion;
                        @XmlAttribute(name = "pwdCcsd", required = true)
                        @XmlSchemaType(name = "anySimpleType")
                        protected String pwdCcsd;
                        @XmlAttribute(name = "trace", required = true)
                        @XmlSchemaType(name = "anySimpleType")
                        protected String trace;
                        @XmlAttribute(name = "urlCcsd", required = true)
                        @XmlSchemaType(name = "anySimpleType")
                        protected String urlCcsd;

                        /**
                         * Obtient la valeur de la propriété ccsdDiffuseurPolEtablissement.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getCcsdDiffuseurPolEtablissement() {
                            return ccsdDiffuseurPolEtablissement;
                        }

                        /**
                         * Définit la valeur de la propriété ccsdDiffuseurPolEtablissement.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setCcsdDiffuseurPolEtablissement(String value) {
                            this.ccsdDiffuseurPolEtablissement = value;
                        }

                        /**
                         * Obtient la valeur de la propriété dateCcsd.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getDateCcsd() {
                            return dateCcsd;
                        }

                        /**
                         * Définit la valeur de la propriété dateCcsd.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setDateCcsd(String value) {
                            this.dateCcsd = value;
                        }

                        /**
                         * Obtient la valeur de la propriété identifiantCcsd.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getIdentifiantCcsd() {
                            return identifiantCcsd;
                        }

                        /**
                         * Définit la valeur de la propriété identifiantCcsd.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setIdentifiantCcsd(String value) {
                            this.identifiantCcsd = value;
                        }

                        /**
                         * Obtient la valeur de la propriété indicCcsd.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getIndicCcsd() {
                            return indicCcsd;
                        }

                        /**
                         * Définit la valeur de la propriété indicCcsd.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setIndicCcsd(String value) {
                            this.indicCcsd = value;
                        }

                        /**
                         * Obtient la valeur de la propriété majCcsd.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getMajCcsd() {
                            return majCcsd;
                        }

                        /**
                         * Définit la valeur de la propriété majCcsd.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setMajCcsd(String value) {
                            this.majCcsd = value;
                        }

                        /**
                         * Obtient la valeur de la propriété numVersion.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getNumVersion() {
                            return numVersion;
                        }

                        /**
                         * Définit la valeur de la propriété numVersion.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setNumVersion(String value) {
                            this.numVersion = value;
                        }

                        /**
                         * Obtient la valeur de la propriété pwdCcsd.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getPwdCcsd() {
                            return pwdCcsd;
                        }

                        /**
                         * Définit la valeur de la propriété pwdCcsd.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setPwdCcsd(String value) {
                            this.pwdCcsd = value;
                        }

                        /**
                         * Obtient la valeur de la propriété trace.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getTrace() {
                            return trace;
                        }

                        /**
                         * Définit la valeur de la propriété trace.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setTrace(String value) {
                            this.trace = value;
                        }

                        /**
                         * Obtient la valeur de la propriété urlCcsd.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getUrlCcsd() {
                            return urlCcsd;
                        }

                        /**
                         * Définit la valeur de la propriété urlCcsd.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setUrlCcsd(String value) {
                            this.urlCcsd = value;
                        }

                    }


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
                     *         &lt;element name="urlEtabDiffuseur" form="unqualified">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;attribute name="majUrlEtabDiffuseur" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                     *               &lt;/restriction>
                     *             &lt;/complexContent>
                     *           &lt;/complexType>
                     *         &lt;/element>
                     *       &lt;/sequence>
                     *       &lt;attribute name="editeurScientifiqueLieu" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                     *       &lt;attribute name="editeurScientifiqueNom" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                     *       &lt;attribute name="etabDiffuseurPolEtablissement" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "urlEtabDiffuseur"
                    })
                    public static class EtabDiffuseur {

                        @XmlElement(namespace = "", required = true)
                        protected XmlData.StarGestion.Traitements.Sorties.Diffusion.EtabDiffuseur.UrlEtabDiffuseur urlEtabDiffuseur;
                        @XmlAttribute(name = "editeurScientifiqueLieu", required = true)
                        @XmlSchemaType(name = "anySimpleType")
                        protected String editeurScientifiqueLieu;
                        @XmlAttribute(name = "editeurScientifiqueNom", required = true)
                        @XmlSchemaType(name = "anySimpleType")
                        protected String editeurScientifiqueNom;
                        @XmlAttribute(name = "etabDiffuseurPolEtablissement", required = true)
                        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                        @XmlSchemaType(name = "NCName")
                        protected String etabDiffuseurPolEtablissement;

                        /**
                         * Obtient la valeur de la propriété urlEtabDiffuseur.
                         * 
                         * @return
                         *     possible object is
                         *     {@link UrlEtabDiffuseur }
                         *     
                         */
                        public UrlEtabDiffuseur getUrlEtabDiffuseur() {
                            return urlEtabDiffuseur;
                        }

                        /**
                         * Définit la valeur de la propriété urlEtabDiffuseur.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link UrlEtabDiffuseur }
                         *     
                         */
                        public void setUrlEtabDiffuseur(UrlEtabDiffuseur value) {
                            this.urlEtabDiffuseur = value;
                        }

                        /**
                         * Obtient la valeur de la propriété editeurScientifiqueLieu.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getEditeurScientifiqueLieu() {
                            return editeurScientifiqueLieu;
                        }

                        /**
                         * Définit la valeur de la propriété editeurScientifiqueLieu.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setEditeurScientifiqueLieu(String value) {
                            this.editeurScientifiqueLieu = value;
                        }

                        /**
                         * Obtient la valeur de la propriété editeurScientifiqueNom.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getEditeurScientifiqueNom() {
                            return editeurScientifiqueNom;
                        }

                        /**
                         * Définit la valeur de la propriété editeurScientifiqueNom.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setEditeurScientifiqueNom(String value) {
                            this.editeurScientifiqueNom = value;
                        }

                        /**
                         * Obtient la valeur de la propriété etabDiffuseurPolEtablissement.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getEtabDiffuseurPolEtablissement() {
                            return etabDiffuseurPolEtablissement;
                        }

                        /**
                         * Définit la valeur de la propriété etabDiffuseurPolEtablissement.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setEtabDiffuseurPolEtablissement(String value) {
                            this.etabDiffuseurPolEtablissement = value;
                        }


                        /**
                         * <p>Classe Java pour anonymous complex type.
                         * 
                         * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
                         * 
                         * <pre>
                         * &lt;complexType>
                         *   &lt;complexContent>
                         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *       &lt;attribute name="majUrlEtabDiffuseur" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                         *     &lt;/restriction>
                         *   &lt;/complexContent>
                         * &lt;/complexType>
                         * </pre>
                         * 
                         * 
                         */
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "")
                        public static class UrlEtabDiffuseur {

                            @XmlAttribute(name = "majUrlEtabDiffuseur", required = true)
                            @XmlSchemaType(name = "anySimpleType")
                            protected String majUrlEtabDiffuseur;

                            /**
                             * Obtient la valeur de la propriété majUrlEtabDiffuseur.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getMajUrlEtabDiffuseur() {
                                return majUrlEtabDiffuseur;
                            }

                            /**
                             * Définit la valeur de la propriété majUrlEtabDiffuseur.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setMajUrlEtabDiffuseur(String value) {
                                this.majUrlEtabDiffuseur = value;
                            }

                        }

                    }


                    /**
                     * <p>Classe Java pour anonymous complex type.
                     * 
                     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;attribute name="dateOai" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
                     *       &lt;attribute name="indicOai" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
                     *       &lt;attribute name="majOai" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
                     *       &lt;attribute name="trace" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class Oai {

                        @XmlAttribute(name = "dateOai", required = true)
                        @XmlSchemaType(name = "dateTime")
                        protected XMLGregorianCalendar dateOai;
                        @XmlAttribute(name = "indicOai", required = true)
                        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                        @XmlSchemaType(name = "NCName")
                        protected String indicOai;
                        @XmlAttribute(name = "majOai", required = true)
                        @XmlSchemaType(name = "dateTime")
                        protected XMLGregorianCalendar majOai;
                        @XmlAttribute(name = "trace", required = true)
                        @XmlSchemaType(name = "anySimpleType")
                        protected String trace;

                        /**
                         * Obtient la valeur de la propriété dateOai.
                         * 
                         * @return
                         *     possible object is
                         *     {@link XMLGregorianCalendar }
                         *     
                         */
                        public XMLGregorianCalendar getDateOai() {
                            return dateOai;
                        }

                        /**
                         * Définit la valeur de la propriété dateOai.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link XMLGregorianCalendar }
                         *     
                         */
                        public void setDateOai(XMLGregorianCalendar value) {
                            this.dateOai = value;
                        }

                        /**
                         * Obtient la valeur de la propriété indicOai.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getIndicOai() {
                            return indicOai;
                        }

                        /**
                         * Définit la valeur de la propriété indicOai.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setIndicOai(String value) {
                            this.indicOai = value;
                        }

                        /**
                         * Obtient la valeur de la propriété majOai.
                         * 
                         * @return
                         *     possible object is
                         *     {@link XMLGregorianCalendar }
                         *     
                         */
                        public XMLGregorianCalendar getMajOai() {
                            return majOai;
                        }

                        /**
                         * Définit la valeur de la propriété majOai.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link XMLGregorianCalendar }
                         *     
                         */
                        public void setMajOai(XMLGregorianCalendar value) {
                            this.majOai = value;
                        }

                        /**
                         * Obtient la valeur de la propriété trace.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getTrace() {
                            return trace;
                        }

                        /**
                         * Définit la valeur de la propriété trace.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setTrace(String value) {
                            this.trace = value;
                        }

                    }

                }


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
                 *         &lt;element name="RCR" form="unqualified">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="EPN" form="unqualified">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *       &lt;/sequence>
                 *       &lt;attribute name="PPN" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
                 *       &lt;attribute name="dateSudoc" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
                 *       &lt;attribute name="indicSudoc" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
                 *       &lt;attribute name="majSudoc" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
                 *       &lt;attribute name="trace" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "rcr",
                    "epn"
                })
                public static class Sudoc {

                    @XmlElement(name = "RCR", namespace = "", required = true)
                    protected XmlData.StarGestion.Traitements.Sorties.Sudoc.RCR rcr;
                    @XmlElement(name = "EPN", namespace = "", required = true)
                    protected XmlData.StarGestion.Traitements.Sorties.Sudoc.EPN epn;
                    @XmlAttribute(name = "PPN", required = true)
                    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                    @XmlSchemaType(name = "NMTOKEN")
                    protected String ppn;
                    @XmlAttribute(name = "dateSudoc", required = true)
                    @XmlSchemaType(name = "dateTime")
                    protected XMLGregorianCalendar dateSudoc;
                    @XmlAttribute(name = "indicSudoc", required = true)
                    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                    @XmlSchemaType(name = "NCName")
                    protected String indicSudoc;
                    @XmlAttribute(name = "majSudoc", required = true)
                    @XmlSchemaType(name = "dateTime")
                    protected XMLGregorianCalendar majSudoc;
                    @XmlAttribute(name = "trace", required = true)
                    @XmlSchemaType(name = "anySimpleType")
                    protected String trace;

                    /**
                     * Obtient la valeur de la propriété rcr.
                     * 
                     * @return
                     *     possible object is
                     *     {@link RCR }
                     *     
                     */
                    public RCR getRCR() {
                        return rcr;
                    }

                    /**
                     * Définit la valeur de la propriété rcr.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link RCR }
                     *     
                     */
                    public void setRCR(RCR value) {
                        this.rcr = value;
                    }

                    /**
                     * Obtient la valeur de la propriété epn.
                     * 
                     * @return
                     *     possible object is
                     *     {@link EPN }
                     *     
                     */
                    public EPN getEPN() {
                        return epn;
                    }

                    /**
                     * Définit la valeur de la propriété epn.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link EPN }
                     *     
                     */
                    public void setEPN(EPN value) {
                        this.epn = value;
                    }

                    /**
                     * Obtient la valeur de la propriété ppn.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getPPN() {
                        return ppn;
                    }

                    /**
                     * Définit la valeur de la propriété ppn.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setPPN(String value) {
                        this.ppn = value;
                    }

                    /**
                     * Obtient la valeur de la propriété dateSudoc.
                     * 
                     * @return
                     *     possible object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public XMLGregorianCalendar getDateSudoc() {
                        return dateSudoc;
                    }

                    /**
                     * Définit la valeur de la propriété dateSudoc.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public void setDateSudoc(XMLGregorianCalendar value) {
                        this.dateSudoc = value;
                    }

                    /**
                     * Obtient la valeur de la propriété indicSudoc.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getIndicSudoc() {
                        return indicSudoc;
                    }

                    /**
                     * Définit la valeur de la propriété indicSudoc.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setIndicSudoc(String value) {
                        this.indicSudoc = value;
                    }

                    /**
                     * Obtient la valeur de la propriété majSudoc.
                     * 
                     * @return
                     *     possible object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public XMLGregorianCalendar getMajSudoc() {
                        return majSudoc;
                    }

                    /**
                     * Définit la valeur de la propriété majSudoc.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public void setMajSudoc(XMLGregorianCalendar value) {
                        this.majSudoc = value;
                    }

                    /**
                     * Obtient la valeur de la propriété trace.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getTrace() {
                        return trace;
                    }

                    /**
                     * Définit la valeur de la propriété trace.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setTrace(String value) {
                        this.trace = value;
                    }


                    /**
                     * <p>Classe Java pour anonymous complex type.
                     * 
                     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class EPN {


                    }


                    /**
                     * <p>Classe Java pour anonymous complex type.
                     * 
                     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
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
                    public static class RCR {

                        @XmlValue
                        protected String content;
                        @XmlAttribute(name = "code", required = true)
                        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                        @XmlSchemaType(name = "NMTOKEN")
                        protected String code;

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
                         * Obtient la valeur de la propriété code.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getCode() {
                            return code;
                        }

                        /**
                         * Définit la valeur de la propriété code.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setCode(String value) {
                            this.code = value;
                        }

                    }

                }

            }


            /**
             * <p>Classe Java pour anonymous complex type.
             * 
             * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;attribute name="agentImport" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *       &lt;attribute name="date" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *       &lt;attribute name="idStep" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Step {

                @XmlAttribute(name = "agentImport", required = true)
                @XmlSchemaType(name = "anySimpleType")
                protected String agentImport;
                @XmlAttribute(name = "date", required = true)
                @XmlSchemaType(name = "anySimpleType")
                protected String date;
                @XmlAttribute(name = "idStep", required = true)
                @XmlSchemaType(name = "anySimpleType")
                protected String idStep;

                /**
                 * Obtient la valeur de la propriété agentImport.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAgentImport() {
                    return agentImport;
                }

                /**
                 * Définit la valeur de la propriété agentImport.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAgentImport(String value) {
                    this.agentImport = value;
                }

                /**
                 * Obtient la valeur de la propriété date.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDate() {
                    return date;
                }

                /**
                 * Définit la valeur de la propriété date.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDate(String value) {
                    this.date = value;
                }

                /**
                 * Obtient la valeur de la propriété idStep.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getIdStep() {
                    return idStep;
                }

                /**
                 * Définit la valeur de la propriété idStep.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setIdStep(String value) {
                    this.idStep = value;
                }

            }

        }

    }


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="stepEtat" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class StepGestion {

        @XmlAttribute(name = "stepEtat", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "NCName")
        protected String stepEtat;

        /**
         * Obtient la valeur de la propriété stepEtat.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStepEtat() {
            return stepEtat;
        }

        /**
         * Définit la valeur de la propriété stepEtat.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStepEtat(String value) {
            this.stepEtat = value;
        }

    }

}
