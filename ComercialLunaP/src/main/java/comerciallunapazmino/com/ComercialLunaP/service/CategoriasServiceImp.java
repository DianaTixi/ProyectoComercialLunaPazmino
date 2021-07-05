package comerciallunapazmino.com.ComercialLunaP.service;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

import comerciallunapazmino.com.ComercialLunaP.modelo.Categorias;

@Service
public class CategoriasServiceImp implements ICategoriaService {
	
	private List<Categorias> lista = null;
	
	public CategoriasServiceImp() {
		// TODO Auto-generated constructor stub
		lista = new LinkedList<Categorias>();
		
		//Agregamos las categorias a la Base
		Categorias catg = new Categorias();
		catg.setNombre("Lamparas");
		catg.setDescripcion("Todos los productos de iluminacion");
		
	}
	
	@Override
	public void guardar(Categorias categorias) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Categorias> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Categorias buscarCategoriasPorID(int id_cat) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminar(int id_cat) {
		// TODO Auto-generated method stub
		
	}


}
