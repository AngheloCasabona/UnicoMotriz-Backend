package pe.edu.upc.UnicoMotriz.controller;

import java.text.ParseException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.*;
import pe.edu.upc.UnicoMotriz.entities.Cliente;
import pe.edu.upc.UnicoMotriz.entities.RespuestaClienteVehiculo;
import pe.edu.upc.UnicoMotriz.entities.Producto;
import pe.edu.upc.UnicoMotriz.serviceinterfaces.IProductoService;


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
    public List<Producto> buscar(@RequestBody Producto p) throws ParseException {

            List<Producto> listaVehiculos;
            listaVehiculos = pService.buscarCliente(.getLicensePlateProducto());
            if (listaVehiculos.isEmpty()) {

                listaProductos = pService.buscarCliente(p.getCliente().getNamePropietario());
            }
            return listaProductos;

        }
    @GetMapping("/{id}")
    public Optional<Producto> listarId(@PathVariable("id") Integer id) {
        return pService.listarId(id);
    }

    @GetMapping("/cantidades")
    List<Respuesta> buscarCantidadProductos(){
        return pService.cantidadProductos();
    }

}
