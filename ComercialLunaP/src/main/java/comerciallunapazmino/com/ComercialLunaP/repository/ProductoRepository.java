package comerciallunapazmino.com.ComercialLunaP.repository;


import java.awt.print.Pageable;
import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;


import comerciallunapazmino.com.ComercialLunaP.modelo.Productos;

public interface ProductoRepository extends JpaRepository<Productos, Integer>{
	List<Productos> findByEstado(char rol);

	//Page<Productos> findAll(Pageable page);

	
}
