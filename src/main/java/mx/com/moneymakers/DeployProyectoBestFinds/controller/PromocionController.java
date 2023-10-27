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

import mx.com.moneymakers.DeployProyectoBestFinds.model.Promocion;
import mx.com.moneymakers.DeployProyectoBestFinds.service.PromocionService;

@RestController
@RequestMapping(path = "/promociones")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class PromocionController {

	private final PromocionService promocionService;
	
	// Constructor
	@Autowired
	public PromocionController(PromocionService promocionService) {
		this.promocionService = promocionService;
	}
	
	// Método GET para mostrar todas las promociones
	@GetMapping
	public List<Promocion> getAllPromocion(){
		return promocionService.getAllPromocion();
	}
	
	// Método POST para crear una promoción
	@PostMapping
	public void createPromocion(@RequestBody Promocion promocion) {
		promocionService.createPromocion(promocion);
	}
	
	// Método GET para mostrar promoción por id
	@GetMapping("/{id}")
	public Promocion getPromocionById(@PathVariable Long id) {
		return promocionService.getPromocionById(id);
	}
	
	// Método PUT para actualizar promoción por id
	@PutMapping("/{id}")
	public void updatePromocion(@PathVariable Long id, @RequestBody Promocion promocion) {
		promocionService.updatePromocion(id, promocion);
	}
	
	// Método DELETE para borrar promoción por id
	@DeleteMapping("/{id}")
	public void deletePromocion(@PathVariable Long id) {
		promocionService.deletePromocion(id);
	}
	
}
