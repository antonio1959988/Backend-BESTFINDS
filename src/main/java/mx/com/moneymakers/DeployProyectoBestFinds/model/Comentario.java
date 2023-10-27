package mx.com.moneymakers.DeployProyectoBestFinds.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity // Entidad para conectarse con la BD
@Table(name="comentarios") // Nombre especifico de la tabla en MySQL
public class Comentario {
	
	// Atributos
	@Id // Especifica la primary key
	@GeneratedValue(strategy=GenerationType.IDENTITY) // Identity es primary key y autoincremental
	@Column(name="id_comentario", unique=true, nullable=false)
	private Long idComentario;
	
	@Column(name="comentario")
	private String comentario;
	
	@Temporal(TemporalType.DATE) // Indica que se trata de una fecha sin hora
	@Column(name="fecha")
	private Date fecha;
	
	@Column(name="reacciones")
	private Integer reacciones;
	
	@ManyToOne
	@JoinColumn(name="productos_id_producto")
	private Producto Productos_idProducto;
	
	@ManyToOne
	@JoinColumn(name="usuario_id_usuario")
	private Usuario Usuario_idUsuario;

	// Constructor
	public Comentario(Long idComentario, String comentario, Date fecha, Integer reacciones,
			Producto productos_idProducto, Usuario usuario_idUsuario) {
		this.idComentario = idComentario;
		this.comentario = comentario;
		this.fecha = fecha;
		this.reacciones = reacciones;
		Productos_idProducto = productos_idProducto;
		Usuario_idUsuario = usuario_idUsuario;
	}
	
	// Constructor vacio
	public Comentario() {
		
	}

	// Getters y Setters
	public Long getIdComentario() {
		return idComentario;
	}

	public void setIdComentario(Long idComentario) {
		this.idComentario = idComentario;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Integer getReacciones() {
		return reacciones;
	}

	public void setReacciones(Integer reacciones) {
		this.reacciones = reacciones;
	}

	public Producto getProductos_idProducto() {
		return Productos_idProducto;
	}

	public void setProductos_idProducto(Producto productos_idProducto) {
		Productos_idProducto = productos_idProducto;
	}

	public Usuario getUsuario_idUsuario() {
		return Usuario_idUsuario;
	}

	public void setUsuario_idUsuario(Usuario usuario_idUsuario) {
		Usuario_idUsuario = usuario_idUsuario;
	}

	//toString
	@Override
	public String toString() {
		return "Comentario [idComentario=" + idComentario + ", comentario=" + comentario + ", fecha=" + fecha
				+ ", reacciones=" + reacciones + ", Productos_idProducto=" + Productos_idProducto
				+ ", Usuario_idUsuario=" + Usuario_idUsuario + "]";
	}
	
	
	
	
	
	
	
	
}
