package comerciallunapazmino.com.ComercialLunaP.service;

import java.util.List;

import org.springframework.data.domain.Page;

import comerciallunapazmino.com.ComercialLunaP.modelo.Imagenes;
import comerciallunapazmino.com.ComercialLunaP.modelo.Productos;

public interface IImagenService {
	void guardar (Imagenes imagenes);
	List<Imagenes> listar();
	void modificar (int id_img);
	List<Imagenes> listarPorProducto (int pro_id);
	Imagenes buscarPorProducto ( int id_pro);
	Page <Imagenes> findPaginated (int pageNo , int pageSize);

}
