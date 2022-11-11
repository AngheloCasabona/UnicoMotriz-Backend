package pe.edu.upc.UnicoMotriz.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.UnicoMotriz.entities.Factura;

import java.util.List;

@Repository
public interface IFacturaRepository extends JpaRepository<Factura,Integer> {
    @Query("from Factura f where f.DFecha like %:DFecha%")
    List<Factura> findDate(@Param("DFecha") String DFecha);
}
