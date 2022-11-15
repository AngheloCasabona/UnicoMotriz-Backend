package pe.edu.upc.UnicoMotriz.serviceimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.UnicoMotriz.entities.Cliente;
import pe.edu.upc.UnicoMotriz.repositories.IClienteRepository;
import pe.edu.upc.UnicoMotriz.serviceinterfaces.IClienteService;

import java.util.List;
import java.util.Optional;
@Service
public class ClienteServiceImpl implements IClienteService {
    @Autowired
    private IClienteRepository cR;

    @Override
    public void insert(Cliente cliente) {
        cR.save(cliente);
    }

    @Override
    public List<Cliente> list() {
        return cR.findAll();
    }

    @Override
    public void delete(int ccliente){ cR.deleteById(ccliente);}

    @Override
    public Optional<Cliente> listId(int ccliente){
        return cR.findById(ccliente);
    }

    @Override
    public List<Cliente> findName(String ncliente){ return cR.findName(ncliente);}

}
