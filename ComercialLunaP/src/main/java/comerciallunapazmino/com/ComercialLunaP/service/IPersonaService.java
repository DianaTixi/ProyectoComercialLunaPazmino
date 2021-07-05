package comerciallunapazmino.com.ComercialLunaP.service;

import java.util.List;

import comerciallunapazmino.com.ComercialLunaP.modelo.Personas;

public interface IPersonaService {
	
	void guardar(Personas persona);
	List<Personas> listar();
	Personas buscarPersonaPorID(int id_per);
	List<Personas> listarByRol(char c);
	void eliminar(int id_per);

}
