package pe.edu.upc.UnicoMotriz.serviceinterfaces;

import pe.edu.upc.UnicoMotriz.entities.Cliente;

import java.util.List;
import java.util.Optional;

public interface IClienteService {
    public void insert(Cliente cliente);
    List<Cliente>list();
    public void delete(int idCliente);
    public Optional<Cliente> listId(int idCliente);
    List<Cliente> findName(String nameCliente);
}
