package pe.edu.upc.UnicoMotriz.serviceinterfaces;

import pe.edu.upc.UnicoMotriz.entities.Taller;

import java.util.List;
import java.util.Optional;

public interface ITallerService {
    public void insert(Taller taller);
    List<Taller>list();

    public Optional<Taller>listId(int ctaller);

    public void delete(int ctaller);

    List<Taller>findName(String ntaller);
    List<Taller>buscarDireccion();

}
