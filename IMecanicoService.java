package pe.edu.upc.UnicoMotriz.serviceinterfaces;

import pe.edu.upc.UnicoMotriz.entities.Mecanico;

import java.util.List;
import java.util.Optional;
public interface IMecanicoService{
    public void insert(Mecanico mecanico);
    List<Mecanico>list();
    public void delete(int idMecanico);
    public Optional<Mecanico> listId(int idMecanico);
    List<Mecanico> findName(String nameMecanico);
}
