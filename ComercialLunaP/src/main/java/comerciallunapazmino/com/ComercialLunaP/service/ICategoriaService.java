package comerciallunapazmino.com.ComercialLunaP.service;

import java.util.List;

import comerciallunapazmino.com.ComercialLunaP.modelo.Categorias;

public interface ICategoriaService {
	void guardar(Categorias categorias);
	List<Categorias> listar();
	Categorias buscarCategoriasPorID(int id_cat);
	void eliminar(int id_cat);

}
