package pe.edu.upc.UnicoMotriz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.UnicoMotriz.entities.Reserva;
import pe.edu.upc.UnicoMotriz.serviceinterfaces.IReservaService;

import java.text.ParseException;
import java.util.List;

@RestController
@RequestMapping("/reservas")
public class ReservaController {

    @Autowired
    private IReservaService rReserva;

    @PostMapping
    public void register(@RequestBody Reserva r){rReserva.insert(r);}

    @GetMapping
    public List<Reserva>list() {return rReserva.list();}

    @PutMapping
    public void modify(@RequestBody Reserva r){rReserva.insert(r);}

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id")Integer id){rReserva.delete(id);}

    @PostMapping("/buscar")
    public List<Reserva> find(@RequestBody Reserva fr)throws ParseException {
        List<Reserva> listReserva;
        fr.setDFecha(fr.getDFecha());
        listReserva = rReserva.findDate(fr.getDFecha());
        return listReserva;
    }
}
