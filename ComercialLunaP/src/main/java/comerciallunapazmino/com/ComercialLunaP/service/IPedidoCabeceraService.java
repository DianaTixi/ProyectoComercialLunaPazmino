package comerciallunapazmino.com.ComercialLunaP.service;

import java.util.List;

import comerciallunapazmino.com.ComercialLunaP.modelo.PedidosCabeceras;

public interface IPedidoCabeceraService  {
	void guardar(PedidosCabeceras pedidosC);
	List<PedidosCabeceras> listar();
	List<PedidosCabeceras> buscarPedidosCPorID(int id_pedC);
	void editar (int id_pedC);

}
