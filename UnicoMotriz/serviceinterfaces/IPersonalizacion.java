package pe.edu.upc.UnicoMotriz.serviceinterfaces;

import pe.edu.upc.UnicoMotriz.entities.Personalizacion;

import java.util.List;
import java.util.Optional;
public interface IPersonalizacion {
    public void insert(Personalizacion personalizacion);
    List<Personalizacion>list();
    public void delete(int CPersonalizacion);
    public Optional<Personalizacion> listId(int CPersonalizacion);
    List<Personalizacion> findName(String NPersonalizacion);
}
