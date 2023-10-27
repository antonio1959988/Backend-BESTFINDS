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

import mx.com.moneymakers.DeployProyectoBestFinds.model.Carrito;
import mx.com.moneymakers.DeployProyectoBestFinds.service.CarritoService;

@RestController
@RequestMapping(path = "/carrito")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class CarritoController {
	
	private final CarritoService carritoService;
	
	// Constructor
	@Autowired
	public CarritoController(CarritoService carritoService) {
		this.carritoService = carritoService;
	}
	
	// Método GET para mostrar todos los carritos
	@GetMapping
	public List<Carrito> getAllCarrito(){
		return carritoService.getAllCarritos();
	}
	
	// Método POST para crear un carrito
	@PostMapping
	public void createCarrito(@RequestBody Carrito carrito) {
		carritoService.createCarrito(carrito);
	}
	
	// Metodo GET para mostrar carrito por Id
	@GetMapping("/{id}")
	public Carrito getCarritoById(@PathVariable Long id) {
		return carritoService.getCarritoById(id);
	}
	
	// Método PUT para actualizar carrito por id
	@PutMapping("/{id}")
	public void updateCarrito(@PathVariable Long id, @RequestBody Carrito carrito) {
		carritoService.updateCarrito(id, carrito);
	}
	
	// Método DELETE para borrar carrito por id
	@DeleteMapping("/{id}")
	public void deleteCarrito(@PathVariable Long id) {
		carritoService.deleteCarrito(id);
	}

}
