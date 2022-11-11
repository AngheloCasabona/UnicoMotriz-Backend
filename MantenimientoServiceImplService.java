package pe.edu.upc.UnicoMotriz.serviceimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.UnicoMotriz.entities.Mantenimiento;
import pe.edu.upc.UnicoMotriz.repositories.IMantenimientoRepository;
import pe.edu.upc.UnicoMotriz.serviceinterfaces.IMantenimientoService;


import java.util.List;
import java.util.Optional;

@Service
public class MantenimientoServiceImplService implements IMantenimientoService {

    @Autowired
    private IMantenimientoRepository mR;

    @Override
    public void insert(Mantenimiento mantenimiento) {
        mR.save(mantenimiento);
    }


    @Override
    public List<Mantenimiento> list() {
        return mR.findAll();
    }

    @Override
    public void delete(int CMantenimiento){ mR.deleteById(CMantenimiento);}

    @Override
    public Optional<Mantenimiento> listId(int CMantenimiento){
        return Optional.of(mR.findById(CMantenimiento).orElse(new Mantenimiento()));
    }

    @Override
    public List<Mantenimiento> findName(String NMantenimiento){ return mR.findName(NMantenimiento);}
}
