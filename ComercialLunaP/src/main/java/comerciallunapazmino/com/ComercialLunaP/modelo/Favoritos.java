package comerciallunapazmino.com.ComercialLunaP.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Favoritos")
public class Favoritos {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@ManyToOne
	@JoinColumn(nullable = false)
	private Productos producto;
	
	@ManyToOne
	@JoinColumn(nullable = false)
	private Personas persona ;

	public Favoritos() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Favoritos(int id, Productos producto, Personas persona) {
		super();
		this.id = id;
		this.producto = producto;
		this.persona = persona;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Productos getProducto() {
		return producto;
	}

	public void setProducto(Productos producto) {
		this.producto = producto;
	}

	public Personas getPersona() {
		return persona;
	}

	public void setPersona(Personas persona) {
		this.persona = persona;
	}
	
	
	
}
