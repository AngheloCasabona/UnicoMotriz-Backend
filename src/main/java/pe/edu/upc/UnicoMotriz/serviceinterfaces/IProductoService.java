package pe.edu.upc.UnicoMotriz.serviceinterfaces;

import pe.edu.upc.UnicoMotriz.entities.Producto;

import java.util.List;
import java.util.Optional;

public interface IProductoService {
    public void insert(Producto Producto);
    List<Producto> list();
    public void delete(int CProducto);

    public Optional<Producto> listarId(int idProducto);

    List<Producto> search(String NProducto);
}
