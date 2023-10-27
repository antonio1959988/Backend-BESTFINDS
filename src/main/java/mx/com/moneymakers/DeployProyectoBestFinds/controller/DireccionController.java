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

import mx.com.moneymakers.DeployProyectoBestFinds.model.Direccion;
import mx.com.moneymakers.DeployProyectoBestFinds.service.DireccionService;

@RestController
@RequestMapping(path = "/direcciones")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class DireccionController {

	private final DireccionService direccionService;
	
	// Constructor
	@Autowired
	public DireccionController(DireccionService direccionService) {
		this.direccionService = direccionService;
	}
	
	// Método GET para mostrar todas las direcciones
	@GetMapping
	public List<Direccion> getAllDireccion(){
		return direccionService.getAllDireccion();
	}
	
	// Método POST para crear una dirección
	@PostMapping
	public void createDireccion(@RequestBody Direccion direccion) {
		direccionService.createDireccion(direccion);
	}
	
	// Método GET para mostrar dirección por id
	@GetMapping("/{id}")
	public Direccion getDireccionById(@PathVariable Long id) {
		return direccionService.getDireccionById(id);
	}
	
	// Método PUT para actualizar dirección por id
	@PutMapping("/{id}")
	public void updateDireccion(@PathVariable Long id, @RequestBody Direccion direccion) {
		direccionService.updateDireccion(id, direccion);
	}
	
	// Método DELETE para borrar dirección por id
	@DeleteMapping("/{id}")
	public void deleteDireccion(@PathVariable Long id) {
		direccionService.deleteDireccion(id);
	}

}
