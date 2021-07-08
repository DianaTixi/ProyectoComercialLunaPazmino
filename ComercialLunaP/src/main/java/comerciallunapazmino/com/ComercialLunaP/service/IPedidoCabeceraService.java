package comerciallunapazmino.com.ComercialLunaP.service;

import java.util.List;

import org.springframework.data.domain.Page;

import comerciallunapazmino.com.ComercialLunaP.modelo.PedidosCabeceras;

public interface IPedidoCabeceraService  {
	void guardar(PedidosCabeceras pedidosC);
	List<PedidosCabeceras> listar();
	PedidosCabeceras buscarPedidosCPorID(int id_pedC);
	void editar (int id_pedC, char estado);
	Page<PedidosCabeceras> listRecientes() ;
	long TotalOrdenes();
	double TotalPedidos();
	List<PedidosCabeceras> pedidosPorPersona(int id_per);
}
