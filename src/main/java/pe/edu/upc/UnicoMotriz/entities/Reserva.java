package pe.edu.upc.UnicoMotriz.entities;

import javax.persistence.*;

@Entity
@Table(name = "Reserva")

public class Reserva {
}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int RReserva;
    @Column(name = "DFecha",length = 45,nullable = false)
    private String DFecha;
    @Column(name = "Monto",length = 35,nullable = false)
    private String Monto;

    public Reserva(){}

    public Reserva(int RReserva, String DFecha, String monto) {
        this.RReserva = RReserva;
        this.DFecha = DFecha;
        this.Monto = monto;


        public int getRReserva() {        return RReserva;    }

        public void setRReserva(int CReserva) {        this.RReserva = RReserva;    }

        public String getDFecha() {        return DFecha;    }

        public void setDFecha(String DFecha) {        this.DFecha = DFecha;    }

        public String getMonto() {        return Monto;    }

        public void setMonto(String monto) {        this.Monto = monto;    }

    }