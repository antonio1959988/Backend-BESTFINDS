package mx.com.moneymakers.DeployProyectoBestFinds.service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.com.moneymakers.DeployProyectoBestFinds.model.Carrito;
import mx.com.moneymakers.DeployProyectoBestFinds.repository.CarritoRepository;

@Service
public class CarritoService {
	private final CarritoRepository carritoRepository;
	
	// Constructor
	@Autowired
	public CarritoService(CarritoRepository carritoRepository) {
		this.carritoRepository = carritoRepository;
	}
	
	// Obtener Carrito
	public List<Carrito> getAllCarritos(){
		return carritoRepository.findAll();
	}

	// Crear carrito
	public Carrito createCarrito(Carrito carrito) {
		return carritoRepository.save(carrito);
	}
	
	// Crear carrito por Id
	public Carrito createCarrito(Long id, Carrito carrito) {
		carrito.setIdCarrito(id);
		return carritoRepository.save(carrito);
	}
	
	// Obtener carrito por Id
	public Carrito getCarritoById(Long id) {
		return carritoRepository.findById(id).orElseThrow(() -> new NoSuchElementException("Carrito con el id " + id + " no encontrado"));
	}
	
	// Actualizar carrito por id
	public Carrito updateCarrito(Long id, Carrito carritoDetails) {
		Carrito carrito = carritoRepository.findById(id).orElseThrow(() -> new NoSuchElementException("Carrito con el id " + id + " no encontrado"));
		
		carrito.setIdCarrito(carritoDetails.getIdCarrito());
		carrito.setTotal(carritoDetails.getTotal());
		carrito.setTotalDescuento(carritoDetails.getTotalDescuento());
		
		Carrito updateCarrito = carritoRepository.save(carrito);
		return updateCarrito;
	}
	
	// Borrar carrito por Id
	public void deleteCarrito(Long id) {
		Carrito carrito = carritoRepository.findById(id).orElseThrow(() -> new NoSuchElementException("Carrito con el id " + id + " no encontrado"));
		carritoRepository.delete(carrito);
	}
}
