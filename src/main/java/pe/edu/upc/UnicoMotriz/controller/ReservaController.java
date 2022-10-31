package pe.edu.upc.UnicoMotriz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import pe.edu.upc.UnicoMotriz.entities.Reserva;

import pe.edu.upc.UnicoMotriz.serviceinterfaces.IReservaService;

import java.text.ParseException;
import java.util.List;

public class ReservaController {
    @Autowired
    private IReservaService rService;

    @PostMapping
    public void register(@RequestBody Reserva r){rService.insert(r);}

    @GetMapping
    public List<Reserva> list() {return rService.list();}

    @PutMapping
    public void modify(@RequestBody Reserva r){rService.insert(r);}

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id){rService.delete(id);}

    @PostMapping("/buscar")
    public List<Reserva> find(@RequestBody Reserva rr)throws ParseException {
        List<Reserva> listReservas;
        rr.setDFecha(rr.getDFecha());
        listReservas = rService.findName(rr.getDFecha());
        return listReservas;
    }
}
