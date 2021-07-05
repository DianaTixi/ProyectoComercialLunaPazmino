package comerciallunapazmino.com.ComercialLunaP.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import comerciallunapazmino.com.ComercialLunaP.modelo.PedidosDetalles;


public interface PedidoDetalleRepository extends JpaRepository<PedidosDetalles, Integer> {

	List<PedidosDetalles> findBypedidoCabecera_Id(int id_pedC);
}
