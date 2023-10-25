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

import mx.com.moneymakers.DeployProyectoBestFinds.model.Producto;
import mx.com.moneymakers.DeployProyectoBestFinds.service.ProductoService;

@RestController
@RequestMapping(path = "/productos")
@CrossOrigin(origins = "#", methods = RequestMethod.GET)
public class ProductoController {
	
	private final ProductoService productoService;
	
	// Constructor 
	@Autowired
	public ProductoController(ProductoService productoService) {
		this.productoService = productoService;
	}
	
	// Método GET para mostrar todos los productos
	@GetMapping
	public List<Producto> getAllProducto(){
		return productoService.getAllProducto();
	}
	
	/*
	// Método POST para crear un producto
	@PostMapping
	public void createProducto(@RequestBody Producto producto) {
		productoService.createProducto(producto);
	}
	
	// Método GET para mostrar un producto por id
	@GetMapping("/{id}")
	public Producto getProductoById(@PathVariable Long id) {
		return productoService.getProductoById(id);
	}
	
	// Método PUT para actualizar un producto por id
	@PutMapping("/{id}")
	public void updateProducto(@PathVariable Long id, @RequestBody Producto producto) {
		productoService.updateProducto(id, producto);
	}
	
	// Método DELETE para borrar un producto por id
	@DeleteMapping("/{id}")
	public void deleteProducto(@PathVariable Long id) {
		productoService.deleteProducto(id);
	}
	*/
}
