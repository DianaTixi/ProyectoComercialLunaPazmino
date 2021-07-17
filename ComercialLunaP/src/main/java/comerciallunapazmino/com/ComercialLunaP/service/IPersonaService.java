package comerciallunapazmino.com.ComercialLunaP.service;

import java.util.List;

import org.springframework.data.domain.Page;

import comerciallunapazmino.com.ComercialLunaP.modelo.Imagenes;
import comerciallunapazmino.com.ComercialLunaP.modelo.Personas;

public interface IPersonaService {
	
	void guardar(Personas persona);
	List<Personas> listar();
	Personas buscarPersonaPorID(int id_per);
	List<Personas> listarByRol(char c);
	void eliminar(int id_per);
	Page <Personas> findPaginated (int pageNo , int pageSize);

}
