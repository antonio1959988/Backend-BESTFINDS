package mx.com.moneymakers.DeployProyectoBestFinds.service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.com.moneymakers.DeployProyectoBestFinds.model.Promocion;
import mx.com.moneymakers.DeployProyectoBestFinds.repository.PromocionRepository;

@Service
public class PromocionService {
	
	private final PromocionRepository promocionRepository;
	
	// Constructor
	@Autowired
	public PromocionService(PromocionRepository promocionRepository) {
		this.promocionRepository = promocionRepository;
	}
	
	// Obtener promoción
	public List<Promocion> getAllPromocion(){
		return promocionRepository.findAll();
	}
	
	/*
	// Crear promoción
	public Promocion createPromocion(Promocion promocion) {
		return promocionRepository.save(promocion);
	}
	
	// Crear promoción por Id
	public Promocion createPromocion (Long id, Promocion promocion) {
		promocion.setIdPromocion(id);
		return promocionRepository.save(promocion);
	}
	
	// Obtener promoción por Id
	public Promocion getPromocionById(Long id) {
		return promocionRepository.findById(id).orElseThrow(() -> new NoSuchElementException("Promoción con el id " + id + " no encontrada"));
	}
	
	// Actualizar promoción por Id
	public Promocion updatePromocion(Long id, Promocion promocionDetails) {
		Promocion promocion = promocionRepository.findById(id).orElseThrow(() -> new NoSuchElementException("Promoción con el id " + id + " no encontrada"));
		
		promocion.setIdPromocion(promocionDetails.getIdPromocion());
		promocion.setCodigoPromocion(promocionDetails.getCodigoPromocion());
		promocion.setPorcentaje(promocionDetails.getPorcentaje());
		
		Promocion updatePromocion = promocionRepository.save(promocion);
		return updatePromocion;
	}
	
	// Borrar promocion por Id
	public void deletePromocion(Long id) {
		Promocion promocion = promocionRepository.findById(id).orElseThrow(() -> new NoSuchElementException("Promoción con el id " + id + " no encontrada"));
		promocionRepository.delete(promocion);
	}
	*/
}
