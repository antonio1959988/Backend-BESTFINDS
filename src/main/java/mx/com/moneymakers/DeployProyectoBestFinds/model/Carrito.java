package mx.com.moneymakers.DeployProyectoBestFinds.model;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity // Entidad para conectarse con la BD
@Table(name="carrito") // Nombre especifico de la tabla en MySQL
public class Carrito {
	
	// Atributos
	@Id // Especifica la primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Identity es primarykey y autoincremental
	@Column(name="id_carrito")
	private Long idCarrito;
	
	@Column(name="total")
	private Double total;
	
	@Column(name="totalDescuento")
	private Double totalDescuento;
	
	@ManyToMany
    @JoinTable(
        name = "carrito_has_productos",
        joinColumns = @JoinColumn(name = "Carrito_idCarrito"),
        inverseJoinColumns = @JoinColumn(name = "Productos_idProducto")
    )
    private Set<Producto> productos;
	
	// Constructor
	public Carrito(Long idCarrito, Double total) {
		this.idCarrito = idCarrito;
		this.total = total;
	}
	
	// ** Constructor vacio
	public Carrito() {}

	// Getters y Setters
	public Long getIdCarrito() {
		return idCarrito;
	}

	public void setIdCarrito(Long idCarrito) {
		this.idCarrito = idCarrito;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public Double getTotalDescuento() {
		return totalDescuento;
	}

	public void setTotalDescuento(Double totalDescuento) {
		this.totalDescuento = totalDescuento;
	}

	// toString
	@Override
	public String toString() {
		return "Carrito [idCarrito=" + idCarrito + ", total=" + total + "]";
	}
	
	
	
	
}
