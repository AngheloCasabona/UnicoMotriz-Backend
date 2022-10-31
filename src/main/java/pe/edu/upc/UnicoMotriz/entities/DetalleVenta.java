package pe.edu.upc.UnicoMotriz.entities;

import jdk.jfr.Enabled;

import javax.persistence.*;

@Entity
@Table(name = "DetalleVenta")
public class DetalleVenta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "CCliente",length = 45, nullable = false)
    private int CCliente;

    @Column(name = "CTaller",length = 45, nullable = false)
    private int CTaller;

    @Column(name = "CFactura",length = 45, nullable = false)
    private int CFactura;

    @Column(name = "TDetalle",length = 45, nullable = false)
    private String TDetalle;

    public DetalleVenta(){}

    public  DetalleVenta(int CCliente, int CTaller, int CFactura, String TDetalle){
        this.CCliente=CCliente;
        this.CTaller=CTaller;
        this.CFactura=CFactura;
        this.TDetalle=TDetalle;
    }

    public int getCCliente(){return CCliente;}
    public void setCCliente(int CCliente){this.CCliente=CCliente;}

    public int getCTaller(){return CTaller;}
    public void setCTaller(int CTaller){this.CTaller=CTaller;}

    public int getCFactura(){return CFactura;}
    public void setCFactura(int CFactura){this.CFactura=CFactura;}

    public String getTDetalle(){return TDetalle;}
    public  void setTDetalle(String TDetalle){this.TDetalle=TDetalle;}
}


