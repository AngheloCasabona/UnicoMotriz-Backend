package pe.edu.upc.UnicoMotriz.serviceimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.UnicoMotriz.entities.Producto;
import pe.edu.upc.UnicoMotriz.repositories.IProductoRepository;
import pe.edu.upc.UnicoMotriz.serviceinterfaces.IProductoService;

import java.util.List;

@Service
public class ProductoServiceImpl implements IProductoService {
    @Autowired
    private IProductoRepository fR;
    @Override
    public void insert(Producto Producto){fR.save(Producto);}

    @Override
    public List<Producto>list(){return fR.findAll();}
    @Override
    public void delete(int CProducto) {
        fR.deleteById(CProducto);
    }

    @Override
    public List<Producto> search(String NProducto) {
        return fR.search(NProducto);
    }

}
