package comerciallunapazmino.com.ComercialLunaP.service;

import java.util.List;

import comerciallunapazmino.com.ComercialLunaP.modelo.Favoritos;

public interface IFavoritoService {
	void guardar (Favoritos favoritos);
	List<Favoritos> listar();
	

}
