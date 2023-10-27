package mx.com.moneymakers.DeployProyectoBestFinds.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import mx.com.moneymakers.DeployProyectoBestFinds.model.Usuario;
import mx.com.moneymakers.DeployProyectoBestFinds.service.UsuarioService;


@RestController
@RequestMapping("/usuarios")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class UsuarioController {
	
	private final UsuarioService usuarioService;
	
	// Constructor
	@Autowired
	public UsuarioController(UsuarioService usuarioService) {
		this.usuarioService = usuarioService;
	}
	//Crear un metodo Get by email utilizando query personalizada que incluye parametros de consulta
	@GetMapping (path = "/byCorreo")
	public ResponseEntity<Usuario> getUsuarioByCorreo(@RequestParam String correo){
		Usuario client = usuarioService.getUsuarioByCorreo(correo);
		return new ResponseEntity<>(client, HttpStatus.OK);
	}
	//-------------------------------------------------------------//
	// Método GET para mostrar todos los usuarios
	@GetMapping
	public List<Usuario> getAllUsuario(){
		return usuarioService.getAllUsuario();
	}
	
	// Método GET para mostrar usuario por id
	@GetMapping("/{id}")
	public Usuario getUsuarioById(@PathVariable Long id) {
		return usuarioService.getUsuarioById(id);
	}
	
	// Método DELETE para borrar usuario por id
	@DeleteMapping("/{id}")
	public void deleteUsuario(@PathVariable Long id) {
		usuarioService.deleteUsuario(id);
	}
	
	// Método POST para crear un usuario
	@PostMapping
	public void createUsuario(@RequestBody Usuario usuario) {
		usuarioService.createUsuario(usuario);
	}
	
	// Método PUT para actualizar usuario por id
	@PutMapping("/{id}")
	public void updateUsuario(@PathVariable Long id, @RequestBody Usuario usuario) {
		usuarioService.updateUsuario(id, usuario);
	}
}

