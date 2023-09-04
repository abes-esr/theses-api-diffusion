//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2023.09.01 à 06:07:01 PM CEST 
//


package fr.abes.theses.diffusion.model.tef;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the fr.abes.theses.diffusion.model.tef package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Peb_QNAME = new QName("http://www.theses.fr/namespace/tefudoc", "peb");
    private final static QName _Note_QNAME = new QName("http://www.loc.gov/METS/", "note");
    private final static QName _Rcr_QNAME = new QName("http://www.theses.fr/namespace/tefudoc", "rcr");
    private final static QName _DateInscriptionEtab_QNAME = new QName("http://www.theses.fr/namespace/sujets", "dateInscriptionEtab");
    private final static QName _TheseSurTravaux_QNAME = new QName("http://www.abes.fr/abes/documents/tef", "theseSurTravaux");
    private final static QName _AutoriteInterne_QNAME = new QName("http://www.abes.fr/abes/documents/tef", "autoriteInterne");
    private final static QName _Prenom_QNAME = new QName("http://www.abes.fr/abes/documents/tef", "prenom");
    private final static QName _NoteGenerale_QNAME = new QName("http://www.theses.fr/namespace/tefudoc", "noteGenerale");
    private final static QName _DatePremiereInscriptionDoctorat_QNAME = new QName("http://www.theses.fr/namespace/sujets", "datePremiereInscriptionDoctorat");
    private final static QName _Collation_QNAME = new QName("http://www.theses.fr/namespace/tefudoc", "collation");
    private final static QName _AvisJury_QNAME = new QName("http://www.abes.fr/abes/documents/tef", "avisJury");
    private final static QName _DateNaissance_QNAME = new QName("http://www.abes.fr/abes/documents/tef", "dateNaissance");
    private final static QName _ThesisDegreeLevel_QNAME = new QName("http://www.abes.fr/abes/documents/tef", "thesis.degree.level");
    private final static QName _ContratDoctoral_QNAME = new QName("http://www.theses.fr/namespace/sujets", "contratDoctoral");
    private final static QName _Name_QNAME = new QName("http://www.loc.gov/METS/", "name");
    private final static QName _Nom_QNAME = new QName("http://www.abes.fr/abes/documents/tef", "nom");
    private final static QName _BiblioIndex_QNAME = new QName("http://www.theses.fr/namespace/tefudoc", "biblioIndex");
    private final static QName _OaiSetSpec_QNAME = new QName("http://www.abes.fr/abes/documents/tef", "oaiSetSpec");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: fr.abes.theses.diffusion.model.tef
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link XmlData }
     * 
     */
    public XmlData createXmlData() {
        return new XmlData();
    }

    /**
     * Create an instance of {@link XmlData.StarGestion }
     * 
     */
    public XmlData.StarGestion createXmlDataStarGestion() {
        return new XmlData.StarGestion();
    }

    /**
     * Create an instance of {@link XmlData.StarGestion.Traitements }
     * 
     */
    public XmlData.StarGestion.Traitements createXmlDataStarGestionTraitements() {
        return new XmlData.StarGestion.Traitements();
    }

    /**
     * Create an instance of {@link XmlData.StarGestion.Traitements.Sorties }
     * 
     */
    public XmlData.StarGestion.Traitements.Sorties createXmlDataStarGestionTraitementsSorties() {
        return new XmlData.StarGestion.Traitements.Sorties();
    }

    /**
     * Create an instance of {@link XmlData.StarGestion.Traitements.Sorties.Diffusion }
     * 
     */
    public XmlData.StarGestion.Traitements.Sorties.Diffusion createXmlDataStarGestionTraitementsSortiesDiffusion() {
        return new XmlData.StarGestion.Traitements.Sorties.Diffusion();
    }

    /**
     * Create an instance of {@link XmlData.StarGestion.Traitements.Sorties.Diffusion.EtabDiffuseur }
     * 
     */
    public XmlData.StarGestion.Traitements.Sorties.Diffusion.EtabDiffuseur createXmlDataStarGestionTraitementsSortiesDiffusionEtabDiffuseur() {
        return new XmlData.StarGestion.Traitements.Sorties.Diffusion.EtabDiffuseur();
    }

    /**
     * Create an instance of {@link XmlData.StarGestion.Traitements.Sorties.Sudoc }
     * 
     */
    public XmlData.StarGestion.Traitements.Sorties.Sudoc createXmlDataStarGestionTraitementsSortiesSudoc() {
        return new XmlData.StarGestion.Traitements.Sorties.Sudoc();
    }

    /**
     * Create an instance of {@link DirecteurThese }
     * 
     */
    public DirecteurThese createDirecteurThese() {
        return new DirecteurThese();
    }

    /**
     * Create an instance of {@link AutoriteExterne }
     * 
     */
    public AutoriteExterne createAutoriteExterne() {
        return new AutoriteExterne();
    }

    /**
     * Create an instance of {@link VedetteRameauFamille }
     * 
     */
    public VedetteRameauFamille createVedetteRameauFamille() {
        return new VedetteRameauFamille();
    }

    /**
     * Create an instance of {@link ElementdEntree }
     * 
     */
    public ElementdEntree createElementdEntree() {
        return new ElementdEntree();
    }

    /**
     * Create an instance of {@link Subdivision }
     * 
     */
    public Subdivision createSubdivision() {
        return new Subdivision();
    }

    /**
     * Create an instance of {@link PartenaireRecherche }
     * 
     */
    public PartenaireRecherche createPartenaireRecherche() {
        return new PartenaireRecherche();
    }

    /**
     * Create an instance of {@link ThesisDegreeGrantor }
     * 
     */
    public ThesisDegreeGrantor createThesisDegreeGrantor() {
        return new ThesisDegreeGrantor();
    }

    /**
     * Create an instance of {@link Edition }
     * 
     */
    public Edition createEdition() {
        return new Edition();
    }

    /**
     * Create an instance of {@link Identifier }
     * 
     */
    public Identifier createIdentifier() {
        return new Identifier();
    }

    /**
     * Create an instance of {@link Exemplaires }
     * 
     */
    public Exemplaires createExemplaires() {
        return new Exemplaires();
    }

    /**
     * Create an instance of {@link Exemplaire }
     * 
     */
    public Exemplaire createExemplaire() {
        return new Exemplaire();
    }

    /**
     * Create an instance of {@link Cote }
     * 
     */
    public Cote createCote() {
        return new Cote();
    }

    /**
     * Create an instance of {@link ThesisDegreeName }
     * 
     */
    public ThesisDegreeName createThesisDegreeName() {
        return new ThesisDegreeName();
    }

    /**
     * Create an instance of {@link PresidentJury }
     * 
     */
    public PresidentJury createPresidentJury() {
        return new PresidentJury();
    }

    /**
     * Create an instance of {@link ThesisDegree }
     * 
     */
    public ThesisDegree createThesisDegree() {
        return new ThesisDegree();
    }

    /**
     * Create an instance of {@link ThesisDegreeDiscipline }
     * 
     */
    public ThesisDegreeDiscipline createThesisDegreeDiscipline() {
        return new ThesisDegreeDiscipline();
    }

    /**
     * Create an instance of {@link MembreJury }
     * 
     */
    public MembreJury createMembreJury() {
        return new MembreJury();
    }

    /**
     * Create an instance of {@link SujetRameau }
     * 
     */
    public SujetRameau createSujetRameau() {
        return new SujetRameau();
    }

    /**
     * Create an instance of {@link VedetteRameauNomCommun }
     * 
     */
    public VedetteRameauNomCommun createVedetteRameauNomCommun() {
        return new VedetteRameauNomCommun();
    }

    /**
     * Create an instance of {@link VedetteRameauAuteurTitre }
     * 
     */
    public VedetteRameauAuteurTitre createVedetteRameauAuteurTitre() {
        return new VedetteRameauAuteurTitre();
    }

    /**
     * Create an instance of {@link VedetteRameauCollectivite }
     * 
     */
    public VedetteRameauCollectivite createVedetteRameauCollectivite() {
        return new VedetteRameauCollectivite();
    }

    /**
     * Create an instance of {@link VedetteRameauNomGeographique }
     * 
     */
    public VedetteRameauNomGeographique createVedetteRameauNomGeographique() {
        return new VedetteRameauNomGeographique();
    }

    /**
     * Create an instance of {@link VedetteRameauPersonne }
     * 
     */
    public VedetteRameauPersonne createVedetteRameauPersonne() {
        return new VedetteRameauPersonne();
    }

    /**
     * Create an instance of {@link VedetteRameauTitre }
     * 
     */
    public VedetteRameauTitre createVedetteRameauTitre() {
        return new VedetteRameauTitre();
    }

    /**
     * Create an instance of {@link PersonMADS }
     * 
     */
    public PersonMADS createPersonMADS() {
        return new PersonMADS();
    }

    /**
     * Create an instance of {@link NamePart }
     * 
     */
    public NamePart createNamePart() {
        return new NamePart();
    }

    /**
     * Create an instance of {@link MADSAuthority }
     * 
     */
    public MADSAuthority createMADSAuthority() {
        return new MADSAuthority();
    }

    /**
     * Create an instance of {@link Nationalite }
     * 
     */
    public Nationalite createNationalite() {
        return new Nationalite();
    }

    /**
     * Create an instance of {@link Rapporteur }
     * 
     */
    public Rapporteur createRapporteur() {
        return new Rapporteur();
    }

    /**
     * Create an instance of {@link ThesisAdmin }
     * 
     */
    public ThesisAdmin createThesisAdmin() {
        return new ThesisAdmin();
    }

    /**
     * Create an instance of {@link Auteur }
     * 
     */
    public Auteur createAuteur() {
        return new Auteur();
    }

    /**
     * Create an instance of {@link DateAccepted }
     * 
     */
    public DateAccepted createDateAccepted() {
        return new DateAccepted();
    }

    /**
     * Create an instance of {@link EcoleDoctorale }
     * 
     */
    public EcoleDoctorale createEcoleDoctorale() {
        return new EcoleDoctorale();
    }

    /**
     * Create an instance of {@link ThesisRecord }
     * 
     */
    public ThesisRecord createThesisRecord() {
        return new ThesisRecord();
    }

    /**
     * Create an instance of {@link Title }
     * 
     */
    public Title createTitle() {
        return new Title();
    }

    /**
     * Create an instance of {@link Alternative }
     * 
     */
    public Alternative createAlternative() {
        return new Alternative();
    }

    /**
     * Create an instance of {@link Subject }
     * 
     */
    public Subject createSubject() {
        return new Subject();
    }

    /**
     * Create an instance of {@link Abstract }
     * 
     */
    public Abstract createAbstract() {
        return new Abstract();
    }

    /**
     * Create an instance of {@link Type }
     * 
     */
    public Type createType() {
        return new Type();
    }

    /**
     * Create an instance of {@link Language }
     * 
     */
    public Language createLanguage() {
        return new Language();
    }

    /**
     * Create an instance of {@link Agent }
     * 
     */
    public Agent createAgent() {
        return new Agent();
    }

    /**
     * Create an instance of {@link TechMD }
     * 
     */
    public TechMD createTechMD() {
        return new TechMD();
    }

    /**
     * Create an instance of {@link MdWrap }
     * 
     */
    public MdWrap createMdWrap() {
        return new MdWrap();
    }

    /**
     * Create an instance of {@link XmlData.StepGestion }
     * 
     */
    public XmlData.StepGestion createXmlDataStepGestion() {
        return new XmlData.StepGestion();
    }

    /**
     * Create an instance of {@link Mets }
     * 
     */
    public Mets createMets() {
        return new Mets();
    }

    /**
     * Create an instance of {@link MetsHdr }
     * 
     */
    public MetsHdr createMetsHdr() {
        return new MetsHdr();
    }

    /**
     * Create an instance of {@link AltRecordID }
     * 
     */
    public AltRecordID createAltRecordID() {
        return new AltRecordID();
    }

    /**
     * Create an instance of {@link DmdSec }
     * 
     */
    public DmdSec createDmdSec() {
        return new DmdSec();
    }

    /**
     * Create an instance of {@link AmdSec }
     * 
     */
    public AmdSec createAmdSec() {
        return new AmdSec();
    }

    /**
     * Create an instance of {@link StructMap }
     * 
     */
    public StructMap createStructMap() {
        return new StructMap();
    }

    /**
     * Create an instance of {@link Div }
     * 
     */
    public Div createDiv() {
        return new Div();
    }

    /**
     * Create an instance of {@link XmlData.StarGestion.Traitements.Entree }
     * 
     */
    public XmlData.StarGestion.Traitements.Entree createXmlDataStarGestionTraitementsEntree() {
        return new XmlData.StarGestion.Traitements.Entree();
    }

    /**
     * Create an instance of {@link XmlData.StarGestion.Traitements.Step }
     * 
     */
    public XmlData.StarGestion.Traitements.Step createXmlDataStarGestionTraitementsStep() {
        return new XmlData.StarGestion.Traitements.Step();
    }

    /**
     * Create an instance of {@link XmlData.StarGestion.Traitements.Maj }
     * 
     */
    public XmlData.StarGestion.Traitements.Maj createXmlDataStarGestionTraitementsMaj() {
        return new XmlData.StarGestion.Traitements.Maj();
    }

    /**
     * Create an instance of {@link XmlData.StarGestion.Traitements.Facile }
     * 
     */
    public XmlData.StarGestion.Traitements.Facile createXmlDataStarGestionTraitementsFacile() {
        return new XmlData.StarGestion.Traitements.Facile();
    }

    /**
     * Create an instance of {@link XmlData.StarGestion.Traitements.CtrlUrl }
     * 
     */
    public XmlData.StarGestion.Traitements.CtrlUrl createXmlDataStarGestionTraitementsCtrlUrl() {
        return new XmlData.StarGestion.Traitements.CtrlUrl();
    }

    /**
     * Create an instance of {@link XmlData.StarGestion.Traitements.RemonteeArchive }
     * 
     */
    public XmlData.StarGestion.Traitements.RemonteeArchive createXmlDataStarGestionTraitementsRemonteeArchive() {
        return new XmlData.StarGestion.Traitements.RemonteeArchive();
    }

    /**
     * Create an instance of {@link XmlData.StarGestion.Traitements.Purge }
     * 
     */
    public XmlData.StarGestion.Traitements.Purge createXmlDataStarGestionTraitementsPurge() {
        return new XmlData.StarGestion.Traitements.Purge();
    }

    /**
     * Create an instance of {@link XmlData.StarGestion.Traitements.Invalidation }
     * 
     */
    public XmlData.StarGestion.Traitements.Invalidation createXmlDataStarGestionTraitementsInvalidation() {
        return new XmlData.StarGestion.Traitements.Invalidation();
    }

    /**
     * Create an instance of {@link XmlData.StarGestion.Traitements.Sorties.Cines }
     * 
     */
    public XmlData.StarGestion.Traitements.Sorties.Cines createXmlDataStarGestionTraitementsSortiesCines() {
        return new XmlData.StarGestion.Traitements.Sorties.Cines();
    }

    /**
     * Create an instance of {@link XmlData.StarGestion.Traitements.Sorties.Diffusion.AbesDiffuseur }
     * 
     */
    public XmlData.StarGestion.Traitements.Sorties.Diffusion.AbesDiffuseur createXmlDataStarGestionTraitementsSortiesDiffusionAbesDiffuseur() {
        return new XmlData.StarGestion.Traitements.Sorties.Diffusion.AbesDiffuseur();
    }

    /**
     * Create an instance of {@link XmlData.StarGestion.Traitements.Sorties.Diffusion.Ccsd }
     * 
     */
    public XmlData.StarGestion.Traitements.Sorties.Diffusion.Ccsd createXmlDataStarGestionTraitementsSortiesDiffusionCcsd() {
        return new XmlData.StarGestion.Traitements.Sorties.Diffusion.Ccsd();
    }

    /**
     * Create an instance of {@link XmlData.StarGestion.Traitements.Sorties.Diffusion.AutresEtabDiffuseurs }
     * 
     */
    public XmlData.StarGestion.Traitements.Sorties.Diffusion.AutresEtabDiffuseurs createXmlDataStarGestionTraitementsSortiesDiffusionAutresEtabDiffuseurs() {
        return new XmlData.StarGestion.Traitements.Sorties.Diffusion.AutresEtabDiffuseurs();
    }

    /**
     * Create an instance of {@link XmlData.StarGestion.Traitements.Sorties.Diffusion.Oai }
     * 
     */
    public XmlData.StarGestion.Traitements.Sorties.Diffusion.Oai createXmlDataStarGestionTraitementsSortiesDiffusionOai() {
        return new XmlData.StarGestion.Traitements.Sorties.Diffusion.Oai();
    }

    /**
     * Create an instance of {@link XmlData.StarGestion.Traitements.Sorties.Diffusion.EtabDiffuseur.UrlEtabDiffuseur }
     * 
     */
    public XmlData.StarGestion.Traitements.Sorties.Diffusion.EtabDiffuseur.UrlEtabDiffuseur createXmlDataStarGestionTraitementsSortiesDiffusionEtabDiffuseurUrlEtabDiffuseur() {
        return new XmlData.StarGestion.Traitements.Sorties.Diffusion.EtabDiffuseur.UrlEtabDiffuseur();
    }

    /**
     * Create an instance of {@link XmlData.StarGestion.Traitements.Sorties.Sudoc.RCR }
     * 
     */
    public XmlData.StarGestion.Traitements.Sorties.Sudoc.RCR createXmlDataStarGestionTraitementsSortiesSudocRCR() {
        return new XmlData.StarGestion.Traitements.Sorties.Sudoc.RCR();
    }

    /**
     * Create an instance of {@link XmlData.StarGestion.Traitements.Sorties.Sudoc.EPN }
     * 
     */
    public XmlData.StarGestion.Traitements.Sorties.Sudoc.EPN createXmlDataStarGestionTraitementsSortiesSudocEPN() {
        return new XmlData.StarGestion.Traitements.Sorties.Sudoc.EPN();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.theses.fr/namespace/tefudoc", name = "peb")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createPeb(String value) {
        return new JAXBElement<String>(_Peb_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.loc.gov/METS/", name = "note")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createNote(String value) {
        return new JAXBElement<String>(_Note_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.theses.fr/namespace/tefudoc", name = "rcr")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createRcr(String value) {
        return new JAXBElement<String>(_Rcr_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.theses.fr/namespace/sujets", name = "dateInscriptionEtab")
    public JAXBElement<XMLGregorianCalendar> createDateInscriptionEtab(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DateInscriptionEtab_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.abes.fr/abes/documents/tef", name = "theseSurTravaux")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createTheseSurTravaux(String value) {
        return new JAXBElement<String>(_TheseSurTravaux_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.abes.fr/abes/documents/tef", name = "autoriteInterne")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createAutoriteInterne(String value) {
        return new JAXBElement<String>(_AutoriteInterne_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.abes.fr/abes/documents/tef", name = "prenom")
    public JAXBElement<String> createPrenom(String value) {
        return new JAXBElement<String>(_Prenom_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.theses.fr/namespace/tefudoc", name = "noteGenerale")
    public JAXBElement<String> createNoteGenerale(String value) {
        return new JAXBElement<String>(_NoteGenerale_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.theses.fr/namespace/sujets", name = "datePremiereInscriptionDoctorat")
    public JAXBElement<XMLGregorianCalendar> createDatePremiereInscriptionDoctorat(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DatePremiereInscriptionDoctorat_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.theses.fr/namespace/tefudoc", name = "collation")
    public JAXBElement<String> createCollation(String value) {
        return new JAXBElement<String>(_Collation_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.abes.fr/abes/documents/tef", name = "avisJury")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createAvisJury(String value) {
        return new JAXBElement<String>(_AvisJury_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.abes.fr/abes/documents/tef", name = "dateNaissance")
    public JAXBElement<XMLGregorianCalendar> createDateNaissance(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DateNaissance_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.abes.fr/abes/documents/tef", name = "thesis.degree.level")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createThesisDegreeLevel(String value) {
        return new JAXBElement<String>(_ThesisDegreeLevel_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.theses.fr/namespace/sujets", name = "contratDoctoral")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createContratDoctoral(String value) {
        return new JAXBElement<String>(_ContratDoctoral_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.loc.gov/METS/", name = "name")
    public JAXBElement<String> createName(String value) {
        return new JAXBElement<String>(_Name_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.abes.fr/abes/documents/tef", name = "nom")
    public JAXBElement<String> createNom(String value) {
        return new JAXBElement<String>(_Nom_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.theses.fr/namespace/tefudoc", name = "biblioIndex")
    public JAXBElement<String> createBiblioIndex(String value) {
        return new JAXBElement<String>(_BiblioIndex_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.abes.fr/abes/documents/tef", name = "oaiSetSpec")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createOaiSetSpec(String value) {
        return new JAXBElement<String>(_OaiSetSpec_QNAME, String.class, null, value);
    }

}
