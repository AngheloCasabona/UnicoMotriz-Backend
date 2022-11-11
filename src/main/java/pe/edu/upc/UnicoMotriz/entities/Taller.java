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
@Table(name = "taller")

public class Taller {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ctaller")
    private int ctaller;
    @Column(name = "ntaller",length = 50,nullable = false)
    private String ntaller;
    @Column(name = "tdireccion",length = 50,nullable = false)
    private String tdireccion;
    @Column(name = "cruc",length = 11,nullable = false)
    private int cruc;



    public Taller(){}

    public Taller(int ctaller, String ntaller, String tdireccion, int cruc) {
        this.ctaller = ctaller;
        this.ntaller = ntaller;
        this.tdireccion = tdireccion;
        this.cruc = cruc;
    }

    public int getIdTaller() {
        return ctaller;
    }

    public void setctaller(int ctaller) {
        this.ctaller = ctaller;
    }

    public String getntaller() {
        return ntaller;
    }

    public void setntaller(String ntaller) {
        this.ntaller = ntaller;
    }

    public String gettdireccion() {
        return tdireccion;
    }

    public void settdireccion(String tdireccion) {
        this.tdireccion = tdireccion;
    }

    public int getcruc() {
        return cruc;
    }

    public void setcruc(int cruc) {
        this.cruc = cruc;
    }
}
