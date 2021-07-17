package comerciallunapazmino.com.ComercialLunaP.service.db;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import comerciallunapazmino.com.ComercialLunaP.modelo.Imagenes;
import comerciallunapazmino.com.ComercialLunaP.repository.ImageRepository;
import comerciallunapazmino.com.ComercialLunaP.service.IImagenService;

@Service
@Primary
public class ImagenesServiceJPA implements IImagenService {

	@Autowired
	private ImageRepository img_rep;
	
	@Override
	public void guardar(Imagenes imagenes) {
		// TODO Auto-generated method stub
		img_rep.save(imagenes);

	}

	@Override
	public List<Imagenes> listar() {
		// TODO Auto-generated method stub
		return img_rep.findAll();
	}

	@Override
	public void modificar(int id_img) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Imagenes> listarPorProducto(int pro_id) {
		List<Imagenes> listaProImg = img_rep.findByProducto_Id(pro_id);
		return listaProImg;
	}

	@Override
	public Imagenes buscarPorProducto(int id_pro) {
		Optional<Imagenes> optional = img_rep.findByproducto_id(id_pro);
		if (optional.isPresent()) {
			return optional.get();
			
		}return null;
	}

	@Override
	public Page<Imagenes> findPaginated(int pageNo, int pageSize) {
		Pageable pageable = PageRequest.of(pageNo -1, pageSize);
		return img_rep.findAll(pageable);
	}

}
