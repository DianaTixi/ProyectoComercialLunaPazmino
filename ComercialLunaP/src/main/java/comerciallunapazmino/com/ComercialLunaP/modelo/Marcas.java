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
@Table(name="Marcas")
public class Marcas {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String nombre;
	char origen;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "marca")
	private Set<Productos> productos ;

	public Marcas() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Marcas(int id, String nombre, char origen) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.origen = origen;
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

	public char getOrigen() {
		return origen;
	}

	public void setOrigen(char origen) {
		this.origen = origen;
	}

	public Set<Productos> getProductos() {
		return productos;
	}

	public void setProductos(Set<Productos> productos) {
		this.productos = productos;
	}

}
