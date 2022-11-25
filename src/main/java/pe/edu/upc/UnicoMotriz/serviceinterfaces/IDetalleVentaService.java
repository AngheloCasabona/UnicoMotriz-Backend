package pe.edu.upc.UnicoMotriz.serviceinterfaces;

import pe.edu.upc.UnicoMotriz.entities.DetalleVenta;
import pe.edu.upc.UnicoMotriz.entities.Vehiculo;

import java.util.List;
import java.util.Optional;

public interface IDetalleVentaService {
    public boolean insert(DetalleVenta dventa);

    List<DetalleVenta>list();
    public void delete (int cdetalle);

    public Optional<DetalleVenta>listId(int cdetalle);


    List<DetalleVenta>findCliente(String cliente);

  /*  List<DetalleVenta>buscarClientenombre(String ncliente);

    List<DetalleVenta>findTaller(String ntaller);

    List<DetalleVenta>findFactura(int cfactura);*/

}
