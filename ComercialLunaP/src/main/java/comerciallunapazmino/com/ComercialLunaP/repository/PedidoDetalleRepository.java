package comerciallunapazmino.com.ComercialLunaP.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import comerciallunapazmino.com.ComercialLunaP.modelo.PedidosDetalles;

public interface PedidoDetalleRepository extends JpaRepository<PedidosDetalles, Integer> {

	Optional<PedidosDetalles> findByPedidoCabecera_Id(int id_cab);
	
	List<PedidosDetalles> findBypedidoCabecera_Id(int id_pedC);

	@Query("SELECT SUM(cantidad) FROM PedidosDetalles")
	Integer selectTotalProductos();
	
}
