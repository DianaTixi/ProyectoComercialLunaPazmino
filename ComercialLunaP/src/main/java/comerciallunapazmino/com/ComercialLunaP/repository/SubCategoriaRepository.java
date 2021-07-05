package comerciallunapazmino.com.ComercialLunaP.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import comerciallunapazmino.com.ComercialLunaP.modelo.SubCategorias;




public interface SubCategoriaRepository extends JpaRepository<SubCategorias, Integer> {

	List<SubCategorias> findByCategoria_Id(int id_cat);
}
