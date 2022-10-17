package pe.edu.upc.UnicoMotriz.serviceinterfaces;

import pe.edu.upc.UnicoMotriz.entities.Taller;

import java.util.List;

public interface ITallerService {
    public void insert(Taller taller);
    List<Taller>list();
}
