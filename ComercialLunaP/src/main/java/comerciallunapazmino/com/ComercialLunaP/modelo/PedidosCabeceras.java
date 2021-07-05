package comerciallunapazmino.com.ComercialLunaP.modelo;
import java.util.Date;
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
@Table(name="PedidosCabeceras")
public class PedidosCabeceras {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String orden;
	Date fecha;
	String direccion;
    String referencia;
    Double subtotal;
    Double total ;
    char entrega;
    char pago;
	char estado;
	String observaciones;
	
    @ManyToOne
	@JoinColumn(nullable = false)
	private Ciudades ciudad;
    
    @ManyToOne
	@JoinColumn(nullable = false)
	private Personas persona;
    
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pedidoCabecera")
	private Set<PedidosDetalles> pedidosDetalles;

	public PedidosCabeceras() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public PedidosCabeceras(int id, String orden, Date fecha, String direccion, String referencia, Double subtotal,
			Double total, char entrega, char pago, char estado, String observaciones, Ciudades ciudad,
			Personas persona) {
		super();
		this.id = id;
		this.orden = orden;
		this.fecha = fecha;
		this.direccion = direccion;
		this.referencia = referencia;
		this.subtotal = subtotal;
		this.total = total;
		this.entrega = entrega;
		this.pago = pago;
		this.estado = estado;
		this.observaciones = observaciones;
		this.ciudad = ciudad;
		this.persona = persona;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOrden() {
		return orden;
	}

	public void setOrden(String orden) {
		this.orden = orden;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getReferencia() {
		return referencia;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	public Double getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(Double subtotal) {
		this.subtotal = subtotal;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public char getEntrega() {
		return entrega;
	}

	public void setEntrega(char entrega) {
		this.entrega = entrega;
	}

	public char getPago() {
		return pago;
	}

	public void setPago(char pago) {
		this.pago = pago;
	}

	public char getEstado() {
		return estado;
	}

	public void setEstado(char estado) {
		this.estado = estado;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public Ciudades getCiudad() {
		return ciudad;
	}

	public void setCiudad(Ciudades ciudad) {
		this.ciudad = ciudad;
	}

	public Personas getPersona() {
		return persona;
	}

	public void setPersona(Personas persona) {
		this.persona = persona;
	}

	public Set<PedidosDetalles> getPedidosDetalles() {
		return pedidosDetalles;
	}

	public void setPedidosDetalles(Set<PedidosDetalles> pedidosDetalles) {
		this.pedidosDetalles = pedidosDetalles;
	}

	
	
}
