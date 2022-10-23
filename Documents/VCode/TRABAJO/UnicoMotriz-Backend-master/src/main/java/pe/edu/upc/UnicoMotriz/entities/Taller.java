package pe.edu.upc.UnicoMotriz.entities;

import javax.persistence.*;

@Entity
@Table(name = "Taller")

public class Taller {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CTaller")
private int idTaller;
    @Column(name = "NTaller",length = 50,nullable = false)
private String NTaller;
    @Column(name = "TDireccion",length = 50,nullable = false)
private String TDireccion;
    @Column(name = "Cruc",length = 11,nullable = false)
private int Cruc;

public Taller(){}

    public Taller(int idTaller, String NTaller, String TDireccion, int Cruc) {
        this.idTaller = idTaller;
        this.NTaller = NTaller;
        this.TDireccion = TDireccion;
        this.Cruc = Cruc;
    }

    public int getIdTaller() {
        return idTaller;
    }

    public void setIdTaller(int idTaller) {
        this.idTaller = idTaller;
    }

    public String getNTaller() {
        return NTaller;
    }

    public void setNTaller(String NTaller) {
        this.NTaller = NTaller;
    }

    public String getTDireccion() {
        return TDireccion;
    }

    public void setTDireccion(String TDireccion) {
        this.TDireccion = TDireccion;
    }

    public int getCruc() {
        return Cruc;
    }

    public void setCruc(int Cruc) {
        this.Cruc = Cruc;
    }
}
