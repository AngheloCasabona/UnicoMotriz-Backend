package pe.edu.upc.UnicoMotriz.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.UnicoMotriz.entities.Cliente;

@Repository
public interface IClienteRepository extends JpaRepository<Cliente,Integer> {
}
