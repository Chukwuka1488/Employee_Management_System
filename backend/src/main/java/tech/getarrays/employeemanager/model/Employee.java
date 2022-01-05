package tech.getarrays.employeemanager.model;

import org.bson.codecs.pojo.annotations.BsonProperty;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;


import org.springframework.data.annotation.Id;

import lombok.Data;

@Data
@Document(collection = "employees")
public class Employee {

    @Id
    private String id;

    @Indexed(unique = true)
    @BsonProperty(value = "sap_personalnummer")
    private int SAP_Personalnummer;

    @BsonProperty(value = "spalte_1")
    private String Spalte1; // imageUrl

    @BsonProperty(value = "vorname")
    private String Vorname;

    @BsonProperty(value = "nachname")
    private String Nachname;

    @BsonProperty(value = "r_i")
    private String RI;

    @BsonProperty(value = "verfugbarkeit")
    private String Verfugbarkeit;

    @BsonProperty(value = "berufserfahrung")
    private String Berufserfahrung;

    @BsonProperty(value = "anu")
    private String ANU;

    @BsonProperty(value = "mobilitat")
    private String Mobilitat;

    @BsonProperty(value = "kompetenzen")
    private String Kompetenzen;

    @BsonProperty(value = "tools")
    private String Tools;

    @BsonProperty(value = "kompetenzen")
    private String Sprachen;

    @BsonProperty(value = "r_t")
    private String RT;

    @BsonProperty(value = "aktionen")
    private String Aktionen;

    @BsonProperty(value = "projektwunsch")
    private String Projektwunsch;

    @BsonProperty(value = "schwerpunkt")
    private String Schwerpunkt;

    @BsonProperty(value = "division")
    private String Division;

    @BsonProperty(value = "einheit")
    private String Einheit;

    @BsonProperty(value = "position_ri")
    private String Position_RI;

    @BsonProperty(value = "manager_1")
    private String Manager1;

    @BsonProperty(value = "manager_2")
    private String Manager2;

    // CONSTRUCTORS
    public Employee(int SAP_Personalnummer, String Spalte1, String Vorname, String Nachname, String RI,
                    String Verfugbarkeit, String Berufserfahrung, String ANU, String Mobilitat,
                    String Kompetenzen, String Tools, String Sprachen, String RT, String Aktionen,
                    String Projektwunsch, String Schwerpunkt, String Division, String Einheit, String Position_RI,
                    String Manager1, String Manager2) {
        this.SAP_Personalnummer = SAP_Personalnummer;
        this.Spalte1 = Spalte1;
        this.Vorname = Vorname;
        this.Nachname = Nachname;
        this.RI = RI;
        this.Verfugbarkeit = Verfugbarkeit;
        this.Berufserfahrung = Berufserfahrung;
        this.ANU = ANU;
        this.Mobilitat = Mobilitat;
        this.Kompetenzen = Kompetenzen;
        this.Tools = Tools;
        this.Sprachen = Sprachen;
        this.RT = RT;
        this.Aktionen = Aktionen;
        this.Projektwunsch = Projektwunsch;
        this.Schwerpunkt = Schwerpunkt;
        this.Division = Division;
        this.Einheit = Einheit;
        this.Position_RI = Position_RI;
        this.Manager1 = Manager1;
        this.Manager2 = Manager2;
    }

    // GETTERS & SETTERS


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getSAP_Personalnummer() {
        return SAP_Personalnummer;
    }

    public void setSAP_Personalnummer(int SAP_Personalnummer) {
        this.SAP_Personalnummer = SAP_Personalnummer;
    }

    public String getSpalte1() {
        return Spalte1;
    }

    public void setSpalte1(String spalte1) {
        Spalte1 = spalte1;
    }

    public String getVorname() {
        return Vorname;
    }

    public void setVorname(String vorname) {
        Vorname = vorname;
    }

    public String getNachname() {
        return Nachname;
    }

    public void setNachname(String nachname) {
        Nachname = nachname;
    }

    public String getRI() {
        return RI;
    }

    public void setRI(String RI) {
        this.RI = RI;
    }

    public String getVerfugbarkeit() {
        return Verfugbarkeit;
    }

    public void setVerfugbarkeit(String verfugbarkeit) {
        Verfugbarkeit = verfugbarkeit;
    }

    public String getBerufserfahrung() {
        return Berufserfahrung;
    }

    public void setBerufserfahrung(String berufserfahrung) {
        Berufserfahrung = berufserfahrung;
    }

    public String getANU() {
        return ANU;
    }

    public void setANU(String ANU) {
        this.ANU = ANU;
    }

    public String getMobilitat() {
        return Mobilitat;
    }

    public void setMobilitat(String mobilitat) {
        Mobilitat = mobilitat;
    }

    public String getKompetenzen() {
        return Kompetenzen;
    }

    public void setKompetenzen(String kompetenzen) {
        Kompetenzen = kompetenzen;
    }

    public String getTools() {
        return Tools;
    }

    public void setTools(String tools) {
        Tools = tools;
    }

    public String getSprachen() {
        return Sprachen;
    }

    public void setSprachen(String sprachen) {
        Sprachen = sprachen;
    }

    public String getRT() {
        return RT;
    }

    public void setRT(String RT) {
        this.RT = RT;
    }

    public String getAktionen() {
        return Aktionen;
    }

    public void setAktionen(String aktionen) {
        Aktionen = aktionen;
    }

    public String getProjektwunsch() {
        return Projektwunsch;
    }

    public void setProjektwunsch(String projektwunsch) {
        Projektwunsch = projektwunsch;
    }

    public String getSchwerpunkt() {
        return Schwerpunkt;
    }

    public void setSchwerpunkt(String schwerpunkt) {
        Schwerpunkt = schwerpunkt;
    }

    public String getDivision() {
        return Division;
    }

    public void setDivision(String division) {
        Division = division;
    }

    public String getEinheit() {
        return Einheit;
    }

    public void setEinheit(String einheit) {
        Einheit = einheit;
    }

    public String getPosition_RI() {
        return Position_RI;
    }

    public void setPosition_RI(String position_RI) {
        Position_RI = position_RI;
    }

    public String getManager1() {
        return Manager1;
    }

    public void setManager1(String manager1) {
        Manager1 = manager1;
    }

    public String getManager2() {
        return Manager2;
    }

    public void setManager2(String manager2) {
        Manager2 = manager2;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", SAP_Personalnummer=" + SAP_Personalnummer +
                ", Spalte1='" + Spalte1 + '\'' +
                ", Vorname='" + Vorname + '\'' +
                ", Nachname='" + Nachname + '\'' +
                ", RI='" + RI + '\'' +
                ", Verfugbarkeit='" + Verfugbarkeit + '\'' +
                ", Berufserfahrung='" + Berufserfahrung + '\'' +
                ", ANU='" + ANU + '\'' +
                ", Mobilitat='" + Mobilitat + '\'' +
                ", Kompetenzen='" + Kompetenzen + '\'' +
                ", Tools='" + Tools + '\'' +
                ", Sprachen='" + Sprachen + '\'' +
                ", RT='" + RT + '\'' +
                ", Aktionen='" + Aktionen + '\'' +
                ", Projektwunsch='" + Projektwunsch + '\'' +
                ", Schwerpunkt='" + Schwerpunkt + '\'' +
                ", Division='" + Division + '\'' +
                ", Einheit='" + Einheit + '\'' +
                ", Position_RI='" + Position_RI + '\'' +
                ", Manager1='" + Manager1 + '\'' +
                ", Manager2='" + Manager2 + '\'' +
                '}';
    }
}
