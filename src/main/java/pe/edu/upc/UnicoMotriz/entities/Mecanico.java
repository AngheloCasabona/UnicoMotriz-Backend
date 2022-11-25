package pe.edu.upc.UnicoMotriz.entities;

import javax.persistence.*;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Mecanico")
public class Mecanico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cmecanico")
    private int cmecanico;
    @Column(name = "nmecanico", length = 50, nullable = false)
    private String nmecanico;
    @Column(name = "tcorreo", length = 50, nullable = false)
    private String tcorreo;
    @Column(name = "tclave", length = 50, nullable = false)
    private String tclave;

    @ManyToOne

    @JoinColumn(name = "ctaller", nullable = false)
    private Taller taller;
    /* private Taller ctaller;*/


    public Mecanico() {
        super();
    }

    public Mecanico(int cmecanico, String nmecanico, String tcorreo, String tclave, Taller taller) {
        this.cmecanico = cmecanico;
        this.nmecanico = nmecanico;
        this.tcorreo = tcorreo;
        this.tclave = tclave;
        this.taller = taller;
    }

    public int getCmecanico() {
        return cmecanico;
    }

    public void setCmecanico(int cmecanico) {
        this.cmecanico = cmecanico;
    }

    public String getNmecanico() {
        return nmecanico;
    }

    public void setNmecanico(String nmecanico) {
        this.nmecanico = nmecanico;
    }

    public String getTcorreo() {
        return tcorreo;
    }

    public void setTcorreo(String tcorreo) {
        this.tcorreo = tcorreo;
    }

    public String getTclave() {
        return tclave;
    }

    public void setTclave(String tclave) {
        this.tclave = tclave;
    }

    public Taller getTaller() {
        return taller;
    }

    public void setTaller(Taller taller) {
        this.taller = taller;
    }
}
/*
    public Mecanico(int cmecanico, String nmecanico, String tcorreo, String tclave, Taller ctaller) {
        this.cmecanico = cmecanico;
        this.nmecanico = nmecanico;
        this.tcorreo = tcorreo;
        this.tclave = tclave;
        this.ctaller = ctaller;
    }

    public int getCmecanico() {
        return cmecanico;
    }

    public void setCmecanico(int cmecanico) {
        this.cmecanico = cmecanico;
    }

    public String getNmecanico() {
        return nmecanico;
    }

    public void setNmecanico(String nmecanico) {
        this.nmecanico = nmecanico;
    }

    public String getTcorreo() {
        return tcorreo;
    }

    public void setTcorreo(String tcorreo) {
        this.tcorreo = tcorreo;
    }

    public String getTclave() {
        return tclave;
    }

    public void setTclave(String tclave) {
        this.tclave = tclave;
    }

    public Taller getCtaller() {
        return ctaller;
    }

    public void setCtaller(Taller ctaller) {
        this.ctaller = ctaller;
    }
}*/