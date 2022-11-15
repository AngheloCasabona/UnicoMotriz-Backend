package pe.edu.upc.UnicoMotriz.entities;

import javax.persistence.*;

@Entity
@Table(name = "Vehiculo")
public class Vehiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CVehiculo",length = 45, nullable = false)
    private int CVehiculo;
    @Column(name = "tDetalle",length = 45, nullable = false)
    private String tDetalle;
    @Column(name = "dAno",length = 45, nullable = false)
    private String dAno;
    @Column(name = "nMarca",length = 45, nullable = false)
    private String nMarca;
    @Column(name = "nModelo",length = 45, nullable = false)
    private String nModelo;
    @ManyToOne
    @JoinColumn(name = "cliente", nullable = false)
    private Cliente cliente;

    public Vehiculo() {
    }

    public Vehiculo(int CVehiculo, String tDetalle, String dAno, String nMarca, String nModelo, Cliente cliente) {
        this.CVehiculo = CVehiculo;
        this.tDetalle = tDetalle;
        this.dAno = dAno;
        this.nMarca = nMarca;
        this.nModelo = nModelo;
        this.cliente = cliente;
    }

    public int getCVehiculo() {
        return CVehiculo;
    }

    public void setCVehiculo(int CVehiculo) {
        this.CVehiculo = CVehiculo;
    }

    public String gettDetalle() {
        return tDetalle;
    }

    public void settDetalle(String tDetalle) {
        this.tDetalle = tDetalle;
    }

    public String getdAno() {
        return dAno;
    }

    public void setdAno(String dAno) {
        this.dAno = dAno;
    }

    public String getnMarca() {
        return nMarca;
    }

    public void setnMarca(String nMarca) {
        this.nMarca = nMarca;
    }

    public String getnModelo() {
        return nModelo;
    }

    public void setnModelo(String nModelo) {
        this.nModelo = nModelo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
