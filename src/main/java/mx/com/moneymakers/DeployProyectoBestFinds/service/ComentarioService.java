package mx.com.moneymakers.DeployProyectoBestFinds.service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.com.moneymakers.DeployProyectoBestFinds.model.Comentario;
import mx.com.moneymakers.DeployProyectoBestFinds.repository.ComentarioRepository;

@Service
public class ComentarioService {
	private final ComentarioRepository comentarioRepository;
	
	// Constructor
	@Autowired
	public ComentarioService(ComentarioRepository comentarioRepository) {
		this.comentarioRepository = comentarioRepository;
	}
	
	// Obtener comentario
	public List<Comentario> getAllComentario(){
		return comentarioRepository.findAll();
	}
	
	/*
	// Crear comentario
	public Comentario createComentario(Comentario comentario) {
		return comentarioRepository.save(comentario);
	}
	
	// Crear comentario por Id
	public Comentario createComentario(Long id, Comentario comentario) {
		comentario.setIdComentario(id);
		return comentarioRepository.save(comentario);
	}
	
	// Obtener Comentario por Id
	public Comentario getComentarioById(Long id) {
		return comentarioRepository.findById(id).orElseThrow(() -> new NoSuchElementException("Comentario con el id " + id + " no encontrado"));
	}
	
	// Actualizar comentario por Id
	public Comentario updateComentario(Long id, Comentario comentarioDetails) {
		Comentario comentario = comentarioRepository.findById(id).orElseThrow( () -> new NoSuchElementException("Comentario con el id " + id + " no encontrado") );
		
		comentario.setIdComentario(comentarioDetails.getIdComentario());
		comentario.setComentario(comentarioDetails.getComentario());
		comentario.setFecha(comentarioDetails.getFecha());
		comentario.setReacciones(comentarioDetails.getReacciones());
		comentario.setProductos_idProducto(comentarioDetails.getProductos_idProducto());
		comentario.setUsuario_idUsuario(comentarioDetails.getUsuario_idUsuario());
		
		Comentario updateComentario = comentarioRepository.save(comentario);
		return updateComentario;
	}
	
	// Borrar comentario por Id
	public void deleteComentario(Long id) {
		Comentario comentario = comentarioRepository.findById(id).orElseThrow(() -> new NoSuchElementException("Comentario con el id " + id + " no encontrado"));
		comentarioRepository.delete(comentario);
	}
	
	*/
	

}
