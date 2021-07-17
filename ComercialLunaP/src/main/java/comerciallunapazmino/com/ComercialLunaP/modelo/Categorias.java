package comerciallunapazmino.com.ComercialLunaP.modelo;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Categorias")
public class Categorias {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String nombre;
	char estado;
	String descripcion;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "categoria")
	private Set<SubCategorias> subcategoria ;

	

	public Categorias(int id, String nombre, char estado, String descripcion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.estado = estado;
		this.descripcion = descripcion;
	}


	public Categorias() {
		super();
		// TODO Auto-generated constructor stub
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


	public Set<SubCategorias> getSubcategoria() {
		return subcategoria;
	}


	public void setSubcategoria(Set<SubCategorias> subcategoria) {
		this.subcategoria = subcategoria;
	}

	
	

}
