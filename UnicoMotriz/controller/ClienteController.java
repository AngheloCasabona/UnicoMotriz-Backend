package pe.edu.upc.UnicoMotriz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.UnicoMotriz.entities.Cliente;
import pe.edu.upc.UnicoMotriz.serviceinterfaces.IClienteService;
import java.text.ParseException;
import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
    @Autowired
    private IClienteService cService;

    @PostMapping
    public void register(@RequestBody Cliente c){cService.insert(c);}

    @GetMapping
    public List<Cliente> list() {return cService.list();}

    @PutMapping
    public void modify(@RequestBody Cliente c){cService.insert(c);}

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id){cService.delete(id);}

    @PostMapping("/buscar")
    public List<Cliente> find(@RequestBody Cliente cr)throws ParseException{
        List<Cliente> listClientes;
        cr.setNCliente(cr.getNCliente());
        listClientes = cService.findName(cr.getNCliente());
        return listClientes;
    }
}
