package pe.edu.upc.UnicoMotriz.serviceinterfaces;

import pe.edu.upc.UnicoMotriz.entities.DetalleVenta;

import java.util.List;
import java.util.Optional;

public interface IDetalleVentaService {
    public void insert (DetalleVenta DVenta);

    List<DetalleVenta>list();

    public Optional<DetalleVenta>listId(int idCCliente);

    public void delete (int idCCliente);

    List<DetalleVenta>findCliente(int CCliente);
}
