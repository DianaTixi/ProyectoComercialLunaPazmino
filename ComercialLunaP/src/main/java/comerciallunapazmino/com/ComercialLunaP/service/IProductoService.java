package comerciallunapazmino.com.ComercialLunaP.service;

import java.util.List;

import org.springframework.data.domain.Example;

import comerciallunapazmino.com.ComercialLunaP.modelo.Productos;
import comerciallunapazmino.com.ComercialLunaP.repository.ProductoRepository;

public interface IProductoService{
	void guardar(Productos productos);
	List<Productos> listar();
	Productos  buscarProductoPorID(int id_prod);
	void eliminar(int id_pro);
	List<Productos> listarProductosInactivos(char estado);
	void activarProducto (int pro_id);
	
	List<Productos> buscarByExample (Example<Productos> example);
	

}
