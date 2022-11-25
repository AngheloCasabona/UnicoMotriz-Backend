package pe.edu.upc.UnicoMotriz.entities;

import javax.persistence.*;
@Entity
@Table(name = "Taller")
public class Taller {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ctaller;
    @Column(name = "ntaller",length = 50,nullable = false)
    private String ntaller;
    @Column(name = "tdireccion",length = 50,nullable = false)
    private String tdireccion;
    @Column(name = "cruc",length = 11,nullable = false)
    private String cruc;



    public Taller(){}

    public Taller(int ctaller, String ntaller, String tdireccion, String cruc) {
        this.ctaller = ctaller;
        this.ntaller = ntaller;
        this.tdireccion = tdireccion;
        this.cruc = cruc;
    }

    public int getCtaller() {
        return ctaller;
    }

    public void setCtaller(int ctaller) {
        this.ctaller = ctaller;
    }

    public String getNtaller() {
        return ntaller;
    }

    public void setNtaller(String ntaller) {
        this.ntaller = ntaller;
    }

    public String getTdireccion() {
        return tdireccion;
    }

    public void setTdireccion(String tdireccion) {
        this.tdireccion = tdireccion;
    }

    public String getCruc() {
        return cruc;
    }

    public void setCruc(String cruc) {
        this.cruc = cruc;
    }
}
