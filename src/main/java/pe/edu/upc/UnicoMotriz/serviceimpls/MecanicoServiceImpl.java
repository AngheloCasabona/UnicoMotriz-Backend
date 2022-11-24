package pe.edu.upc.UnicoMotriz.serviceimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RestController;
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
    @Transactional
    public boolean insert(Mecanico mecanico) {
        Mecanico objMecanico = mR.save(mecanico);
        if (objMecanico == null){return false;}
        else {
            return true;
        }
    }

    @Override
    @Transactional
    public void delete(int cmecanico){ mR.deleteById(cmecanico);}
    @Override
    public Optional<Mecanico> listId(int cmecanico){
        return Optional.of(mR.findById(cmecanico).orElse(new Mecanico()));
    }
    @Override
    public List<Mecanico> list() {        return mR.findAll();    }


    @Override
    public List<Mecanico> buscarMecanico(String nmecanico){ return mR.buscarMecanico(nmecanico);}
    @Override
    public List<Mecanico> buscarTaller(String ntaller){ return mR.buscarTaller(ntaller);}
}
