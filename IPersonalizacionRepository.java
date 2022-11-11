package pe.edu.upc.UnicoMotriz.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.UnicoMotriz.entities.Personalizacion;

import java.util.List;

@Repository
public interface IPersonalizacionRepository extends JpaRepository<Personalizacion, Integer>{
    @Query("from Personalizacion p where p.NPersonalizacion like %:NPersonalizacion%")
    List<Personalizacion> findName(@Param("NPersonalizacion") String NPersonalizacion);
    }
