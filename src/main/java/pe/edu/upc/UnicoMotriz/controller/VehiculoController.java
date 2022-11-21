package pe.edu.upc.UnicoMotriz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.UnicoMotriz.entities.Vehiculo;
import pe.edu.upc.UnicoMotriz.serviceinterfaces.IVehiculoService;

import java.text.ParseException;
import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("/vehiculos")
public class VehiculoController {
    @Autowired
    private IVehiculoService vService;

    @PostMapping
    public void registrar(@RequestBody Vehiculo v){
        vService.insertar(v);
    }

    @PutMapping
    public void modificar(@RequestBody Vehiculo v){
        vService.insertar(v);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        vService.eliminar(id);
    }

    @GetMapping
    public List<Vehiculo> listar() {
        return vService.listar();
    }


    @PostMapping("/buscar")
    public List<Vehiculo> buscar(@RequestBody Vehiculo v) throws ParseException {

        List<Vehiculo> listaVehiculos;
        listaVehiculos = vService.buscarVehiculo(v.getCplaca());
        if (listaVehiculos.isEmpty()) {

            listaVehiculos = vService.buscarCliente(v.getCliente().getNCliente());
        }
        return listaVehiculos;

    }

    @GetMapping("/{id}")
    public Optional<Vehiculo> listarId(@PathVariable("id") Integer id) {
        return vService.listarId(id);
    }

}
