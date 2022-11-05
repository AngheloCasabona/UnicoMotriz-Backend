package pe.edu.upc.UnicoMotriz.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.UnicoMotriz.entities.Mantenimiento;


import java.util.List;

@Repository
public interface IMantenimientoRepository extends JpaRepository<Mantenimiento,Integer> {
    @Query("from Mantenimiento m where m.NMantenimiento like %:NMantenimiento%")
    List<Mantenimiento> findName(@Param("NMantenimiento") String NMantenimiento);
}
