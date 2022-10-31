package pe.edu.upc.UnicoMotriz.serviceimpls;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.UnicoMotriz.entities.DetalleVenta;
import pe.edu.upc.UnicoMotriz.repositories.IDetalleVentaRepository;
import pe.edu.upc.UnicoMotriz.serviceinterfaces.IDetalleVentaService;


import java.util.List;
import java.util.Optional;

@Service
public class DetalleVentaServiceImpl implements IDetalleVentaService {
    @Autowired
    private IDetalleVentaRepository dvR;
    @Override
    public void insert(DetalleVenta DVenta){dvR.save(DVenta);}

    @Override
    public List<DetalleVenta>list(){return dvR.findAll();}

    @Override
    public Optional<DetalleVenta>listId(int idCCliente){return Optional.of(dvR.findById(idCCliente).orElse(new DetalleVenta()));}

    public void delete (int idCCliente){dvR.deleteById(idCCliente);}

    public List<DetalleVenta>findCliente(int CCliente){return dvR.findCliente(CCliente);}
}
