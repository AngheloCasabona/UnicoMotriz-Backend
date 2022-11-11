package pe.edu.upc.UnicoMotriz.entities;

import javax.persistence.*;



@Entity
@Table(name = "Personalizacion")
public class Personalizacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int CPersonalizacion;
    @Column(name = "NPersonalizacion", length = 50, nullable = false)
    private String NPersonalizacion;

    @Column(name = "M_Costo", length = 11, nullable = false)
    private int M_Costo;

    @Column(name = "CVehiculo", length = 50, nullable = false)
    private String CVehiculo;

    @ManyToOne
    @JoinColumn(name = "CMecanico", nullable = false)
    private Mecanico CMecanico;

public Personalizacion(){}
    public Personalizacion(int CPersonalizacion, String NPersonalizacion, int M_Costo, String CVehiculo,
                           Mecanico CMecanico)
    {
        this.CPersonalizacion = CPersonalizacion;
        this.NPersonalizacion = NPersonalizacion;
        this.M_Costo = M_Costo;
        this.CVehiculo = CVehiculo;
        this.CMecanico = CMecanico;
    }

    public int getCPersonalizacion() {
        return CPersonalizacion;
    }

    public void setCPersonalizacion(int CPersonalizacion) {
        this.CPersonalizacion = CPersonalizacion;
    }

    public String getNPersonalizacion() {
        return NPersonalizacion;
    }

    public void setNPersonalizacion(String NPersonalizacion) {
        this.NPersonalizacion = NPersonalizacion;
    }

    public int getM_Costo() {
        return M_Costo;
    }

    public void setM_Costo(int m_Costo) {
        M_Costo = m_Costo;
    }

    public String getCVehiculo() {
        return CVehiculo;
    }

    public void setCVehiculo(String CVehiculo) {
        this.CVehiculo = CVehiculo;
    }

    public Mecanico getCMecanico() {
        return CMecanico;
    }

    public void setCMecanico(Mecanico CMecanico) {
        this.CMecanico = CMecanico;
    }
}
