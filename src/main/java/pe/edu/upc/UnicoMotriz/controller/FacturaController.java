package pe.edu.upc.UnicoMotriz.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.UnicoMotriz.entities.Factura;
import pe.edu.upc.UnicoMotriz.serviceinterfaces.IFacturaService;

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


}
