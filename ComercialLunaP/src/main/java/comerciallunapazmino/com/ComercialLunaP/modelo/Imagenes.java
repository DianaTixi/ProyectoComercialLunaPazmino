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
@Table(name="Imagenes")
public class Imagenes {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String url;
	
	@ManyToOne
	@JoinColumn(nullable = false)
	private Productos producto;

	public Imagenes() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Imagenes(int id, String url, Productos producto) {
		super();
		this.id = id;
		this.url = url;
		this.producto = producto;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Productos getProducto() {
		return producto;
	}

	public void setProducto(Productos producto) {
		this.producto = producto;
	}
	
	
	
}
