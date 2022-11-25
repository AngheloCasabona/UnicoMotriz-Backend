package pe.edu.upc.UnicoMotriz.entities;

public class RespuestaClienteVehiculo {

    private String cplaca;
    private String ncliente;
    private String tcorreo;

    public RespuestaClienteVehiculo() {
    }

    public RespuestaClienteVehiculo(String cplaca, String ncliente) {
        this.cplaca = cplaca;
        this.ncliente = ncliente;
    }

    public String getCplaca() {
        return cplaca;
    }

    public void setCplaca(String cplaca) {
        this.cplaca = cplaca;
    }

    public String getNcliente() {
        return ncliente;
    }

    public void setNcliente(String ncliente) {
        this.ncliente = ncliente;
    }

}
