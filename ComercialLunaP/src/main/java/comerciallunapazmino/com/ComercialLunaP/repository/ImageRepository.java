package comerciallunapazmino.com.ComercialLunaP.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import comerciallunapazmino.com.ComercialLunaP.modelo.Imagenes;

public interface ImageRepository extends JpaRepository<Imagenes, Integer> {

	List<Imagenes> findByProducto_Id(int pro_id);
}
