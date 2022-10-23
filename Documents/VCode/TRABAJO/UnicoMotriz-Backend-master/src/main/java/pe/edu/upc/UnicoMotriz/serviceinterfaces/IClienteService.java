package pe.edu.upc.UnicoMotriz.serviceinterfaces;

import pe.edu.upc.UnicoMotriz.entities.Cliente;

import java.util.List;

public interface IClienteService {
    public void insert(Cliente cliente);
    List<Cliente>list();
}
