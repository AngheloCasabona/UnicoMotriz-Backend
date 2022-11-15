package pe.edu.upc.UnicoMotriz.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.UnicoMotriz.entities.Vehiculo;

import java.util.List;
@Repository
public interface IVehiculoRepository  extends JpaRepository<Vehiculo,Integer> {
    @Query("from Vehiculo v where v.CVehiculo like %:CVehiculo%")
    List<Vehiculo> findName(@Param("CVehiculo") String CVehiculo);
}
