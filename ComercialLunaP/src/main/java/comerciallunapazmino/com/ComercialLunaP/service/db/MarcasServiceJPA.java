package comerciallunapazmino.com.ComercialLunaP.service.db;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import comerciallunapazmino.com.ComercialLunaP.modelo.Categorias;
import comerciallunapazmino.com.ComercialLunaP.modelo.Marcas;
import comerciallunapazmino.com.ComercialLunaP.repository.MarcaRepository;
import comerciallunapazmino.com.ComercialLunaP.service.IMarcaService;

@Service
@Primary
public class MarcasServiceJPA implements IMarcaService {
	
	@Autowired
	private MarcaRepository mar_rep;

	@Override
	public void guardar(Marcas marcas) {
		mar_rep.save(marcas);

	}

	@Override
	public List<Marcas> listar() {
		return mar_rep.findAll();
	}

	@Override
	public Marcas buscarMarcasPorID(int id_marca) {
		Optional<Marcas> optional = mar_rep.findById(id_marca);
		if (optional.isPresent()) {
			return optional.get();
			
		}return null;
	}

}
