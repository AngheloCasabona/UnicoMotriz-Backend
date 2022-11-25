package pe.edu.upc.UnicoMotriz.entities;

import javax.persistence.*;



@Entity
@Table(name = "Personalizacion")
public class Personalizacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cpersonalizacion;
    @Column(name = "npersonalizacion", length = 50, nullable = false)
    private String npersonalizacion;

    @Column(name = "m_costo", length = 11, nullable = false)
    private int m_costo;

    @ManyToOne
    @JoinColumn(name = "cvehiculo", nullable = false)
    private Vehiculo cvehiculo;

    @ManyToOne
    @JoinColumn(name = "cmecanico", nullable = false)
    private Mecanico cmecanico;

public Personalizacion(){}
    public Personalizacion(int cpersonalizacion, String npersonalizacion, int m_costo, Vehiculo cvehiculo,
                           Mecanico cmecanico)
    {
        this.cpersonalizacion = cpersonalizacion;
        this.npersonalizacion = npersonalizacion;
        this.m_costo = m_costo;
        this.cvehiculo = cvehiculo;
        this.cmecanico = cmecanico;
    }

    public int getCpersonalizacion() {
        return cpersonalizacion;
    }

    public void setCpersonalizacion(int cpersonalizacion) {
        this.cpersonalizacion = cpersonalizacion;
    }

    public String getNpersonalizacion() {
        return npersonalizacion;
    }

    public void setNpersonalizacion(String npersonalizacion) {
        this.npersonalizacion = npersonalizacion;
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
