package mx.com.moneymakers.DeployProyectoBestFinds.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import mx.com.moneymakers.DeployProyectoBestFinds.model.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long>{

	//JPQL
		Optional<Producto> findByNombre(String nombre);
}
