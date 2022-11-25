package pe.edu.upc.UnicoMotriz.serviceinterfaces;

import pe.edu.upc.UnicoMotriz.entities.Reserva;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface IReservaService {
    public void insert(Reserva reserva);
    List<Reserva> list();
    public void delete(int idReserva);
    public Optional<Reserva> listId(int idReserva);
    List<Reserva> findName(Date fechaReserva);
}
