package pe.edu.upc.UnicoMotriz.entities;

import javax.persistence.*;

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
    /*
    @ManyToOne
            @JoinColumn(name = "CTaller")
    */
    @Column(name = "CTaller", length = 10, nullable = false)
    private String CTaller;

    public Mecanico() {
    }

    public Mecanico(int CMecanico, String NMecanico, String TCorreo, String TClave, String CTaller) {
        this.CMecanico = CMecanico;
        this.NMecanico = NMecanico;
        this.TCorreo = TCorreo;
        this.TClave = TClave;
        this.CTaller = CTaller;
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

    public String getCTaller() {
        return CTaller;
    }

    public void setCTaller(String CTaller) {
        this.CTaller = CTaller;
    }
}
