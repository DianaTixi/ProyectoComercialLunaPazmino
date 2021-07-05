package comerciallunapazmino.com.ComercialLunaP.repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import comerciallunapazmino.com.ComercialLunaP.modelo.Productos;

public interface ProductoRepository extends JpaRepository<Productos, Integer>{


}
