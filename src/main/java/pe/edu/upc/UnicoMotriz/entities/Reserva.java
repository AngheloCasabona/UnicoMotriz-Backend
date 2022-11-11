package pe.edu.upc.UnicoMotriz.entities;
import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name = "Reserva")
public class Reserva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CReserva")
    private int CReserva;
    @Column(name = "DFecha", length = 50, nullable = false)
    private Date DFecha;
    @Column(name = "TDetalle", length = 50, nullable = false)
    private String TDetalle;
    @Column(name = "CFactura", length = 50, nullable = false)
    private int CFactura;
    @Column(name = "CProducto", length = 10, nullable = false)
    private int CProducto;
    @Column(name = "CMecanico", length = 10, nullable = false)
    private int CMecanico;


    public Reserva() {
    }

    public Reserva(int CReserva, Date DFecha, String TDetalle, int CFactura, int CProducto, int CMecanico) {
        this.CReserva = CReserva;
        this.DFecha = DFecha;
        this.TDetalle = TDetalle;
        this.CFactura = CFactura;
        this.CProducto = CProducto;
        this.CMecanico = CMecanico;
    }

    public int getCReserva() {
        return CReserva;
    }

    public void setCReserva(int CReserva) {
        this.CReserva = CReserva;
    }

    public Date getDFecha() {
        return DFecha;
    }

    public void setDFecha(Date DFecha) {
        this.DFecha = DFecha;
    }

    public String getTDetalle() {
        return TDetalle;
    }

    public void setTDetalle(String TDetalle) {
        this.TDetalle = TDetalle;
    }

    public int getCFactura() {
        return CFactura;
    }

    public void setCFactura(int CFactura) {
        this.CFactura = CFactura;
    }

    public int getCProducto() {
        return CProducto;
    }

    public void setCProducto(int CProducto) {
        this.CProducto = CProducto;
    }

    public int getCMecanico() {
        return CMecanico;
    }

    public void setCMecanico(int CMecanico) {
        this.CMecanico = CMecanico;}
    }


