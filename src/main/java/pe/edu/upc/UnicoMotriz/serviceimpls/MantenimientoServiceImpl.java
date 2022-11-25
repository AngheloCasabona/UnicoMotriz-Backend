package pe.edu.upc.UnicoMotriz.serviceimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.UnicoMotriz.entities.Mantenimiento;
import pe.edu.upc.UnicoMotriz.repositories.IMantenimientoRepository;
import pe.edu.upc.UnicoMotriz.serviceinterfaces.IMantenimientoService;


import java.util.List;
import java.util.Optional;

@Service
public class MantenimientoServiceImpl implements IMantenimientoService {

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
    public void delete(int cmantenimiento){ mR.deleteById(cmantenimiento);}

    @Override
    public Optional<Mantenimiento> listId(int cmantenimiento){
        return mR.findById(cmantenimiento);
    }

    @Override
    public List<Mantenimiento> findMantenimiento(int cmantenimiento){ return mR.findMantenimiento(cmantenimiento);}
}
