package mx.com.moneymakers.DeployProyectoBestFinds.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import mx.com.moneymakers.DeployProyectoBestFinds.model.Comentario;
import mx.com.moneymakers.DeployProyectoBestFinds.service.ComentarioService;

@RestController
@RequestMapping(path = "/comentarios")
@CrossOrigin(origins = "#", methods = RequestMethod.GET)
public class ComentarioController {
	
	private final ComentarioService comentarioService;
	
	// Constructor
	@Autowired
	public ComentarioController(ComentarioService comentarioService) {
		this.comentarioService = comentarioService;
	}
	
	// Método GET para mostrar todos los comentarios
	@GetMapping
	public List<Comentario> getAllComentario(){
		return comentarioService.getAllComentario();
	}
	/*
	// Método POST para crear un comentario
	@PostMapping
	public void createComentario(@RequestBody Comentario comentario) {
		comentarioService.createComentario(comentario);
	}
	
	// Método GET para mostrar comentario por id
	@GetMapping("/{id}")
	public Comentario getComentarioById(@PathVariable Long id) {
		return comentarioService.getComentarioById(id);
	}
	
	// Métodp PUT para actualizar comentario por id
	@PutMapping("/{id}")
	public void updateCarrito(@PathVariable Long id, @RequestBody Comentario comentario) {
		comentarioService.updateComentario(id, comentario);
	}
	
	// Método DELETE para borrar carrito por id
	@DeleteMapping("/{id}")
	public void deleteCarrito(@PathVariable Long id) {
		comentarioService.deleteComentario(id);
	}
	*/
}
