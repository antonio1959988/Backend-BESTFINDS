package mx.com.moneymakers.DeployProyectoBestFinds.service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.com.moneymakers.DeployProyectoBestFinds.model.Usuario;
import mx.com.moneymakers.DeployProyectoBestFinds.repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	private final UsuarioRepository usuarioRepository;
	
	// Constructor
	@Autowired
	public UsuarioService(UsuarioRepository usuarioRepository) {
		this.usuarioRepository = usuarioRepository;
	}
	
	// Obtener usuario
	public List<Usuario> getAllUsuario(){
		return usuarioRepository.findAll();
	}
	
	// Obtener usuario por Id
	public Usuario getUsuarioById(Long id) {
		return usuarioRepository.findById(id).orElseThrow(() -> new NoSuchElementException("Usuario con el id " + id + " no encontrado"));		
	}
	
	// Borrar usuario por id
	public void deleteUsuario(Long id) {
		Usuario usuario = usuarioRepository.findById(id).orElseThrow(() -> new NoSuchElementException("Usuario con el id " + id + " no encontrado"));
		usuarioRepository.delete(usuario);
	}
	
	// Crear Usuario
	public Usuario createUsuario(Usuario usuario) {
		return usuarioRepository.save(usuario);
	}
	
	// Crear usuario por id
	public Usuario createUsuario(Long id, Usuario usuario) {
		usuario.setIdUsuario(id);
		return usuarioRepository.save(usuario);
	}
	
	// Actualizar usuario por id
	public Usuario updateUsuario(Long id, Usuario usuarioDetails) {
		Usuario usuario = usuarioRepository.findById(id).orElseThrow(() -> new NoSuchElementException("Usuario con el id " + id + " no encontrado"));
		
		usuario.setIdUsuario(usuarioDetails.getIdUsuario());
		usuario.setNombre(usuarioDetails.getNombre());
		usuario.setUsuario(usuarioDetails.getUsuario());
		usuario.setCorreo(usuarioDetails.getCorreo());
		usuario.setContrasenia(usuarioDetails.getContrasenia());
		
		Usuario updateUsuario = usuarioRepository.save(usuario);
		return updateUsuario;
	}
}
