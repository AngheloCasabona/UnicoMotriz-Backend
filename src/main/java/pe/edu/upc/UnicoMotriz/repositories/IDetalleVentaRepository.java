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

  /*  @Query("from DetalleVenta dv where dv.cliente.ncliente like %:ncliente%")
    List<DetalleVenta> findCliente(@Param("ncliente")String ncliente);

    @Query("from DetalleVenta dv where dv.taller.ntaller like %:ntaller%")
    List<DetalleVenta> findTaller(@Param("ntaller")String ntaller);

    @Query("from DetalleVenta dv where dv.cfactura in :cfactura")
    List<DetalleVenta> findFactura(@Param("cfactura")int cfactura);*/
}
