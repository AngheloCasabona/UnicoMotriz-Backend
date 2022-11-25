package pe.edu.upc.UnicoMotriz.serviceinterfaces;

import pe.edu.upc.UnicoMotriz.entities.Mantenimiento;


import java.util.List;
import java.util.Optional;
public interface IMantenimientoService {
    public void insert(Mantenimiento mantenimiento);
    List<Mantenimiento>list();
    public void delete(int cmantenimiento);
    public Optional<Mantenimiento> listId(int cmantenimiento);
    List<Mantenimiento> findMantenimiento(int cmantenimiento);
}
