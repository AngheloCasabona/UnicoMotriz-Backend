package pe.edu.upc.UnicoMotriz.serviceimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.upc.UnicoMotriz.entities.Vehiculo;
import pe.edu.upc.UnicoMotriz.repositories.IVehiculoRepository;
import pe.edu.upc.UnicoMotriz.serviceinterfaces.IVehiculoService;

import java.util.List;
import java.util.Optional;
@RestController
public class VehiculoServiceImpl implements IVehiculoService {

    @Autowired
    private IVehiculoRepository vR;


    @Override
    @Transactional
    public boolean insertar(Vehiculo vehiculo) {
        Vehiculo objVehiculo = vR.save(vehiculo);
        if (objVehiculo == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    @Transactional
    public void eliminar(int idVehiculo) {
        vR.deleteById(idVehiculo);
    }

    @Override
    public Optional<Vehiculo> listarId(int idVehiculo) {
        return vR.findById(idVehiculo);
    }

    @Override
    public List<Vehiculo> listar() {
        return vR.findAll();
    }

    @Override
    public List<Vehiculo> buscarCliente(String ncliente) {
        return vR.buscarCliente(ncliente);
    }

    @Override
    public List<Vehiculo> buscarVehiculo(String cplaca) {
        return vR.buscarVehiculo(cplaca);
    }
}
