package comerciallunapazmino.com.ComercialLunaP.modelo;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="PedidosDetalles")
public class PedidosDetalles {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	int cantidad ;
    Double subtotal;
    
    @ManyToOne
	@JoinColumn(nullable = false)
	private Productos producto;
    
    @ManyToOne
	@JoinColumn(nullable = false)
	private PedidosCabeceras pedidoCabecera;
    
	public PedidosDetalles() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PedidosDetalles(int id, int cantidad, Double subtotal, Productos producto, PedidosCabeceras pedidoCabecera) {
		super();
		this.id = id;
		this.cantidad = cantidad;
		this.subtotal = subtotal;
		this.producto = producto;
		this.pedidoCabecera = pedidoCabecera;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Double getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(Double subtotal) {
		this.subtotal = subtotal;
	}

	public Productos getProducto() {
		return producto;
	}

	public void setProducto(Productos producto) {
		this.producto = producto;
	}

	public PedidosCabeceras getPedidoCabecera() {
		return pedidoCabecera;
	}

	public void setPedidoCabecera(PedidosCabeceras pedidoCabecera) {
		this.pedidoCabecera = pedidoCabecera;
	}
	
}
