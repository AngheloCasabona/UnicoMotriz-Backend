package pe.edu.upc.UnicoMotriz.serviceimpls;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upc.UnicoMotriz.entities.DetalleVenta;
import pe.edu.upc.UnicoMotriz.entities.Vehiculo;
import pe.edu.upc.UnicoMotriz.repositories.IDetalleVentaRepository;
import pe.edu.upc.UnicoMotriz.serviceinterfaces.IDetalleVentaService;


import java.util.List;
import java.util.Optional;

@RestController
public class DetalleVentaServiceImpl implements IDetalleVentaService{
    @Autowired
    private IDetalleVentaRepository dvR;

    @Override
    @Transactional
    public boolean insert(DetalleVenta dventa) {
        DetalleVenta objDetalle = dvR.save(dventa);
        if (objDetalle == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public List<DetalleVenta>list(){return dvR.findAll();}

    @Transactional
    public void delete (int cdetalle){dvR.deleteById(cdetalle);}

    @Override
    public Optional<DetalleVenta> listId(int cdetalle)
    { return dvR.findById(cdetalle);}

    @Override
    public List<DetalleVenta>findCliente(String cliente){return dvR.findCliente(cliente);}

    @Override
    public List<DetalleVenta>buscarClienteDetalle(){ return dvR.buscarClienteDetalle();}
}
