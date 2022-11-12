
package pe.edu.upc.UnicoMotriz.serviceimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.UnicoMotriz.entities.Producto;
import pe.edu.upc.UnicoMotriz.repositories.IProductoDAO;
import pe.edu.upc.UnicoMotriz.serviceinterfaces.IProductoService;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoServiceImpl implements IProductoService {
    @Autowired
    private IProductoDAO fR;
    @Override
    public void insert(Producto Producto){fR.save(Producto);}

    @Override
    public List<Producto>list(){return fR.findAll();}
    @Override
    public void delete(int CProducto) {
        fR.deleteById(CProducto);
    }

    @Override
    public Optional<Producto> listarId(int idProducto) {
        return fR.findById(idProducto);
    }

    @Override
    public List<Producto> search(String NProducto) {
        return fR.search(NProducto);
    }

}
