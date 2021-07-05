package comerciallunapazmino.com.ComercialLunaP.modelo;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Productos")
public class Productos {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String codigo;
	private String nombre;
	private String descripcion;
	char estado;
	private Double ancho;
	private Double alto;
	private Double profundidad;
	private Double precioC;
	private Double precioD;
	private String color;
	private int stock;
	private Double descuento;
	
	
	@ManyToOne
	@JoinColumn(nullable = false)
	private SubCategorias subcategoria;
	
	@ManyToOne
	@JoinColumn(nullable = false)
	private Marcas marca;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "producto")
	private Set<Imagenes> imagenes;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "producto")
	private Set<PedidosDetalles> pedidosDetalles;

	public Productos() {
		super();
	}

	public Productos(int id, String codigo, String nombre, String descripcion, Double precioC, Double precioD,
			Double ancho, Double alto, Double profundidad, String color, int stock, Double descuento, char estado,
			SubCategorias subcategoria, Marcas marca) {
		super();
		this.id = id;
		this.codigo = codigo;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precioC = precioC;
		this.precioD = precioD;
		this.ancho = ancho;
		this.alto = alto;
		this.profundidad = profundidad;
		this.color = color;
		this.stock = stock;
		this.descuento = descuento;
		this.estado = estado;
		this.subcategoria = subcategoria;
		this.marca = marca;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
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

	public Double getPrecioC() {
		return precioC;
	}

	public void setPrecioC(Double precioC) {
		this.precioC = precioC;
	}

	public Double getPrecioD() {
		return precioD;
	}

	public void setPrecioD(Double precioD) {
		this.precioD = precioD;
	}

	public Double getAncho() {
		return ancho;
	}

	public void setAncho(Double ancho) {
		this.ancho = ancho;
	}

	public Double getAlto() {
		return alto;
	}

	public void setAlto(Double alto) {
		this.alto = alto;
	}

	public Double getProfundidad() {
		return profundidad;
	}

	public void setProfundidad(Double profundidad) {
		this.profundidad = profundidad;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public Double getDescuento() {
		return descuento;
	}

	public void setDescuento(Double descuento) {
		this.descuento = descuento;
	}

	public char getEstado() {
		return estado;
	}


	public void setEstado(char estado) {
		this.estado = estado;
	}


	public SubCategorias getSubcategoria() {
		return subcategoria;
	}

	public void setSubcategoria(SubCategorias subcategoria) {
		this.subcategoria = subcategoria;
	}

	

	public Marcas getMarca() {
		return marca;
	}


	public void setMarca(Marcas marca) {
		this.marca = marca;
	}


	public Set<Imagenes> getImagenes() {
		return imagenes;
	}

	public void setImagenes(Set<Imagenes> imagenes) {
		this.imagenes = imagenes;
	}

	public Set<PedidosDetalles> getPedidosDetalles() {
		return pedidosDetalles;
	}

	public void setPedidosDetalles(Set<PedidosDetalles> pedidosDetalles) {
		this.pedidosDetalles = pedidosDetalles;
	}

	@Override
	public String toString() {
		return "Productos [id=" + id + ", codigo=" + codigo + ", nombre=" + nombre + ", descripcion=" + descripcion
				+ ", estado=" + estado + ", ancho=" + ancho + ", alto=" + alto + ", profundidad=" + profundidad
				+ ", precioC=" + precioC + ", precioD=" + precioD + ", color=" + color + ", stock=" + stock
				+ ", descuento=" + descuento + ", subcategoria=" + subcategoria + ", marca=" + marca + "]";
	}
	
	

	
}
