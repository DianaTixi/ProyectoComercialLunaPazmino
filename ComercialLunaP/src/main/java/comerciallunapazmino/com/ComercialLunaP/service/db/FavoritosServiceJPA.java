package comerciallunapazmino.com.ComercialLunaP.service.db;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import comerciallunapazmino.com.ComercialLunaP.modelo.Favoritos;
import comerciallunapazmino.com.ComercialLunaP.repository.FavoritoRepository;
import comerciallunapazmino.com.ComercialLunaP.service.IFavoritoService;

@Service
@Primary
public class FavoritosServiceJPA implements IFavoritoService {

	@Autowired
	private FavoritoRepository fav_rep;
	
	@Override
	public void guardar(Favoritos favoritos) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Favoritos> listar() {
		// TODO Auto-generated method stub
		return null;
	}

}
