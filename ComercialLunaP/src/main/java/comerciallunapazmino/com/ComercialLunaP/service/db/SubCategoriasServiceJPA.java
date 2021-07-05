package comerciallunapazmino.com.ComercialLunaP.service.db;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import comerciallunapazmino.com.ComercialLunaP.modelo.Categorias;
import comerciallunapazmino.com.ComercialLunaP.modelo.SubCategorias;
import comerciallunapazmino.com.ComercialLunaP.repository.SubCategoriaRepository;
import comerciallunapazmino.com.ComercialLunaP.service.ISubCategoriaService;
@Service
@Primary
public class SubCategoriasServiceJPA implements ISubCategoriaService {

	@Autowired
	private SubCategoriaRepository subcat_rep;
	
	@Override
	public void guardar(SubCategorias subcategorias) {
		subcat_rep.save(subcategorias);

	}

	@Override
	public List<SubCategorias> listar() {
		// TODO Auto-generated method stub
		return subcat_rep.findAll();
	}

	@Override
	public SubCategorias buscarCategoriasPorID(int id_subcat) {
		Optional<SubCategorias> optional = subcat_rep.findById(id_subcat);
		if (optional.isPresent()) {
			return optional.get();
			
		}return null;
	}

	@Override
	public List<SubCategorias> listarPorCategorias(int cat_id) {
		List<SubCategorias> listaPorId = subcat_rep.findByCategoria_Id(cat_id);
		return listaPorId ;
	}

	@Override
	public void eliminar(int id_subcat) {
		// TODO Auto-generated method stub
		Optional<SubCategorias> optional = subcat_rep.findById(id_subcat);
		if (optional.isPresent()) {
			SubCategorias subc = optional.get();
			subc.setEstado('I');
			subcat_rep.save(subc);
			
		}else {
			System.out.println("No se encontro");
		}
		
	}

}
