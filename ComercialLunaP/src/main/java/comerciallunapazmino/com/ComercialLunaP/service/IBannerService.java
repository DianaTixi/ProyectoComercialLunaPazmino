package comerciallunapazmino.com.ComercialLunaP.service;

import java.util.List;

import comerciallunapazmino.com.ComercialLunaP.modelo.Banners;

public interface IBannerService {
	void guardar(Banners banners);
	List<Banners> listar();
	Banners buscar(int id);
	
	void cambiarImg1 (int id_ban , String nombre);
	void cambiarImg2 (int id_ban , String nombre);
	void cambiarImg3 (int id_ban , String nombre);
	void cambiarImg4 (int id_ban , String nombre);
	
	

}
