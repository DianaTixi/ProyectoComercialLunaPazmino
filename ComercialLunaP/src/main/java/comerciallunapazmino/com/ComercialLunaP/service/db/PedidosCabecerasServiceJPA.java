package comerciallunapazmino.com.ComercialLunaP.service.db;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import comerciallunapazmino.com.ComercialLunaP.modelo.PedidosCabeceras;
import comerciallunapazmino.com.ComercialLunaP.modelo.Productos;
import comerciallunapazmino.com.ComercialLunaP.repository.PedidoCabeceraRepository;
import comerciallunapazmino.com.ComercialLunaP.service.IPedidoCabeceraService;

@Service
@Primary
public class PedidosCabecerasServiceJPA implements IPedidoCabeceraService {

	@Autowired
	private PedidoCabeceraRepository pedC_rep;
	
	@Override
	public void guardar(PedidosCabeceras pedidosC) {
		pedC_rep.save(pedidosC);
		
	}

	@Override
	public List<PedidosCabeceras> listar() {
		// TODO Auto-generated method stub
		return pedC_rep.findAll();
	}

	@Override
	public PedidosCabeceras buscarPedidosCPorID(int id_pedC) {
		Optional<PedidosCabeceras> optional = pedC_rep.findById(id_pedC);
		if (optional.isPresent()) {
			return optional.get();
			
		}return null;
		
	}

	@Override
	public void editar(int id_pedC, char estado) {
		Optional<PedidosCabeceras> optional = pedC_rep.findById(id_pedC);
		if (optional.isPresent()) {
			PedidosCabeceras pedidoC = optional.get();
			pedidoC.setEstado(estado);
			pedC_rep.save(pedidoC);
			System.out.println("El estado del pedido se cambio: " + pedidoC.getEstado());
		}else {
			System.out.println("Algo ocurrio .. Intente de nuevo ");
		}
		
	}

	@Override
	public Page<PedidosCabeceras> listRecientes() {
		Page<PedidosCabeceras> page = pedC_rep.findAll(PageRequest.of(0, 5, Sort.by("fecha").descending()));
		System.out.println("Total Registros: " + page.getTotalElements());
		System.out.println("Total Paginas: " + page.getTotalPages());
		
		return page;
	}

	@Override
	public long TotalOrdenes() {
		long cont = pedC_rep.count();
		if(cont ==0) {
			return 0;
		}
		System.out.println(cont);
		return cont;
	}

	@Override
	public double TotalPedidos() {
		// TODO Auto-generated method stub
		//long total = pedC_rep.
		return 0.00;
	}

	@Override
	public List<PedidosCabeceras> pedidosPorPersona(int id_per) {
		List<PedidosCabeceras> pedidosCabeceras = pedC_rep.findByPersona_id(id_per);
		return pedidosCabeceras;
	}

	@Override
	public Page<PedidosCabeceras> findPaginated(int pageNo, int pageSize) {
		Pageable pageable = PageRequest.of(pageNo -1, pageSize , Sort.by("fecha").descending());
		
		return pedC_rep.findAll(pageable);
	}

	@Override
	public Double TotalVentas() {
		Double total = pedC_rep.selectTotals();
		System.out.println("Total Efectivo Ventas : " + total);
		if (total == null ) {
			return 0.00;
		}
		return pedC_rep.selectTotals();
	}

	@Override
	public void agregarObservaciones(int id_pedC, String observaciones) {
		Optional<PedidosCabeceras> optional = pedC_rep.findById(id_pedC);
		if (optional.isPresent()) {
			PedidosCabeceras pedidosC = optional.get();
			pedidosC.setObservaciones(observaciones);
			pedC_rep.save(pedidosC);
			System.out.println("Se agrego las observaciones Correctamente : " + observaciones );
		}else {
			System.out.println("Algo ocurrio .. Intente de nuevo ");
		}
		
	}

	@Override
	public List<PedidosCabeceras> busqueda(Date fechaI, Date fechaF) {
		// TODO Auto-generated method stub
		return pedC_rep.findByFechaBetween(fechaI, fechaF);
	}

	@Override
	public List<PedidosCabeceras> listarByEstado(char e) {
		// TODO Auto-generated method stub
		return pedC_rep.findByEstado(e);
	}

}
