package pe.edu.upc.UnicoMotriz.entities;

import jdk.jfr.Enabled;

import javax.persistence.*;

@Entity
@Table(name = "DetalleVenta")
public class DetalleVenta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "ccliente",length = 45, nullable = false)
    private int ccliente;

    @Column(name = "ctaller",length = 45, nullable = false)
    private int ctaller;

    @Column(name = "cfactura",length = 45, nullable = false)
    private int cfactura;

    @Column(name = "tdetalle",length = 45, nullable = false)
    private String tdetalle;

    public DetalleVenta(){}

    public  DetalleVenta(int ccliente, int ctaller, int cfactura, String tdetalle){
        this.ccliente=ccliente;
        this.ctaller=ctaller;
        this.cfactura=cfactura;
        this.tdetalle=tdetalle;
    }

    public int getCCliente(){return ccliente;}
    public void setCCliente(int ccliente){this.ccliente=ccliente;}

    public int getCTaller(){return ctaller;}
    public void setCTaller(int ctaller){this.ctaller=ctaller;}

    public int getCFactura(){return cfactura;}
    public void setCFactura(int CFactura){this.cfactura=cfactura;}

    public String getTDetalle(){return tdetalle;}
    public  void setTDetalle(String tdetalle){this.tdetalle=tdetalle;}
}


