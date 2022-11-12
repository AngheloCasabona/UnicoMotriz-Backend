package pe.edu.upc.UnicoMotriz.entities;

import javax.persistence.*;


@Entity
@Table(name = "Producto")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int CProducto;
    @Column(name = "NProducto",length = 45,nullable = false)
    private String NProducto;
    @Column(name = "CostoUnidad",length = 35,nullable = false)
    private String CostoUnidad;
    @Column(name = "VentaUnidad",length = 25,nullable = false)
    private String VentaUnidad;


    public Producto(){}

    public Producto(int CProducto, String NProducto, String  CostoUnidad, String VentaUnidad) {
        this.CProducto = CProducto;
        this.NProducto = NProducto;
        this.CostoUnidad = CostoUnidad;
        this.VentaUnidad = VentaUnidad;
    }

    public int getCProducto() {
        return CProducto;
    }

    public void setCProducto(int CProducto) {
        this.CProducto = CProducto;
    }

    public String getNProducto() {
        return NProducto;
    }

    public void setNProducto(String NProducto) {
        this.NProducto = NProducto;
    }

    public String getCostoUnidad() {
        return CostoUnidad;
    }

    public void setCostoUnidad(String costoUnidad) {
        CostoUnidad = costoUnidad;
    }

    public String getVentaUnidad() {
        return VentaUnidad;
    }

    public void setVentaUnidad(String ventaUnidad) {
        VentaUnidad = ventaUnidad;
    }
}
