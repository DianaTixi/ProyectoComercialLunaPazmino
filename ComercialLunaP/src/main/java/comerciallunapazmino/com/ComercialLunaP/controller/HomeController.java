package comerciallunapazmino.com.ComercialLunaP.controller;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import comerciallunapazmino.com.ComercialLunaP.modelo.Provincias;

@Controller
@RequestMapping(value = "/home")
public class HomeController {
	
	@GetMapping("/provincias")
	public String mostrarTabla(Model model) {
		List<Provincias> lista= getProvincias();
		model.addAttribute("provincias", lista);
		
		return "listar-pedidos1";
		
	}
	@GetMapping("/login")
	public String login(Model model) {
		return "public/login";
	}
	
	@GetMapping("/detalles")
	public String detallesPro(Model model) {
		return "public/detalle";
	}
	
	@GetMapping("/detalle")
	public String mostrarDatos(Model model) {
		Provincias pro = new Provincias();
		pro.setId(1);
		pro.setNombre("Azuay");
		model.addAttribute("provincia", pro);
		return "busqueda";
		
	}
	
	@GetMapping("/")
	public String mostrarHome(Model model) {
		
		//model.addAttribute("mensaje", "Bienvenidos A Comercial Luna Pazmiño");
		//model.addAttribute("fecha",new Date());
		
		String nombre = "Bienvenido Comercial Luna Pazmiño";
		Date fechaP = new Date();
		double valor = 999.50;
		boolean vigente = true;
		
		model.addAttribute("nombre", nombre);
		model.addAttribute("fecha", fechaP);
		model.addAttribute("salario", valor);
		model.addAttribute("vigente", vigente);
		
		return "index";
		
	}
	@GetMapping("/lista")
	private String mostrarLista(Model model) {
		List<String> lista = new LinkedList<String>();
		lista.add("Ingeniero de Sistemas");
		lista.add("Auxiliar de Contabilidad");
		lista.add("Vendedor");
		lista.add("Arquitectura");
		
		model.addAttribute("empleos", lista);
		return "busqueda";

	}
	
	private List<Provincias> getProvincias(){
		List<Provincias> listaP= new LinkedList<Provincias>();
		
		try {
			Provincias pro1 = new Provincias();
			pro1.setId(1);
			pro1.setNombre("Azuay");
			
			Provincias pro2 = new Provincias();
			pro2.setId(2);
			pro2.setNombre("Cañar");
			
			Provincias pro3 = new Provincias();
			pro3.setId(3);
			pro3.setNombre("Loja");
			
			listaP.add(pro1);
			listaP.add(pro2);
			listaP.add(pro3);
			
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
		return listaP;
	}

}
