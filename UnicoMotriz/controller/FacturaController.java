package pe.edu.upc.UnicoMotriz.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.UnicoMotriz.entities.Factura;
import pe.edu.upc.UnicoMotriz.entities.Mecanico;
import pe.edu.upc.UnicoMotriz.serviceinterfaces.IFacturaService;

import java.text.ParseException;
import java.util.List;

@RestController
@RequestMapping("/facturas")
public class FacturaController {

    @Autowired
    private IFacturaService fService;

    @PostMapping
    public void register(@RequestBody Factura f){fService.insert(f);}

    @GetMapping
    public List<Factura>list() {return fService.list();}

    @PutMapping
    public void modify(@RequestBody Factura f){fService.insert(f);}

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id")Integer id){fService.delete(id);}

    @PostMapping("/buscar")
    public List<Factura> find(@RequestBody Factura fr)throws ParseException {
        List<Factura> listFactura;
        fr.setDFecha(fr.getDFecha());
        listFactura = fService.findDate(fr.getDFecha());
        return listFactura;
    }
}
