package comerciallunapazmino.com.ComercialLunaP.service;

import java.awt.print.Pageable;
import java.util.List;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;

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
	Page<Productos> paginacionProductos(int pages);
	
	Page<Productos> bucarTodos(Pageable page);
	Page <Productos> findPaginated (int pageNo , int pageSize);
	
	List<Productos> busqueda (String nombre, String codigo);

}
