package mx.com.moneymakers.DeployProyectoBestFinds.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity // Entidad para conectarse con la BD
@Table(name="pedidos") // Nombre especifico de la tabla en MySQL
public class Pedido {
	
	//Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_pedido", unique=true, nullable=false)
	private Long idPedido;
	
	// @Temporal(TemporalType.DATE) // Indica que se trata de una fecha sin hora
	// @Column(name="fecha")
	private Date fecha;
	
	// @Column(name="detalles")
	private String detalles;
	
	// @Column(name="formaPago")
	private String formaPago;
	
	// @Column(name="Direcciones_idDireccion")
	private Long Direcciones_idDireccion;
	
	// @Column(name="Carrito_idCarrito")
	private Long Carrito_idCarrito;
	
	// @Column(name="usuario_idUsuario")
	private Long usuario_idUsuario;

	// Constructor
	public Pedido(Long idPedido, Date fecha, String detalles, String formaPago, Long direcciones_idDireccion,
			Long carrito_idCarrito, Long usuario_idUsuario) {
		this.idPedido = idPedido;
		this.fecha = fecha;
		this.detalles = detalles;
		this.formaPago = formaPago;
		Direcciones_idDireccion = direcciones_idDireccion;
		Carrito_idCarrito = carrito_idCarrito;
		this.usuario_idUsuario = usuario_idUsuario;
	}
	
	// Constructor vacio
	public Pedido(){}

	// Getters y Setters
	public Long getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(Long idPedido) {
		this.idPedido = idPedido;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getDetalles() {
		return detalles;
	}

	public void setDetalles(String detalles) {
		this.detalles = detalles;
	}

	public String getFormaPago() {
		return formaPago;
	}

	public void setFormaPago(String formaPago) {
		this.formaPago = formaPago;
	}

	public Long getDirecciones_idDireccion() {
		return Direcciones_idDireccion;
	}

	public void setDirecciones_idDireccion(Long direcciones_idDireccion) {
		Direcciones_idDireccion = direcciones_idDireccion;
	}

	public Long getCarrito_idCarrito() {
		return Carrito_idCarrito;
	}

	public void setCarrito_idCarrito(Long carrito_idCarrito) {
		Carrito_idCarrito = carrito_idCarrito;
	}

	public Long getUsuario_idUsuario() {
		return usuario_idUsuario;
	}

	public void setUsuario_idUsuario(Long usuario_idUsuario) {
		this.usuario_idUsuario = usuario_idUsuario;
	}

	// toString
	@Override
	public String toString() {
		return "Pedido [idPedido=" + idPedido + ", fecha=" + fecha + ", detalles=" + detalles + ", formaPago="
				+ formaPago + ", Direcciones_idDireccion=" + Direcciones_idDireccion + ", Carrito_idCarrito="
				+ Carrito_idCarrito + ", usuario_idUsuario=" + usuario_idUsuario + "]";
	}
	
	
	
	
	
}
