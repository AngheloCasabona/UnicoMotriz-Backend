package pe.edu.upc.UnicoMotriz.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.UnicoMotriz.entities.Reserva;

import java.util.List;

@Repository

public class IReservaRepository extends JpaRepository<Reserva,Integer> {
    @Query("from Reserva r where f.DFecha like %:DFecha%")
    List<Reserva> findDate(@Param("DFecha") String DFecha);
}
