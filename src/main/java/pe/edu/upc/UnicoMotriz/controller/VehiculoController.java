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
    public void register(@RequestBody Vehiculo m){vService.insertar(m);}

    @GetMapping
    public List<Vehiculo> list() {return vService.listar();}

    @PutMapping
    public void modify(@RequestBody Vehiculo m){vService.insertar(m);}

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id){vService.eliminar(id);}

    @PostMapping("/buscar")
    public List<Vehiculo> find(@RequestBody Vehiculo vr)throws ParseException {
        List<Vehiculo> listarVehiculos;
        vr.setnMarca(vr.getnMarca());
        listarVehiculos = vService.encontrarNombre(vr.getnMarca());
        return listarVehiculos;
    }
    @GetMapping("/{id}")
    public Optional<Vehiculo> listId(@PathVariable("id") Integer id) {
        return vService.listarId(id);
    }
}
