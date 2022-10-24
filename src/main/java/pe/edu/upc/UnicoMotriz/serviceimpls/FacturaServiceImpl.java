package pe.edu.upc.UnicoMotriz.serviceimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.UnicoMotriz.entities.Factura;
import pe.edu.upc.UnicoMotriz.entities.Mecanico;
import pe.edu.upc.UnicoMotriz.repositories.IFacturaRepository;
import pe.edu.upc.UnicoMotriz.serviceinterfaces.IFacturaService;

import java.util.List;
import java.util.Optional;

@Service
public class FacturaServiceImpl implements IFacturaService {
    @Autowired
    private IFacturaRepository fR;
    @Override
    public void insert(Factura factura){fR.save(factura);}

    @Override
    public List<Factura>list(){return fR.findAll();}

    @Override
    public Optional<Factura> listId(int idFactura){
        return Optional.of(fR.findById(idFactura).orElse(new Factura()));
    }

}
