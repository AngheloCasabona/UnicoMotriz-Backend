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
    @Column(name = "CMecanico")
    private int CMecanico;
    @Column(name = "NMecanico", length = 50, nullable = false)
    private String NMecanico;
    @Column(name = "TCorreo", length = 50, nullable = false)
    private String TCorreo;
    @Column(name = "TClave", length = 50, nullable = false)
    private String TClave;

    @ManyToOne

    @JoinColumn(name = "ctaller", nullable = false)
    private Taller ctaller;



    public Mecanico(int CMecanico, String NMecanico, String TCorreo, String TClave, Taller ctaller) {
        this.CMecanico = CMecanico;
        this.NMecanico = NMecanico;
        this.TCorreo = TCorreo;
        this.TClave = TClave;
        this.ctaller = ctaller;
    }
    public Mecanico() {
        super();
        // TODO Auto-generated constructor stub

    }
    public int getCMecanico() {
        return CMecanico;
    }

    public void setCMecanico(int CMecanico) {
        this.CMecanico = CMecanico;
    }

    public String getNMecanico() {
        return NMecanico;
    }

    public void setNMecanico(String NMecanico) {
        this.NMecanico = NMecanico;
    }

    public String getTCorreo() {
        return TCorreo;
    }

    public void setTCorreo(String TCorreo) {
        this.TCorreo = TCorreo;
    }

    public String getTClave() {
        return TClave;
    }

    public void setTClave(String TClave) {
        this.TClave = TClave;
    }

    public Taller getTaller() {
        return ctaller;
    }

    public void setTaller(Taller ctaller) {
        this.ctaller = ctaller;
    }
}
