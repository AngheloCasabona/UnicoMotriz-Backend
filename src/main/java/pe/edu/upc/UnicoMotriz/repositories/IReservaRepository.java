package pe.edu.upc.UnicoMotriz.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import pe.edu.upc.UnicoMotriz.entities.Reserva;

import java.util.Date;
import java.util.List;

public interface IReservaRepository extends JpaRepository<Reserva, Integer> {
    @Query("from Reserva r where r.DFecha like %:DFecha%")
    List<Reserva> findName(@Param("DFecha") Date DFecha);
}
