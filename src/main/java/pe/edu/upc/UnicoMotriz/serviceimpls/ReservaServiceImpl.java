package pe.edu.upc.UnicoMotriz.serviceimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.UnicoMotriz.entities.Reserva;
import pe.edu.upc.UnicoMotriz.repositories.IReservaRepository;
import pe.edu.upc.UnicoMotriz.serviceinterfaces.IReservaService;

import java.util.List;
import java.util.Optional;

@Service
public class ReservaServiceImpl implements IReservaService {
    @Autowired
    private IReservaRepository fR;
    @Override
    public void insert(Reserva reserva){fR.save(reserva);}

    @Override
    public List<Reserva>list(){return fR.findAll();}

    @Override
    public Optional<Reserva> listId(int idReserva){
        return Optional.of(fR.findById(idReserva).orElse(new Reserva()));
    }

    public void delete(int idReserva) {
        fR.deleteById(idReserva);
    }
    @Override
    public List<Reserva> findDate(String DFecha) {
        return fR.findDate(DFecha);
    }
}
