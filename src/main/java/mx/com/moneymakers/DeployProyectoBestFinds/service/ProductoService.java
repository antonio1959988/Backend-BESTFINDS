package mx.com.moneymakers.DeployProyectoBestFinds.service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.com.moneymakers.DeployProyectoBestFinds.model.Producto;
import mx.com.moneymakers.DeployProyectoBestFinds.repository.ProductoRepository;

@Service
public class ProductoService {
	
	private final ProductoRepository productoRepository;
	
	// Constructor
	@Autowired
	public ProductoService(ProductoRepository productoRepository) {
		this.productoRepository = productoRepository;
	}
	
	// Obtener producto
	public List<Producto> getAllProducto(){
		return productoRepository.findAll();
	}
	
	/*
	// Crear Producto
	public Producto createProducto(Producto producto) {
		return productoRepository.save(producto);
	}
	
	// Crear producto por Id
	public Producto createProducto(Long id, Producto producto) {
		producto.setIdProducto(id);
		return productoRepository.save(producto);
	}
	
	// Obtener producto por Id
	public Producto getProductoById(Long id) {
		return productoRepository.findById(id).orElseThrow(() -> new NoSuchElementException("Producto con el id " + id + " no encontrado"));
	}
	
	// Actualizar producto por Id
	public Producto updateProducto (Long id, Producto productoDetails) {
		Producto producto = productoRepository.findById(id).orElseThrow(() -> new NoSuchElementException("Producto con el id " + id + " no encontrado"));
		
		producto.setIdProducto(productoDetails.getIdProducto());
		producto.setNombre(productoDetails.getNombre());
		producto.setDescripcion(productoDetails.getDescripcion());
		producto.setPrecio(productoDetails.getPrecio());
		producto.setCategoria(productoDetails.getCategoria());
		producto.setMarca(productoDetails.getMarca());
		producto.setVariante(productoDetails.getVariante());
		producto.setStock(productoDetails.getStock());
		
		Producto updateProducto = productoRepository.save(producto);
		return updateProducto;
	}
	
	// Borrar producto por Id
	public void deleteProducto(Long id) {
		Producto producto = productoRepository.findById(id).orElseThrow(() -> new NoSuchElementException("Producto con el id " + id + " no encontrado"));
		productoRepository.delete(producto);
	}
	*/
}
