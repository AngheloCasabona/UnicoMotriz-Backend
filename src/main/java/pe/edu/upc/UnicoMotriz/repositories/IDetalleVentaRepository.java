package pe.edu.upc.UnicoMotriz.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.UnicoMotriz.entities.DetalleVenta;

import java.util.List;

@Repository
public interface IDetalleVentaRepository extends JpaRepository<DetalleVenta,Integer> {
    @Query("from DetalleVenta dv where dv.ccliente in :ccliente")
    List<DetalleVenta> findCliente(@Param("ccliente")int ccliente);

    @Query("from DetalleVenta dv where dv.ctaller in :ctaller")
    List<DetalleVenta> findTaller(@Param("ctaller")int ctaller);

    @Query("from DetalleVenta dv where dv.cfactura in :cfactura")
    List<DetalleVenta> findFactura(@Param("cfactura")int cfactura);
}
