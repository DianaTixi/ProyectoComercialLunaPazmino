package comerciallunapazmino.com.ComercialLunaP.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import comerciallunapazmino.com.ComercialLunaP.modelo.Personas;


public interface PersonaRepository extends JpaRepository<Personas, Integer> {
	List<Personas> findByRol(char rol);

}
