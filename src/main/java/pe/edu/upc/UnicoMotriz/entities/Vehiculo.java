package pe.edu.upc.UnicoMotriz.entities;

import javax.persistence.*;

@Entity
@Table(name = "Vehiculo")
public class Vehiculo {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cvehiculo;

    @Column(name = "cplaca",length = 7, nullable = false)
    private String cplaca;

    @Column(name = "tdetalle",length = 45, nullable = false)
    private String tdetalle;

    @Column(name = "dano",length = 45, nullable = false)
    private String dano;

    @Column(name = "nmarca",length = 45, nullable = false)
    private String nmarca;

    @Column(name = "nmodelo",length = 45, nullable = false)
    private String nmodelo;

    @ManyToOne
    @JoinColumn(name = "idCliente", nullable = false)
    private Cliente cliente;

    public Vehiculo() {
        super();
    }

    public Vehiculo(int cvehiculo, String cplaca, String tdetalle, String dano, String nmarca, String nmodelo, Cliente cliente) {
        this.cvehiculo = cvehiculo;
        this.cplaca = cplaca;
        this.tdetalle = tdetalle;
        this.dano = dano;
        this.nmarca = nmarca;
        this.nmodelo = nmodelo;
        this.cliente = cliente;
    }

    public int getCvehiculo() {
        return cvehiculo;
    }

    public void setCvehiculo(int cvehiculo) {
        this.cvehiculo = cvehiculo;
    }

    public String getCplaca() {
        return cplaca;
    }

    public void setCplaca(String cplaca) {
        this.cplaca = cplaca;
    }

    public String getTdetalle() {
        return tdetalle;
    }

    public void setTdetalle(String tdetalle) {
        this.tdetalle = tdetalle;
    }

    public String getDano() {
        return dano;
    }

    public void setDano(String dano) {
        this.dano = dano;
    }

    public String getNmarca() {
        return nmarca;
    }

    public void setNmarca(String nmarca) {
        this.nmarca = nmarca;
    }

    public String getNmodelo() {
        return nmodelo;
    }

    public void setNmodelo(String nmodelo) {
        this.nmodelo = nmodelo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
