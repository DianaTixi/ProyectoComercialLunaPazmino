package comerciallunapazmino.com.ComercialLunaP.modelo;


import java.io.Serializable;
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



import javax.persistence.Table;

@Entity
@Table(name="Ciudades")
public class Ciudades {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nombre;
	
	@ManyToOne
	@JoinColumn(name = "provincia_id", nullable = false)
	private Provincias provincia;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "ciudad")
	private Set<PedidosCabeceras> pedidosCabeceras;
	
	
	public Ciudades() {
	}
	public Ciudades(int id, String nombre, Provincias provincia) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.provincia = provincia;
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

	public Provincias getProvincia() {
		return provincia;
	}

	public void setProvincia(Provincias provincia) {
		this.provincia = provincia;
	}

	public Set<PedidosCabeceras> getPedidosCabeceras() {
		return pedidosCabeceras;
	}

	public void setPedidosCabeceras(Set<PedidosCabeceras> pedidosCabeceras) {
		this.pedidosCabeceras = pedidosCabeceras;
	}
	
}
