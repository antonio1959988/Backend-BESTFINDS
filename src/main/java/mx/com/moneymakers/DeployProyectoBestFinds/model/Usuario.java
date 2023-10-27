package mx.com.moneymakers.DeployProyectoBestFinds.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity // Entidad para conectarse con la BD
@Table(name="usuario") // Nombre especifico de la Tabla en mySQL
public class Usuario {
	
	// Atributos
	@Id // Especifica la primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Identity es primary key y autoincremental
	@Column(name = "id_usuario", unique=true, nullable=false)
	private Long idUsuario;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="usuario")
	private String usuario;
	
	@Column(name="correo")
	private String correo;
	
	@Column(name="contrasenia")
	private String contrasenia;
	
	// Constructor
	public Usuario(Long idUsuario, String nombre, String usuario, String correo, String contrasenia) {
		this.idUsuario = idUsuario;
		this.nombre = nombre;
		this.usuario = usuario;
		this.correo = correo;
		this.contrasenia = contrasenia;
	}
	
	// **Constructor Vacio
	public Usuario() {}
	
	// Getters y Setters
	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	// toString
	@Override
	public String toString() {
		return "Usuario [idUsuario=" + idUsuario + ", nombre=" + nombre + ", usuario=" + usuario + ", correo=" + correo
				+ ", contrasenia=" + contrasenia + "]";
	}
	
	
	
	
	
	
}
