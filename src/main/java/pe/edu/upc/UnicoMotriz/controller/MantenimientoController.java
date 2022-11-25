package pe.edu.upc.UnicoMotriz.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.UnicoMotriz.entities.Mantenimiento;
import pe.edu.upc.UnicoMotriz.serviceinterfaces.IMantenimientoService;

import java.text.ParseException;
import java.util.List;
@RestController
@RequestMapping("/mantenimientos")
public class MantenimientoController {
    @Autowired
    private IMantenimientoService mService;

    @PostMapping
    public void register(@RequestBody Mantenimiento m){mService.insert(m);}

    @GetMapping
    public List<Mantenimiento> list() {return mService.list();}

    @PutMapping
    public void modify(@RequestBody Mantenimiento m){mService.insert(m);}

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id){mService.delete(id);}

    @PostMapping("/buscar")
    public List<Mantenimiento> find(@RequestBody Mantenimiento mr)throws ParseException{
        List<Mantenimiento> listMantenimiento;
        mr.setCmantenimiento(mr.getCmantenimiento());
        listMantenimiento = mService.findMantenimiento(mr.getCmantenimiento());
        return listMantenimiento;
    }
}
