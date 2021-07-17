package comerciallunapazmino.com.ComercialLunaP.service.db;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import comerciallunapazmino.com.ComercialLunaP.modelo.Banners;
import comerciallunapazmino.com.ComercialLunaP.repository.BannerRepository;
import comerciallunapazmino.com.ComercialLunaP.service.IBannerService;

@Service
@Primary
public class BannersServiceJPA implements IBannerService {
	
	@Autowired
	private BannerRepository ban_rep;

	@Override
	public void guardar(Banners banners) {
	ban_rep.save(banners);

	}

	@Override
	public List<Banners> listar() {
		// TODO Auto-generated method stub
		return ban_rep.findAll();
	}

	@Override
	public Banners buscar(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void cambiarImg1(int id_ban, String nombre) {
		Optional<Banners> optional = ban_rep.findById(id_ban);
		if (optional.isPresent()) {
			Banners ban = optional.get();
			ban.setUrl1(nombre);
			ban_rep.save(ban);
		}
		
	}

	@Override
	public void cambiarImg2(int id_ban, String nombre) {
		Optional<Banners> optional = ban_rep.findById(id_ban);
		if (optional.isPresent()) {
			Banners ban = optional.get();
			ban.setUrl2(nombre);
			ban_rep.save(ban);
		}
	}

	@Override
	public void cambiarImg3(int id_ban, String nombre) {
		Optional<Banners> optional = ban_rep.findById(id_ban);
		if (optional.isPresent()) {
			Banners ban = optional.get();
			ban.setUrl3(nombre);
			ban_rep.save(ban);
		}
		
	}

	@Override
	public void cambiarImg4(int id_ban, String nombre) {
		Optional<Banners> optional = ban_rep.findById(id_ban);
		if (optional.isPresent()) {
			Banners ban = optional.get();
			ban.setUrl4(nombre);
			ban_rep.save(ban);
		}
		
	}

}
