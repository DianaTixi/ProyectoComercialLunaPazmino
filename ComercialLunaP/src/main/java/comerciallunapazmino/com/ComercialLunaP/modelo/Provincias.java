package comerciallunapazmino.com.ComercialLunaP.modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.*;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Provincias")
public class Provincias {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nombre;
	@OneToMany(mappedBy = "provincia")
    private Set<Ciudades> ciudades;
	
	public Provincias() {
		
	}
	
	public Provincias(int id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
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

	public Set<Ciudades> getCiudades() {
		return ciudades;
	}

	public void setCiudades(Set<Ciudades> ciudades) {
		this.ciudades = ciudades;
	}

	
}
