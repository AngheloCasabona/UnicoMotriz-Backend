package pe.edu.upc.UnicoMotriz.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.UnicoMotriz.entities.Taller;

import java.util.List;

@Repository
public interface ITallerRepository extends JpaRepository<Taller,Integer> {
@Query("from Taller t where t.NTaller like %:NTaller%")
    List<Taller>findName(@Param("NTaller")String NTaller);

}
