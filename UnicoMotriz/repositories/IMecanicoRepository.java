package pe.edu.upc.UnicoMotriz.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.UnicoMotriz.entities.Mecanico;

import java.util.List;

@Repository
public interface IMecanicoRepository extends JpaRepository<Mecanico,Integer> {
    @Query("from Mecanico m where m.NMecanico like %:NMecanico%")
    List<Mecanico> findName(@Param("NMecanico") String NMecanico);
}
