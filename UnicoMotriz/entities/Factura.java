package pe.edu.upc.UnicoMotriz.entities;

import javax.persistence.*;

@Entity
@Table(name = "Factura")
public class Factura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int CFactura;
    @Column(name = "DFecha",length = 45,nullable = false)
    private String DFecha;
 @Column(name = "Monto",length = 35,nullable = false)
    private String Monto;


    public Factura(){}

    public Factura(int CFactura, String DFecha, String monto) {
        this.CFactura = CFactura;
        this.DFecha = DFecha;
        this.Monto = monto;
    }

    public int getCFactura() {        return CFactura;    }

    public void setCFactura(int CFactura) {        this.CFactura = CFactura;    }

    public String getDFecha() {        return DFecha;    }

    public void setDFecha(String DFecha) {        this.DFecha = DFecha;    }

    public String getMonto() {        return Monto;    }

    public void setMonto(String monto) {        this.Monto = monto;    }
}
