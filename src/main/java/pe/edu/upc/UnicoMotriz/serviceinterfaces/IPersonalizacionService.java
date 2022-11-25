package pe.edu.upc.UnicoMotriz.serviceinterfaces;

import pe.edu.upc.UnicoMotriz.entities.Personalizacion;

import java.util.List;
import java.util.Optional;
public interface IPersonalizacionService {
    public void insert(Personalizacion personalizacion);
    List<Personalizacion>list();
    public void delete(int cpersonalizacion);
    public Optional<Personalizacion> listId(int cpersonalizacion);
    List<Personalizacion> findName(String npersonalizacion);
}
