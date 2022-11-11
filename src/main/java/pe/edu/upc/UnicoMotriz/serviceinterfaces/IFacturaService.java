package pe.edu.upc.UnicoMotriz.serviceinterfaces;

import pe.edu.upc.UnicoMotriz.entities.Factura;
import pe.edu.upc.UnicoMotriz.entities.Mecanico;

import java.util.List;
import java.util.Optional;

public interface IFacturaService {
    public void insert(Factura factura);
    List<Factura>list();

    public Optional<Factura> listId(int cfactura);

    public void delete(int cfactura);

    List<Factura>findFactura(int cfactura);

}
