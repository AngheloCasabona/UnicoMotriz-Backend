package pe.edu.upc.UnicoMotriz.entities;


import javax.persistence.*;

@Entity
@Table(name = "Mantenimiento")
public class Mantenimiento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cmantenimiento;

    @Column(name = "nmantenimiento", length = 50, nullable = false)
    private String nmantenimiento;

    @Column(name = "m_costo", length = 11, nullable = false)
    private int m_costo;
    @ManyToOne
    @JoinColumn(name = "cvehiculo", nullable = false)
    private Vehiculo cvehiculo;

    @ManyToOne
    @JoinColumn(name = "cmecanico", nullable = false)
    private Mecanico cmecanico;

public Mantenimiento() {}

    public Mantenimiento(int cmantenimiento, String nmantenimiento, int m_costo, Vehiculo cvehiculo
    ,Mecanico cmecanico)
    { this.cmantenimiento = cmantenimiento;
      this.nmantenimiento = nmantenimiento;
      this.m_costo = m_costo;
      this.cvehiculo = cvehiculo;
      this.cmecanico = cmecanico;
    }

    public int getCmantenimiento() {
        return cmantenimiento;
    }

    public void setCmantenimiento(int cmantenimiento) {
        this.cmantenimiento = cmantenimiento;
    }

    public String getNmantenimiento() {
        return nmantenimiento;
    }

    public void setNmantenimiento(String nmantenimiento) {
        this.nmantenimiento = nmantenimiento;
    }

    public int getM_costo() {
        return m_costo;
    }

    public void setM_costo(int m_costo) {
        this.m_costo = m_costo;
    }

    public Vehiculo getCvehiculo() {
        return cvehiculo;
    }

    public void setCvehiculo(Vehiculo cvehiculo) {
        this.cvehiculo = cvehiculo;
    }

    public Mecanico getCmecanico() {
        return cmecanico;
    }

    public void setCmecanico(Mecanico cmecanico) {
        this.cmecanico = cmecanico;
    }
}
