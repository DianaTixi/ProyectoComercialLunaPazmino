package comerciallunapazmino.com.ComercialLunaP.service.db;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import comerciallunapazmino.com.ComercialLunaP.modelo.Categorias;
import comerciallunapazmino.com.ComercialLunaP.repository.CategoriaRepository;
import comerciallunapazmino.com.ComercialLunaP.service.ICategoriaService;

@Service
@Primary
public class CategoriasServiceJPA implements ICategoriaService {

	@Autowired
	private CategoriaRepository cat_rep;
	
	@Override
	public void guardar(Categorias categorias) {
		cat_rep.save(categorias);

	}

	@Override
	public List<Categorias> listar() {
		
		return cat_rep.findAll();
	}

	@Override
	public Categorias buscarCategoriasPorID(int id_cat) {
		Optional<Categorias> optional = cat_rep.findById(id_cat);
		if (optional.isPresent()) {
			return optional.get();
			
		}return null;
	}

	@Override
	public void eliminar(int id_cat) {
		cat_rep.deleteById(id_cat);
		
	}
	
	

}
