package pe.edu.upc.UnicoMotriz.controller;


import io.swagger.models.auth.In;
import org.springframework.data.repository.query.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.UnicoMotriz.entities.DetalleVenta;
import pe.edu.upc.UnicoMotriz.serviceinterfaces.IDetalleVentaService;

import java.text.ParseException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/detalleventa")
public class DetalleVentaController {
    @Autowired
    private IDetalleVentaService dvService;

    @PostMapping
    public void register(@RequestBody DetalleVenta dv){dvService.insert(dv);}

    @GetMapping
    public List<DetalleVenta> list(){return dvService.list();}

    @PutMapping
    public void modify (@RequestBody DetalleVenta dv){dvService.insert(dv);}

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id")Integer id){dvService.delete(id);}

    @PostMapping("/buscar")
    public List<DetalleVenta>find(@RequestBody DetalleVenta dventa)throws ParseException{
        List<DetalleVenta>listDetalleVenta;
        dventa.setCCliente(dventa.getCCliente());
        listDetalleVenta=dvService.findCliente(dventa.getCCliente());
        return listDetalleVenta;
    }
    @GetMapping("/{id}")
    public Optional <DetalleVenta> listId(@PathVariable("id")Integer id){return dvService.listId(id);}
}
