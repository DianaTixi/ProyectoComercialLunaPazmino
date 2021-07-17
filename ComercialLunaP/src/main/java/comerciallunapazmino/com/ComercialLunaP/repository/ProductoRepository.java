package comerciallunapazmino.com.ComercialLunaP.repository;


import java.awt.print.Pageable;
import java.util.List;
import java.util.Optional;

import org.hibernate.sql.Select;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import comerciallunapazmino.com.ComercialLunaP.modelo.Productos;

public interface ProductoRepository extends JpaRepository<Productos, Integer>{
	List<Productos> findByEstado(char rol);

	//Page<Productos> findAll(Pageable pageable);
 
	@Query("SELECT p FROM Productos p WHERE (p.nombre LIKE %:nombre%) OR (p.codigo = :codigo)" )
	List<Productos> findByNombreLikeOrCodigo(@Param ("nombre") String nombre, @Param ("codigo") String codigo);
	

}
