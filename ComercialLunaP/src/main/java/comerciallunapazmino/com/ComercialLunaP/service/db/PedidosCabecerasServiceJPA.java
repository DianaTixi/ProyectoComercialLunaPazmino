package comerciallunapazmino.com.ComercialLunaP.service.db;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import comerciallunapazmino.com.ComercialLunaP.modelo.PedidosCabeceras;
import comerciallunapazmino.com.ComercialLunaP.repository.PedidoCabeceraRepository;
import comerciallunapazmino.com.ComercialLunaP.service.IPedidoCabeceraService;

@Service
@Primary
public class PedidosCabecerasServiceJPA implements IPedidoCabeceraService {

	@Autowired
	private PedidoCabeceraRepository pedC_rep;
	
	@Override
	public void guardar(PedidosCabeceras pedidosC) {
		// TODO Auto-generated method stub
		

	}

	@Override
	public List<PedidosCabeceras> listar() {
		// TODO Auto-generated method stub
		return pedC_rep.findAll();
	}

	@Override
	public List<PedidosCabeceras> buscarPedidosCPorID(int id_pedC) {
		// TODO Auto-generated method stub
		return pedC_rep.findById(id_pedC);
	}

	@Override
	public void editar(int id_pedC) {
		// TODO Auto-generated method stub
		
	}

}
