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
@Table(name="SubCategorias")
public class SubCategorias {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String nombre;
	char estado;
	String descripcion;
	
	@ManyToOne
	@JoinColumn(nullable = false)
	private Categorias categoria;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "subcategoria")
	private Set<Productos> productos ;

	
	public SubCategorias() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public SubCategorias(int id, String nombre, char estado, String descripcion, Categorias categoria) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.estado = estado;
		this.descripcion = descripcion;
		this.categoria = categoria;
	}



	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public char getEstado() {
		return estado;
	}


	public void setEstado(char estado) {
		this.estado = estado;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public Categorias getCategoria() {
		return categoria;
	}


	public void setCategoria(Categorias categoria) {
		this.categoria = categoria;
	}


	public Set<Productos> getProductos() {
		return productos;
	}


	public void setProductos(Set<Productos> productos) {
		this.productos = productos;
	}
	
	
	
}