package pe.edu.upc.UnicoMotriz.entities;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Factura")
public class Factura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cfactura;
    @Column(name = "dfecha",length = 45,nullable = false)
    @JsonSerialize(using = ToStringSerializer.class)
    private LocalDate dfecha;
    @Column(name = "monto",length = 35,nullable = false)
    private String monto;


    public Factura(){}

    public Factura(int cfactura, LocalDate dfecha, String monto) {
        this.cfactura = cfactura;
        this.dfecha = dfecha;
        this.monto = monto;
    }

    public int getCFactura() {        return cfactura;    }

    public void setCFactura(int cfactura) {        this.cfactura = cfactura;    }

    public LocalDate getDFecha() {        return dfecha;    }

    public void setDFecha(LocalDate dfecha) {        this.dfecha = dfecha;    }

    public String getMonto() {        return monto;    }

    public void setMonto(String monto) {        this.monto = monto;    }
}
