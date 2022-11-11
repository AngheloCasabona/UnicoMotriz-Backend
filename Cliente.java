package pe.edu.upc.UnicoMotriz.entities;

import javax.persistence.*;

@Entity
@Table(name = "Cliente")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int CCliente;
    @Column(name = "NCliente", length = 50, nullable = false)
    private String NCliente;
    @Column(name = "TCorreo", length = 50, nullable = false)
    private String TCorreo;
    @Column(name = "TClave", length = 50, nullable = false)
    private String TClave;
    @Column(name = "TTelefono", length = 9, nullable = false)
    private String TTelefono;
    @Column(name = "CRuc", length = 11, nullable = false)
    private int CRuc;

    public Cliente() {
    }

    public Cliente(int CCliente, String NCliente, String TCorreo, String TClave, String TTelefono, int CRuc) {
        this.CCliente = CCliente;
        this.NCliente = NCliente;
        this.TCorreo = TCorreo;
        this.TClave = TClave;
        this.TTelefono = TTelefono;
        this.CRuc = CRuc;
    }

    public int getCCliente() {
        return CCliente;
    }

    public void setCCliente(int CCliente) {
        this.CCliente = CCliente;
    }

    public String getNCliente() {
        return NCliente;
    }

    public void setNCliente(String NCliente) {
        this.NCliente = NCliente;
    }

    public String getTCorreo() {
        return TCorreo;
    }

    public void setTCorreo(String TCorreo) {
        this.TCorreo = TCorreo;
    }

    public String getTClave() {
        return TClave;
    }

    public void setTClave(String TClave) {
        this.TClave = TClave;
    }

    public String getTTelefono() {
        return TTelefono;
    }

    public void setTTelefono(String TTelefono) {
        this.TTelefono = TTelefono;
    }

    public int getCRuc() {
        return CRuc;
    }

    public void setCRuc(int CRuc) {
        this.CRuc = CRuc;
    }
}
