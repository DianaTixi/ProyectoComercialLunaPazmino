package comerciallunapazmino.com.ComercialLunaP.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import comerciallunapazmino.com.ComercialLunaP.modelo.Provincias;



public interface ProvinciasRepository extends JpaRepository<Provincias, Integer> {
	
	List<Provincias> findByNombre(String nombre);

}
