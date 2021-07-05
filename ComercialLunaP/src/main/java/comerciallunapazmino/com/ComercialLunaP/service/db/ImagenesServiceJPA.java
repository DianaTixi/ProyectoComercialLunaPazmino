package comerciallunapazmino.com.ComercialLunaP.service.db;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
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

}
