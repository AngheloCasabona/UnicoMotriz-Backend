package pe.edu.upc.UnicoMotriz.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.UnicoMotriz.entities.Cliente;

import java.util.List;

@Repository
public interface IClienteRepository extends JpaRepository<Cliente,Integer> {
    @Query("from Cliente m where m.ncliente like %:ncliente%")
    List<Cliente> findName(@Param("ncliente") String ncliente);

    @Query(value = "select * from cliente as u where length(u.tclave) < 8  order by u.ncliente asc", nativeQuery = true)
    List<Cliente>fuerzaCodigo();
}
