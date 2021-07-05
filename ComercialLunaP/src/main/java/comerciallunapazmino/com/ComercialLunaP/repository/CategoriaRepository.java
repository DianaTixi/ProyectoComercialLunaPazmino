package comerciallunapazmino.com.ComercialLunaP.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import comerciallunapazmino.com.ComercialLunaP.modelo.Categorias;



public interface CategoriaRepository extends JpaRepository<Categorias, Integer> {

}
