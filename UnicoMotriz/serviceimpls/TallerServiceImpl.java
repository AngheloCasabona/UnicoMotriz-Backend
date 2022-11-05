package pe.edu.upc.UnicoMotriz.serviceimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.UnicoMotriz.entities.Taller;
import pe.edu.upc.UnicoMotriz.repositories.ITallerRepository;
import pe.edu.upc.UnicoMotriz.serviceinterfaces.ITallerService;

import java.util.List;
import java.util.Optional;

@Service
public class TallerServiceImpl implements ITallerService {
    @Autowired
    private ITallerRepository tR;
    @Override
    public void insert(Taller taller){tR.save(taller);}
    @Override
    public List<Taller> list(){return tR.findAll();}

    @Override
    public void delete(int idTaller) {
        tR.deleteById(idTaller);
    }

    @Override
    public Optional<Taller> listId(int idTaller) {
        return Optional.of(tR.findById(idTaller).orElse(new Taller()));
    }

    @Override
    public List<Taller> findName(String NTaller) {
        return tR.findName(NTaller);
    }

}
