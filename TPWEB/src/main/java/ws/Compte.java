package ws;


import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlTransient;

import java.util.Date;

@XmlRootElement(name="compte")
//@XmlRootElement // This annotation makes the class serializable by JAX-WS (required for web services)
@XmlAccessorType(XmlAccessType.FIELD)
public class Compte {

    private int code;
    private double solde;
    @XmlTransient
    private Date dateCreation;

    // Default constructor for JAXB
    public Compte() {
    }

    // Constructor with parameters
    public Compte(int code, double solde, Date dateCreation) {
        this.code = code;
        this.solde = solde;
        this.dateCreation = dateCreation;
    }

    // Getters and Setters with JAXB annotations
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }


    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }


    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }
}
