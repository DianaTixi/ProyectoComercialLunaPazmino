package comerciallunapazmino.com.ComercialLunaP.repository;

import java.util.List;

import org.hibernate.sql.Select;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import comerciallunapazmino.com.ComercialLunaP.modelo.PedidosCabeceras;


public interface PedidoCabeceraRepository extends JpaRepository<PedidosCabeceras, Integer> {

	List<PedidosCabeceras> findByPersona_id(int id_per);
	
	//@Query("SELECT p FROM PedidosCabeceras p WHERE p.estado= :'estado'")
	//List<PedidosCabeceras> findByEstado(@Param("estado") String estado);
	
	@Query("SELECT SUM(total) FROM PedidosCabeceras")
	Double selectTotals();
	
}
