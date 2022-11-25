package pe.edu.upc.UnicoMotriz.entities;

import javax.persistence.*;

@Entity
@Table(name = "Cliente")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ccliente;
    @Column(name = "ncliente", length = 50, nullable = false)
    private String ncliente;
    @Column(name = "tcorreo", length = 50, nullable = false)
    private String tcorreo;
    @Column(name = "tclave", length = 50, nullable = false)
    private String tclave;
    @Column(name = "ttelefono", length = 9, nullable = false)
    private String ttelefono;
    @Column(name = "cruc", length = 11, nullable = false)
    private String cruc;

    public Cliente() {
    }

    public Cliente(int ccliente, String ncliente, String tcorreo, String tclave, String ttelefono, String cruc) {
        this.ccliente = ccliente;
        this.ncliente = ncliente;
        this.tcorreo = tcorreo;
        this.tclave = tclave;
        this.ttelefono = ttelefono;
        this.cruc = cruc;
    }

    public int getCCliente() {
        return ccliente;
    }

    public void setCCliente(int ccliente) {
        this.ccliente = ccliente;
    }

    public String getNCliente() {
        return ncliente;
    }

    public void setNCliente(String ncliente) {
        this.ncliente = ncliente;
    }

    public String getTCorreo() {
        return tcorreo;
    }

    public void setTCorreo(String tcorreo) {
        this.tcorreo = tcorreo;
    }

    public String getTClave() {
        return tclave;
    }

    public void setTClave(String tclave) {
        this.tclave = tclave;
    }

    public String getTTelefono() {
        return ttelefono;
    }

    public void setTTelefono(String ttelefono) {
        this.ttelefono = ttelefono;
    }

    public String getCRuc() {
        return cruc;
    }

    public void setCRuc(String cruc) {
        this.cruc = cruc;
    }
}
