package pe.edu.upc.UnicoMotriz.serviceimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.UnicoMotriz.entities.Mecanico;
import pe.edu.upc.UnicoMotriz.entities.Vehiculo;
import pe.edu.upc.UnicoMotriz.repositories.IVehiculoRepository;
import pe.edu.upc.UnicoMotriz.serviceinterfaces.IVehiculoService;

import java.util.List;
import java.util.Optional;
@Service
public class VehiculoServiceImpl implements IVehiculoService {

    @Autowired
    private IVehiculoRepository vR;

    @Override
    public void insertar(Vehiculo vehiculo) {
        vR.save(vehiculo);
    }

    @Override
    public List<Vehiculo> listar() {
        return vR.findAll();
    }

    @Override
    public void eliminar(int idVehiculo) {
        vR.deleteById(idVehiculo);
    }

    @Override
    public Optional<Vehiculo> listarId(int idVehiculo) {
        return Optional.of(vR.findById(idVehiculo).orElse(new Vehiculo()));
    }

    @Override
    public List<Vehiculo> encontrarNombre(String nombreVehiculo) {
        return vR.findName(nombreVehiculo);
    }
}
