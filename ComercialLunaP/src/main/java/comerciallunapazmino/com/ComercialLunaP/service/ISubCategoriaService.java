package comerciallunapazmino.com.ComercialLunaP.service;

import java.util.List;

import comerciallunapazmino.com.ComercialLunaP.modelo.SubCategorias;

public interface ISubCategoriaService {
	void guardar(SubCategorias subcategorias);
	List<SubCategorias> listar();
	SubCategorias buscarCategoriasPorID(int id_subcat);
	List<SubCategorias> listarPorCategorias( int cat_id);
	void eliminar(int id_subcat);

}
