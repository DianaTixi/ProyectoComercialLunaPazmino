package comerciallunapazmino.com.ComercialLunaP.service.db;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import comerciallunapazmino.com.ComercialLunaP.modelo.Personas;
import comerciallunapazmino.com.ComercialLunaP.repository.PersonaRepository;
import comerciallunapazmino.com.ComercialLunaP.service.IPersonaService;

@Service
@Primary
public class PersonasServiceJPA implements IPersonaService {
	
	@Autowired
	private PersonaRepository per_rep;

	@Override
	public void guardar(Personas persona) {
		per_rep.save(persona);

	}

	@Override
	public List<Personas> listar() {
		// TODO Auto-generated method stub
		return per_rep.findAll();
	}

	@Override
	public Personas buscarPersonaPorID(int id_per) {
		Optional<Personas> optional = per_rep.findById(id_per);
		if (optional.isPresent()) {
			return optional.get();
		}return null;
	}

	@Override
	public List<Personas> listarByRol(char c) {
		return per_rep.findByRol(c);
	}

	@Override
	public void eliminar(int id_per) {
		Optional<Personas> optional =  per_rep.findById(id_per);
		if (optional.isPresent()) {
			Personas per= optional.get();
			per.setEstatus(0);
			per_rep.save(per);
			System.out.println(optional.get()); 
			}else 
				System.out.println("No se encontro");
	}

	@Override
	public Page<Personas> findPaginated(int pageNo, int pageSize) {
		Pageable pageable = PageRequest.of(pageNo -1, pageSize);
		return per_rep.findAll(pageable);
	}

}
