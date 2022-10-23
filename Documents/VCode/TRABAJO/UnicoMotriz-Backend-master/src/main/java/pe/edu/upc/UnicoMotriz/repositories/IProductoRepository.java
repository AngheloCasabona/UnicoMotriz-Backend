package pe.edu.upc.UnicoMotriz.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.UnicoMotriz.entities.Producto;

@Repository
public interface IProductoRepository extends JpaRepository<Producto,Integer> {
}
