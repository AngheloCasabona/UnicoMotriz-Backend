package pe.edu.upc.UnicoMotriz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import pe.edu.upc.UnicoMotriz.entities.Taller;
import pe.edu.upc.UnicoMotriz.serviceinterfaces.ITallerService;

import java.text.ParseException;
import java.util.List;
import java.util.Optional;

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
        tr.setntaller(tr.getntaller());
        listTaller=tService.findName((tr.getntaller()));
        return listTaller;
    }
    @GetMapping("/{id}")
    public Optional<Taller> listId(@PathVariable("id") Integer id) {
        return tService.listId(id);
    }
}
