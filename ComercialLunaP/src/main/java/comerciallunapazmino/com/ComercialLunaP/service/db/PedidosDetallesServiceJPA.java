package comerciallunapazmino.com.ComercialLunaP.service.db;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import comerciallunapazmino.com.ComercialLunaP.modelo.PedidosDetalles;
import comerciallunapazmino.com.ComercialLunaP.repository.PedidoDetalleRepository;
import comerciallunapazmino.com.ComercialLunaP.service.IPedidoDetalleService;

@Service
@Primary
public class PedidosDetallesServiceJPA implements IPedidoDetalleService {

	@Autowired
	private PedidoDetalleRepository pedD_rep;
	
	@Override
	public List<PedidosDetalles> listar() {
		Iterable<PedidosDetalles> detallesL =  pedD_rep.findAll();
		for (PedidosDetalles det : detallesL) {
			System.out.println("Detalles: "+ det.getId() + "-"+ det.getCantidad() +"" + det.getSubtotal()+ " " + det.getProducto().getNombre() +" " + det.getPedidoCabecera().getOrden());
			
		}
		
		return pedD_rep.findAll();
	}

	@Override
	public List<PedidosDetalles> buscarPedidoC_Id(int pedC_id) {
		List<PedidosDetalles> pedidoDC = pedD_rep.findBypedidoCabecera_Id(pedC_id);
		
		return pedidoDC;
	}

	@Override
	public PedidosDetalles buscarPorCabecera_Id(int id_cab) {
		Optional<PedidosDetalles> optional = pedD_rep.findByPedidoCabecera_Id(id_cab);
		if (optional.isPresent()) {
			return optional.get();
			
		}return null;
	}

	@Override
	public int TotalProductosVendidos() {
		// TODO Auto-generated method stub
		return pedD_rep.selectTotalProductos();
	}


	

}
