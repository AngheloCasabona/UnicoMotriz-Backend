package pe.edu.upc.UnicoMotriz.serviceinterfaces;

import pe.edu.upc.UnicoMotriz.entities.Mecanico;

import java.util.List;
import java.util.Optional;
public interface IMecanicoService{
    public boolean insert(Mecanico mecanico);
    List<Mecanico>list();
    public void delete(int cmecanico);
    public Optional<Mecanico> listId(int cmecanico);
    List<Mecanico> buscarMecanico(String nmecanico);
    List<Mecanico> buscarTaller(String ntaller);
}
