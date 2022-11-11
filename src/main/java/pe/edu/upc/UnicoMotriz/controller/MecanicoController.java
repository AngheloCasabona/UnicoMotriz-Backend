package pe.edu.upc.UnicoMotriz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.UnicoMotriz.entities.Mecanico;
import pe.edu.upc.UnicoMotriz.serviceinterfaces.IMecanicoService;

import java.text.ParseException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/mecanicos")
public class MecanicoController {
    @Autowired
    private IMecanicoService mService;

    @PostMapping
    public void register(@RequestBody Mecanico m){mService.insert(m);}

    @GetMapping
    public List<Mecanico> list() {return mService.list();}

    @PutMapping
    public void modify(@RequestBody Mecanico m){mService.insert(m);}

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id){mService.delete(id);}

    @PostMapping("/buscar")
    public List<Mecanico> find(@RequestBody Mecanico mr)throws ParseException{
        List<Mecanico> listMecanicos;
        mr.setNMecanico(mr.getNMecanico());
        listMecanicos = mService.findName(mr.getNMecanico());
        return listMecanicos;
    }
    @GetMapping("/{id}")
    public Optional<Mecanico> listId(@PathVariable("id") Integer id) {
        return mService.listId(id);
    }

}
