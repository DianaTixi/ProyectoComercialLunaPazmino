package comerciallunapazmino.com.ComercialLunaP.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import comerciallunapazmino.com.ComercialLunaP.modelo.Ciudades;


public interface CiudadRepository extends JpaRepository<Ciudades, Integer> {

	List<Ciudades>findByNombre(String nombre);
	List<Ciudades>findByNombreAndProvincia_Id(String nombre, int pro_id);
	
}
