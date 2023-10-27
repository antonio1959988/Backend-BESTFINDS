package mx.com.moneymakers.DeployProyectoBestFinds.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="promociones") // Nombre especifico de la tabla en mySQL
public class Promocion {
	
	// Atributos
	@Id // Especifica la primary Key
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name="id_promocion", unique=true, nullable=false)
	private Long idPromocion;
	
	@Column (name="codigo_promocion")
	private String codigoPromocion;
	
	@Column (name="porcentaje")
	private Double porcentaje;

	// Constructor 
	public Promocion(Long idPromocion, String codigoPromocion, Double porcentaje) {
		this.idPromocion = idPromocion;
		this.codigoPromocion = codigoPromocion;
		this.porcentaje = porcentaje;
	}
	
	// ** Constructor vacio
	public Promocion(){}

	// Getters y Setters
	public Long getIdPromocion() {
		return idPromocion;
	}

	public void setIdPromocion(Long idPromocion) {
		this.idPromocion = idPromocion;
	}

	public String getCodigoPromocion() {
		return codigoPromocion;
	}

	public void setCodigoPromocion(String codigoPromocion) {
		this.codigoPromocion = codigoPromocion;
	}

	public Double getPorcentaje() {
		return porcentaje;
	}

	public void setPorcentaje(Double porcentaje) {
		this.porcentaje = porcentaje;
	}

	// toString
	@Override
	public String toString() {
		return "Promocion [idPromocion=" + idPromocion + ", codigoPromocion=" + codigoPromocion + ", porcentaje="
				+ porcentaje + "]";
	}
	
	
	
	
	
	

}
