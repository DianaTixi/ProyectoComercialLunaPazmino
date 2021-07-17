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
@Table(name="Personas")
public class Personas {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String cedula;
	String nombres;
	String apellidos;
	String telefono;
	String email;
	String contrasena;
	char rol;
	int estatus;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "persona")
	private Set<PedidosCabeceras> pedidosCabeceras ;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "persona")
	private Set<Favoritos> favoritos;
	
	public Personas() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Personas(int id, String cedula, String nombres, String apellidos, String telefono, String email,
			String contrasena, char rol, int estatus) {
		super();
		this.id = id;
		this.cedula = cedula;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.email = email;
		this.contrasena = contrasena;
		this.rol = rol;
		this.estatus = estatus;
	}


	public int getEstatus() {
		return estatus;
	}


	public void setEstatus(int estatus) {
		this.estatus = estatus;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public char getRol() {
		return rol;
	}

	public void setRol(char rol) {
		this.rol = rol;
	}


	public Set<PedidosCabeceras> getPedidosCabeceras() {
		return pedidosCabeceras;
	}

	public void setPedidosCabeceras(Set<PedidosCabeceras> pedidosCabeceras) {
		this.pedidosCabeceras = pedidosCabeceras;
	}


	public Set<Favoritos> getFavoritos() {
		return favoritos;
	}


	public void setFavoritos(Set<Favoritos> favoritos) {
		this.favoritos = favoritos;
	}

	

}
