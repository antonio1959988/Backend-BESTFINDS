package mx.com.moneymakers.DeployProyectoBestFinds.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity // Entidad para conectarse con la BD
@Table(name="direcciones") // Nombre especifico de la tabla en MySQL
public class Direccion {
	
	// Atributos
	@Id // Especifica la primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Identity es primary key y autoincremental
	@Column(name="id_direccion", unique=true, nullable=false)
	private Long idDireccion;
	
	@Column(name="calle")
	private String calle;
	
	@Column(name="colonia")
	private String colonia;
	
	@Column(name="estado")
	private String estado;
	
	@Column(name="cp")
	private Integer cp;
	
	@Column(name="ciudad")
	private String ciudad;
	
	@ManyToOne
	@JoinColumn(name="usuario_id_usuario")
	private Usuario Usuario_idUsuario;

	// Constructor
	public Direccion(Long idDireccion, String calle, String colonia, String estado, Integer cp, String ciudad,
			Usuario usuario_idUsuario) {
		this.idDireccion = idDireccion;
		this.calle = calle;
		this.colonia = colonia;
		this.estado = estado;
		this.cp = cp;
		this.ciudad = ciudad;
		Usuario_idUsuario = usuario_idUsuario;
	}
	
	// Constructor vacío
	public Direccion() {
		
	}

	// getters y Setters
	public Long getIdDireccion() {
		return idDireccion;
	}

	public void setIdDireccion(Long idDireccion) {
		this.idDireccion = idDireccion;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public String getColonia() {
		return colonia;
	}

	public void setColonia(String colonia) {
		this.colonia = colonia;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Integer getCp() {
		return cp;
	}

	public void setCp(Integer cp) {
		this.cp = cp;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public Usuario getUsuario_idUsuario() {
		return Usuario_idUsuario;
	}

	public void setUsuario_idUsuario(Usuario usuario_idUsuario) {
		Usuario_idUsuario = usuario_idUsuario;
	}

	// toString
	@Override
	public String toString() {
		return "Direccion [idDireccion=" + idDireccion + ", calle=" + calle + ", colonia=" + colonia + ", estado="
				+ estado + ", cp=" + cp + ", ciudad=" + ciudad + ", Usuario_idUsuario=" + Usuario_idUsuario + "]";
	}
	
	
	
	
	
	
	
}
