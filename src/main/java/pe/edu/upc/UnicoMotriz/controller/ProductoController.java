package pe.edu.upc.UnicoMotriz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.UnicoMotriz.entities.Producto;
import pe.edu.upc.UnicoMotriz.serviceinterfaces.IProductoService;

import java.util.List;
@RestController
@RequestMapping("/productos")
public class ProductoController {
    @Autowired
    private IProductoService pService;
    @PostMapping
    public void registrar(@RequestBody Producto p)
    { pService.insert(p);}
    @GetMapping
    public List<Producto>list(){return pService.list();}


    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        pService.delete(id);
    }

    @PutMapping
    public void modificar(@RequestBody Producto p)
    { pService.insert(p);}

    @PostMapping("/buscar")
    public List<Producto> buscar(@RequestBody Producto p){
        return  pService.search(p.getNProducto());
    }

}
