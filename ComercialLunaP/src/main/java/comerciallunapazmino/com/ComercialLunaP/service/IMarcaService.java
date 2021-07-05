package comerciallunapazmino.com.ComercialLunaP.service;

import java.util.List;

import comerciallunapazmino.com.ComercialLunaP.modelo.Marcas;

public interface IMarcaService {
	void guardar(Marcas marcas);
	List<Marcas> listar();
	Marcas buscarMarcasPorID(int id_marca);

}
