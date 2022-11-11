package pe.edu.upc.UnicoMotriz.serviceimpls;
import org.springframework.beans.factory.annotation.Autowired;
import pe.edu.upc.UnicoMotriz.entities.Reserva;
import pe.edu.upc.UnicoMotriz.repositories.IReservaRepository;
import pe.edu.upc.UnicoMotriz.serviceinterfaces.IReservaService;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public class ReservaServiceImpl implements IReservaService {
    @Autowired
    private IReservaRepository rR;
    @Override
    public void insert(Reserva reserva){rR.save(reserva);}
    @Override
    public List<Reserva>list(){return rR.findAll();}
    @Override
    public void delete(int idReserva){rR.deleteById(idReserva);}
    @Override
    public Optional<Reserva>listId(int idReserva)
    {return Optional.of(rR.findById(idReserva).orElse(new Reserva()));}
    @Override
    public List<Reserva>findName(Date fechaReserva)
    {return rR.findName(fechaReserva);   }
}
