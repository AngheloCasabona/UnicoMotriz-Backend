package pe.edu.upc.UnicoMotriz.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.UnicoMotriz.entities.Personalizacion;
import pe.edu.upc.UnicoMotriz.serviceinterfaces.IPersonalizacionService;

import java.text.ParseException;
import java.util.List;

@RestController
@RequestMapping("/personalizaciones")
public class PersonalizacionController {
    @Autowired
    private IPersonalizacionService pService;

    @PostMapping
    public void register(@RequestBody Personalizacion p){pService.insert(p);}

    @GetMapping
    public List<Personalizacion> list() {return pService.list();}

    @PutMapping
    public void modify(@RequestBody Personalizacion p){pService.insert(p);}

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id){pService.delete(id);}

    @PostMapping("/buscar")
    public List<Personalizacion> find(@RequestBody Personalizacion pr)throws ParseException{
        List<Personalizacion> listPersonalizacion;
        pr.setNpersonalizacion(pr.getNpersonalizacion());
        listPersonalizacion = pService.findName(pr.getNpersonalizacion());
        return listPersonalizacion;
    }
}
