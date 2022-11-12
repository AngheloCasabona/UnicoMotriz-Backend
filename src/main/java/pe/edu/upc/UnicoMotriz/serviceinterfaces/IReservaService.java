package pe.edu.upc.UnicoMotriz.serviceinterfaces;

import pe.edu.upc.UnicoMotriz.entities.Reserva;
import java.util.List;
import java.util.Optional;

public class IReservaService {
    public void insert(Reserva reserva);
    List<Reserva>list();

    public Optional<Reserva> listId(int idReserva);

    public void delete(int idReserva);

    List<Reserva>findDate(String DFecha);
}
