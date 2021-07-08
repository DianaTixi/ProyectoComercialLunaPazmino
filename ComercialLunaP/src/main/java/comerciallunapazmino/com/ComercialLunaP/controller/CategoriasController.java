package comerciallunapazmino.com.ComercialLunaP.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import comerciallunapazmino.com.ComercialLunaP.modelo.Categorias;
import comerciallunapazmino.com.ComercialLunaP.service.ICategoriaService;

@Controller

public class CategoriasController {
	
	@Autowired
	public ICategoriaService serCategorias;
	
	/*
	@RequestMapping(value = "/listarCategorias", method=RequestMethod.GET)
	public String listarCategorias(Model model) {
		List<Categorias> lista = serCategorias.listar();
		model.addAttribute("listarCategorias", lista);
		return "private/admin/listar-categorias";
		
	}*/
	
}
