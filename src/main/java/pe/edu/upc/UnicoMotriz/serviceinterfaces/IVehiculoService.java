package pe.edu.upc.UnicoMotriz.serviceinterfaces;

import pe.edu.upc.UnicoMotriz.entities.Vehiculo;

import java.util.List;
import java.util.Optional;

public interface IVehiculoService {
    public boolean insertar(Vehiculo vehiculo);

    public void eliminar(int idVehiculo);

    Optional<Vehiculo> listarId(int idVehiculo);

    List<Vehiculo> listar();

    List<Vehiculo> buscarCliente(String ncliente);

    List<Vehiculo> buscarVehiculo(String cplaca);
}
