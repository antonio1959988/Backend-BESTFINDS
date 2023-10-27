package mx.com.moneymakers.DeployProyectoBestFinds.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import mx.com.moneymakers.DeployProyectoBestFinds.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	//metodo sin ptional para consultar por correo
	@Query("SELECT u FROM Usuario u WHERE u.correo=?1")
	Usuario getByCorreo (String correo);
	//Declaramos metodo personalizado de consulta (query method) en la interface
	Optional<Usuario> findByCorreo (String correo);
}

