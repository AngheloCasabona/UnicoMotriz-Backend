package pe.edu.upc.UnicoMotriz.serviceimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.UnicoMotriz.entities.Personalizacion;
import pe.edu.upc.UnicoMotriz.repositories.IPersonalizacionRepository;
import pe.edu.upc.UnicoMotriz.serviceinterfaces.IPersonalizacionService;


import java.util.List;
import java.util.Optional;

@Service
public class PersonalizacionServiceImpl implements IPersonalizacionService {


    @Autowired
    private IPersonalizacionRepository pR;

    @Override
    public void insert(Personalizacion personalizacion) {
        pR.save(personalizacion);
    }


    @Override
    public List<Personalizacion> list() {
        return pR.findAll();
    }

    @Override
    public void delete(int cpersonalizacion){ pR.deleteById(cpersonalizacion);}

    @Override
    public Optional<Personalizacion> listId(int cpersonalizacion){
        return pR.findById(cpersonalizacion);
    }

    @Override
    public List<Personalizacion> findName(String npersonalizacion){ return pR.findName(npersonalizacion);}
}


