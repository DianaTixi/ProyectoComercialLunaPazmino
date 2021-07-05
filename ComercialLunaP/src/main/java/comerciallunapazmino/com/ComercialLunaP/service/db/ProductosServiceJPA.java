package comerciallunapazmino.com.ComercialLunaP.service.db;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import comerciallunapazmino.com.ComercialLunaP.modelo.Categorias;
import comerciallunapazmino.com.ComercialLunaP.modelo.Productos;
import comerciallunapazmino.com.ComercialLunaP.repository.ProductoRepository;
import comerciallunapazmino.com.ComercialLunaP.service.IProductoService;

@Service
@Primary
public class ProductosServiceJPA implements IProductoService {
	
	@Autowired
	private ProductoRepository pro_rep;

	@Override
	public void guardar(Productos productos) {
		pro_rep.save(productos);

	}

	@Override
	public List<Productos> listar() {
		// TODO Auto-generated method stub
		return pro_rep.findAll();
	}

	@Override
	public Productos buscarProductoPorID(int id_prod) {
		Optional<Productos> optional = pro_rep.findById(id_prod);
		if (optional.isPresent()) {
			return optional.get();
			
		}return null;
	}

	@Override
	public void eliminar(int id_pro) {
		Optional<Productos> optional = pro_rep.findById(id_pro);
		if (optional.isPresent()) {
			Productos pro = optional.get();
			pro.setEstado('I');
			pro_rep.save(pro);
			System.out.println("Producto Desabilitado" + pro.getNombre() + " " + pro.getCodigo());
			
		}else {
			System.out.println("Ocurrio un error");
		}
		
	}

}