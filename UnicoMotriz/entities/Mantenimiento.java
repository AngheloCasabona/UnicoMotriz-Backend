package pe.edu.upc.UnicoMotriz.entities;


import javax.persistence.*;

@Entity
@Table(name = "Mantenimiento")
public class Mantenimiento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int CMantenimiento;

    @Column(name = "NMantenimiento", length = 50, nullable = false)
    private String NMantenimiento;

    @Column(name = "M_Costo", length = 11, nullable = false)
    private int M_Costo;

    @Column(name = "CVehiculo", length = 6, nullable = false)
    private String CVehiculo;

    @ManyToOne
    @JoinColumn(name = "CMecanico", nullable = false)
    private Mecanico CMecanico;

public Mantenimiento() {}
    public Mantenimiento(int CMantenimiento, String NMantenimiento, int M_Costo, String CVehiculo
    ,Mecanico CMecanico)
    { this.CMantenimiento = CMantenimiento;
      this.NMantenimiento = NMantenimiento;
      this.M_Costo = M_Costo;
      this.CVehiculo = CVehiculo;
      this.CMecanico = CMecanico;
    }

    public int getCMantenimiento() {
        return CMantenimiento;
    }

    public void setCMantenimiento(int CMantenimiento) {
        this.CMantenimiento = CMantenimiento;
    }

    public String getNMantenimiento() {
        return NMantenimiento;
    }

    public void setNMantenimiento(String NMantenimiento) {
        this.NMantenimiento = NMantenimiento;
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
