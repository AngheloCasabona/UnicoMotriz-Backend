package pe.edu.upc.UnicoMotriz.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.UnicoMotriz.entities.Factura;

import java.util.List;

@Repository
public interface IFacturaRepository extends JpaRepository<Factura,Integer> {
    @Query("from Factura f where f.cfactura in :cfactura")
    List<Factura> findFactura(@Param("cfactura") int cfactura);

  @Query(value = "select * from factura f where f.dfecha between '2021-01-01' and '2022-01-01'",nativeQuery = true)
  List<Factura> buscarFacturaFecha();

}
