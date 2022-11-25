package pe.edu.upc.UnicoMotriz.entities;

import jdk.jfr.Enabled;

import javax.persistence.*;

@Entity
@Table(name = "DetalleVenta")
public class DetalleVenta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cdetalle;

    @ManyToOne
    @JoinColumn(name = "ccliente", nullable = false)
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "ctaller", nullable = false)
    private Taller taller;

    @ManyToOne
    @JoinColumn(name = "cfactura", nullable = false)
    private Factura cfactura;

    @Column(name = "tdetalle",length = 45, nullable = false)
    private String tdetalle;

    public DetalleVenta(){super();}


    public  DetalleVenta(int cdetalle, Cliente cliente, Taller taller, Factura cfactura, String tdetalle){
        this.cdetalle=cdetalle;
        this.cliente=cliente;
        this.taller=taller;
        this.cfactura=cfactura;
        this.tdetalle=tdetalle;
    }
    public int getCdetalle() {
        return cdetalle;
    }

    public void setCdetalle(int cdetalle) {
        this.cdetalle = cdetalle;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Taller getTaller() {
        return taller;
    }

    public void setTaller(Taller taller) {
        this.taller = taller;
    }

    public Factura getCfactura() {
        return cfactura;
    }

    public void setCfactura(Factura cfactura) {
        this.cfactura = cfactura;
    }

    public String getTdetalle() {
        return tdetalle;
    }

    public void setTdetalle(String tdetalle) {
        this.tdetalle = tdetalle;
    }

}


