package pe.edu.upc.UnicoMotriz.serviceinterfaces;

import pe.edu.upc.UnicoMotriz.entities.DetalleVenta;

import java.util.List;
import java.util.Optional;

public interface IDetalleVentaService {
    public void insert (DetalleVenta dventa);

    List<DetalleVenta>list();

    public Optional<DetalleVenta>listId(int ccliente);

    public void delete (int ccliente);

    List<DetalleVenta>findCliente(int ccliente);

    List<DetalleVenta>findTaller(int ctaller);

    List<DetalleVenta>findFactura(int cfactura);
}
