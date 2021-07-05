package comerciallunapazmino.com.ComercialLunaP.service;

import java.util.List;

import comerciallunapazmino.com.ComercialLunaP.modelo.PedidosDetalles;

public interface IPedidoDetalleService {
	
	List<PedidosDetalles> listar();
	PedidosDetalles buscarByIdCabecera(int id_cab);
	List <PedidosDetalles> buscarPedidoC_Id (int pedC_id);
	 
}
