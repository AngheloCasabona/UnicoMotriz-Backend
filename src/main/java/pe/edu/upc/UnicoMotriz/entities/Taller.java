package pe.edu.upc.UnicoMotriz.entities;

import javax.persistence.*;

@Entity
@Table(name = "Taller")

public class Taller {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CTaller")
private int id;
    @Column(name = "NTaller",length = 45,nullable = false)
private String NTaller;
    @Column(name = "TDireccion",length = 35,nullable = false)
private String TDireccion;
    @Column(name = "Cruc",length = 35,nullable = false)
private String Cruc;

public Taller(){}

    public Taller(int id, String NTaller, String TDireccion, String cruc) {
        this.id = id;
        this.NTaller = NTaller;
        this.TDireccion = TDireccion;
        this.Cruc = cruc;
    }

    public int getId() {     return id;    }

    public void setId(int id) {        this.id = id;    }

    public String getNTaller() {        return NTaller;    }

    public void setNTaller(String NTaller) {        this.NTaller = NTaller;    }

    public String getTDireccion() {        return TDireccion;    }

    public void setTDireccion(String TDireccion) {        this.TDireccion = TDireccion;    }

    public String getCruc() {        return Cruc;    }

    public void setCruc(String cruc) {       this.Cruc = cruc;    }
}
