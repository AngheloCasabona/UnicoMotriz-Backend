package pe.edu.upc.UnicoMotriz.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.UnicoMotriz.entities.DetalleVenta;

import java.util.List;

@Repository
public interface IDetalleVentaRepository extends JpaRepository<DetalleVenta,Integer> {
    @Query("from DetalleVenta dv where dv.CCliente in :CCliente")
    List<DetalleVenta> findCliente(@Param("CCliente")int CCliente);
}
