package pe.edu.upc.UnicoMotriz.serviceinterfaces;

import pe.edu.upc.UnicoMotriz.entities.Vehiculo;

import java.util.List;
import java.util.Optional;

public interface IVehiculoService {
    public void insertar(Vehiculo vehiculo);
    List<Vehiculo> listar();
    public void eliminar(int idVehiculo);
    public Optional<Vehiculo> listarId(int idVehiculo);
    List<Vehiculo> encontrarNombre(String nombreVehiculo);
}
