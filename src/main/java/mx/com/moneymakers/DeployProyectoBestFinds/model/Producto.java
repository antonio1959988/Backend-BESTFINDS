package mx.com.moneymakers.DeployProyectoBestFinds.model;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity // Entidad para conectarse con la DB
@Table(name ="productos") // Nombre especifico de la tabla en MySQL
public class Producto {
	
	// Atributos
	@Id // Especifica la primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Identity es la primarykey y autoincremental
	@Column(name="id_producto", unique=true, nullable=false)
	private Long idProducto;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="descripcion")
	private String descripcion;
	
	@Column(name="precio")
	private Double precio;
	
	@Column(name="categoria")
	private String categoria;
	
	@Column(name="marca")
	private String marca;
	
	@Column(name = "variante", columnDefinition = "JSON")
	private String variante;
	
	@Column(name="stock")
	private Integer stock;
	
	@ManyToMany(mappedBy = "productos")
    private Set<Carrito> carrito;

	// Constructor
	public Producto(Long idProducto, String nombre, String descripcion, Double precio, String categoria, String marca,
			String variante, Integer stock) {
		this.idProducto = idProducto;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
		this.categoria = categoria;
		this.marca = marca;
		this.variante = variante;
		this.stock = stock;
	}
	
	// ** Constructor vacio
	public Producto() {}

	// Getters y Setters
	public Long getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(Long idProducto) {
		this.idProducto = idProducto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getVariante() {
		return variante;
	}

	public void setVariante(String variante) {
		this.variante = variante;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	// toString
	@Override
	public String toString() {
		return "Producto [idProducto=" + idProducto + ", nombre=" + nombre + ", descripcion=" + descripcion
				+ ", precio=" + precio + ", categoria=" + categoria + ", marca=" + marca + ", variante=" + variante
				+ ", stock=" + stock + "]";
	}
	
	
	
	
	
	
	

}
