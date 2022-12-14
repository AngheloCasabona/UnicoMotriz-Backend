package pe.edu.upc.UnicoMotriz.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.UnicoMotriz.entities.Factura;
import pe.edu.upc.UnicoMotriz.entities.Vehiculo;

import java.util.List;
@Repository
public interface IVehiculoRepository  extends JpaRepository<Vehiculo,Integer> {
    @Query("from Vehiculo v where v.cplaca like %:cplaca%")
    List<Vehiculo> buscarVehiculo(@Param("cplaca") String cplaca);

    @Query("from Vehiculo v where v.cliente.ncliente like %:ncliente%")
    List<Vehiculo> buscarCliente(@Param("ncliente") String ncliente);

    @Query(value = "select v.cplaca, u.ncliente, u.tcorreo from cliente as u inner join vehiculo v on v.id_cliente = u.ccliente", nativeQuery = true)
    List<String[]>placaCliente();
}
