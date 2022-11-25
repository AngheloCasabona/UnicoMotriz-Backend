package pe.edu.upc.UnicoMotriz.serviceinterfaces;

import pe.edu.upc.UnicoMotriz.entities.Cliente;

import java.util.List;
import java.util.Optional;

public interface IClienteService {
    public void insert(Cliente ccliente);
    List<Cliente>list();
    public void delete(int ccliente);
    public Optional<Cliente> listId(int ccliente);
    List<Cliente> findName(String ncliente);

    List<Cliente> fuerzaCodigo();
}
