package comerciallunapazmino.com.ComercialLunaP.repository;


import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import comerciallunapazmino.com.ComercialLunaP.modelo.Imagenes;
import comerciallunapazmino.com.ComercialLunaP.modelo.PedidosDetalles;

public interface ImageRepository extends JpaRepository<Imagenes, Integer> {

	List<Imagenes> findByProducto_Id(int pro_id);
	Optional<Imagenes> findByproducto_id(int id_pro);
}
