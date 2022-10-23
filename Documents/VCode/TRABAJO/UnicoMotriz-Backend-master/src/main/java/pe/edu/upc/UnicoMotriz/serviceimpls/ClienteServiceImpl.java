package pe.edu.upc.UnicoMotriz.serviceimpls;

import org.springframework.beans.factory.annotation.Autowired;
import pe.edu.upc.UnicoMotriz.entities.Cliente;
import pe.edu.upc.UnicoMotriz.repositories.IClienteRepository;
import pe.edu.upc.UnicoMotriz.serviceinterfaces.IClienteService;

import java.util.List;

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
}
