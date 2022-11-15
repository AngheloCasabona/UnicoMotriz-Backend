package pe.edu.upc.UnicoMotriz.entities;

import javax.persistence.*;

@Entity
@Table(name = "Factura")
public class Factura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cfactura;
    @Column(name = "dfecha",length = 45,nullable = false)
    private String dfecha;
    @Column(name = "monto",length = 35,nullable = false)
    private String monto;


    public Factura(){}

    public Factura(int cfactura, String dfecha, String monto) {
        this.cfactura = cfactura;
        this.dfecha = dfecha;
        this.monto = monto;
    }

    public int getCFactura() {        return cfactura;    }

    public void setCFactura(int cfactura) {        this.cfactura = cfactura;    }

    public String getDFecha() {        return dfecha;    }

    public void setDFecha(String dfecha) {        this.dfecha = dfecha;    }

    public String getMonto() {        return monto;    }

    public void setMonto(String monto) {        this.monto = monto;    }
}
