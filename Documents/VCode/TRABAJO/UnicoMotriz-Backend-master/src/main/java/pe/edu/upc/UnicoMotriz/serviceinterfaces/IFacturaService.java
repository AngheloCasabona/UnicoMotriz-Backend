package pe.edu.upc.UnicoMotriz.serviceinterfaces;

import pe.edu.upc.UnicoMotriz.entities.Factura;

import java.util.List;

public interface IFacturaService {
    public void insert(Factura factura);
    List<Factura>list();

}
