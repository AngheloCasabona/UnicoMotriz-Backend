package pe.edu.upc.UnicoMotriz.serviceinterfaces;

import pe.edu.upc.UnicoMotriz.entities.Producto;

import java.util.List;

public interface IProductoService {
    public void insert(Producto Producto);
    List<Producto>list();

}
