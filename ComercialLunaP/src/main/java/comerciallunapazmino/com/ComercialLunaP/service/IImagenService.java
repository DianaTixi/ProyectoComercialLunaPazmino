package comerciallunapazmino.com.ComercialLunaP.service;

import java.util.List;

import comerciallunapazmino.com.ComercialLunaP.modelo.Imagenes;

public interface IImagenService {
	void guardar (Imagenes imagenes);
	List<Imagenes> listar();
	void modificar (int id_img);
	List<Imagenes> listarPorProducto (int pro_id);
	Imagenes buscarPorProducto ( int id_pro);

}
