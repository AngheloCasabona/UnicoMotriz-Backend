package pe.edu.upc.UnicoMotriz.serviceimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.UnicoMotriz.entities.Mecanico;
import pe.edu.upc.UnicoMotriz.repositories.IMecanicoRepository;
import pe.edu.upc.UnicoMotriz.serviceinterfaces.IMecanicoService;

import java.util.List;
import java.util.Optional;

@Service
public class MecanicoServiceImpl implements IMecanicoService {
    @Autowired
    private IMecanicoRepository mR;

    @Override
    public void insert(Mecanico mecanico) {
        mR.save(mecanico);
    }

    @Override
    public List<Mecanico> list() {
        return mR.findAll();
    }

    @Override
    public void delete(int idMecanico){ mR.deleteById(idMecanico);}

    @Override
    public Optional<Mecanico> listId(int idMecanico){
        return Optional.of(mR.findById(idMecanico).orElse(new Mecanico()));
    }

    @Override
    public List<Mecanico> findName(String nameMecanico){ return mR.findName(nameMecanico);}
}
