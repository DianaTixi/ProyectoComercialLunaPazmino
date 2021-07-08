package comerciallunapazmino.com.ComercialLunaP.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import comerciallunapazmino.com.ComercialLunaP.modelo.PedidosCabeceras;
import comerciallunapazmino.com.ComercialLunaP.modelo.PedidosDetalles;


public interface PedidoCabeceraRepository extends JpaRepository<PedidosCabeceras, Integer> {

	List<PedidosCabeceras> findByPersona_id(int id_per);
	
}
