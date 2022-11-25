package pe.edu.upc.UnicoMotriz.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.UnicoMotriz.entities.DetalleVenta;
import pe.edu.upc.UnicoMotriz.entities.Vehiculo;

import java.util.List;

@Repository
public interface IDetalleVentaRepository extends JpaRepository<DetalleVenta,Integer> {

    @Query("from DetalleVenta dv where dv.cliente.ncliente like %:ncliente%")
    List<DetalleVenta> findCliente(@Param("ncliente") String ncliente);

    //@Query(value = "select cl.ccliente, cl.ttelefono, cl.tcorreo, d.tdetalle from cliente as cl inner join detalle_venta as d on d.cliente = cl.ccliente",nativeQuery = true)
    //List<DetalleVenta>buscarClienteDetalle();
    @Query(value = "select * from detalle_venta d where d.ccliente = '1' order by d.ctaller asc",nativeQuery = true)
    List<DetalleVenta>buscarClienteDetalle();
}
