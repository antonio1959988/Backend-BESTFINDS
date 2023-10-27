package mx.com.moneymakers.DeployProyectoBestFinds.service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.com.moneymakers.DeployProyectoBestFinds.model.Direccion;
import mx.com.moneymakers.DeployProyectoBestFinds.repository.DireccionRepository;

@Service
public class DireccionService {
	
	private final DireccionRepository direccionRepository;
	
	// Constructor
	@Autowired
	public DireccionService(DireccionRepository direccionRepository) {
		this.direccionRepository = direccionRepository;
	}
	
	// Obtener direccion
	public List<Direccion> getAllDireccion(){
		return direccionRepository.findAll();
	}
	
	// Crear direccion
	public Direccion createDireccion(Direccion direccion) {
		return direccionRepository.save(direccion);
	}
	
	// Crear direccion por Id
	public Direccion createDireccion(Long id, Direccion direccion) {
		direccion.setIdDireccion(id);
		return direccionRepository.save(direccion);
	}
	
	// Obtener direccion por Id
	public Direccion getDireccionById(Long id) {
		return direccionRepository.findById(id).orElseThrow(() -> new NoSuchElementException("Direccion con el id " + id + " no encontrada"));
	}
	
	// Actualizar direccion por Id
	public Direccion updateDireccion (Long id, Direccion direccionDetails) {
		Direccion direccion = direccionRepository.findById(id).orElseThrow(() -> new NoSuchElementException("Direccion con el id " + id + " no encontrada"));
		
		direccion.setIdDireccion(direccionDetails.getIdDireccion());
		direccion.setCalle(direccionDetails.getCalle());
		direccion.setColonia(direccionDetails.getColonia());
		direccion.setEstado(direccionDetails.getEstado());
		direccion.setCp(direccionDetails.getCp());
		direccion.setCiudad(direccionDetails.getCiudad());
		direccion.setUsuario_idUsuario(direccionDetails.getUsuario_idUsuario());
		
		Direccion updateDireccion = direccionRepository.save(direccion);
		return updateDireccion;
	}
	
	// Borrar direccion por Id
	public void deleteDireccion(Long id) {
		Direccion direccion = direccionRepository.findById(id).orElseThrow(() -> new NoSuchElementException("Direccion con el id " + id + " no encontrada"));
		direccionRepository.delete(direccion);
	}
}
