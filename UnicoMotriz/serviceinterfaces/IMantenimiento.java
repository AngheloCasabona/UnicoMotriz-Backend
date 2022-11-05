package pe.edu.upc.UnicoMotriz.serviceinterfaces;

import pe.edu.upc.UnicoMotriz.entities.Mantenimiento;


import java.util.List;
import java.util.Optional;
public interface IMantenimiento {
    public void insert(Mantenimiento mantenimiento);
    List<Mantenimiento>list();
    public void delete(int CMantenimiento);
    public Optional<Mantenimiento> listId(int CManenimiento);
    List<Mantenimiento> findName(String NMantenimiento);
}
