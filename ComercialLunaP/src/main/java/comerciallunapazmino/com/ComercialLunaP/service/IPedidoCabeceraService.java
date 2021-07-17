package comerciallunapazmino.com.ComercialLunaP.service;

import java.util.Date;
import java.util.List;

import org.springframework.data.domain.Page;

import comerciallunapazmino.com.ComercialLunaP.modelo.PedidosCabeceras;
import comerciallunapazmino.com.ComercialLunaP.modelo.Personas;
import comerciallunapazmino.com.ComercialLunaP.modelo.Productos;

public interface IPedidoCabeceraService  {
	void guardar(PedidosCabeceras pedidosC);
	List<PedidosCabeceras> listar();
	PedidosCabeceras buscarPedidosCPorID(int id_pedC);
	void editar (int id_pedC, char estado);
	void agregarObservaciones (int id_pedC, String observaciones);
	Page<PedidosCabeceras> listRecientes() ;
	long TotalOrdenes();
	double TotalPedidos();
	List<PedidosCabeceras> pedidosPorPersona(int id_per);
	Page <PedidosCabeceras> findPaginated (int pageNo, int pageSize);
	Double TotalVentas();
	List<PedidosCabeceras> busqueda (Date fechaI, Date fechaF);
	List<PedidosCabeceras> listarByEstado(char e);
}
