package pe.edu.upc.UnicoMotriz.serviceimpls;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upc.UnicoMotriz.entities.DetalleVenta;
import pe.edu.upc.UnicoMotriz.repositories.IDetalleVentaRepository;
import pe.edu.upc.UnicoMotriz.serviceinterfaces.IDetalleVentaService;


import java.util.List;
import java.util.Optional;

@RestController
public class DetalleVentaServiceImpl implements IDetalleVentaService{
    @Autowired
    private IDetalleVentaRepository dvR;
    @Override
    public void insert(DetalleVenta dventa){dvR.save(dventa);}

    @Override
    public List<DetalleVenta>list(){return dvR.findAll();}

    public void delete (int ccliente){dvR.deleteById(ccliente);}

    public List<DetalleVenta>findCliente(int ccliente){return dvR.findCliente(ccliente);}

    @Override
    public Optional<DetalleVenta> listId(int ccliente)
    { return dvR.findById(ccliente);}

  @Override
    public List<DetalleVenta>findTaller(int ctaller){
        return dvR.findTaller(ctaller);
  }
    @Override
    public List<DetalleVenta>findFactura(int cfactura){
        return dvR.findFactura(cfactura);
    }
}
