package pe.edu.upc.UnicoMotriz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.UnicoMotriz.entities.Taller;
import pe.edu.upc.UnicoMotriz.serviceinterfaces.ITallerService;

import java.text.ParseException;
import java.util.List;
@RestController
@RequestMapping("/talleres")
public class TallerController {
    @Autowired
    private ITallerService tService;

    @PostMapping
    public void register(@RequestBody Taller t){tService.insert(t);}

    @GetMapping
    public List<Taller>list(){return tService.list();}

    @PutMapping
    public void modify(@RequestBody Taller t){tService.insert(t);}

    @DeleteMapping("/{id}")
    public void delete (@PathVariable("id")Integer id){tService.delete(id);}

    @PostMapping("/buscar")
    public List<Taller>find(@RequestBody Taller tr)throws ParseException{
        List<Taller> listTaller;
        tr.setNTaller(tr.getNTaller());
        listTaller=tService.findName((tr.getNTaller()));
        return listTaller;
    }

}
