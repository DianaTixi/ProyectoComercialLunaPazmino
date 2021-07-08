package comerciallunapazmino.com.ComercialLunaP.controller;

import java.awt.print.Pageable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.ExampleMatcher.GenericPropertyMatcher;
import org.springframework.data.domain.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.support.MultipartFilter;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import comerciallunapazmino.com.ComercialLunaP.modelo.Categorias;
import comerciallunapazmino.com.ComercialLunaP.modelo.Imagenes;
import comerciallunapazmino.com.ComercialLunaP.modelo.Marcas;
import comerciallunapazmino.com.ComercialLunaP.modelo.PedidosCabeceras;
import comerciallunapazmino.com.ComercialLunaP.modelo.PedidosDetalles;
import comerciallunapazmino.com.ComercialLunaP.modelo.Personas;
import comerciallunapazmino.com.ComercialLunaP.modelo.Productos;
import comerciallunapazmino.com.ComercialLunaP.modelo.SubCategorias;
import comerciallunapazmino.com.ComercialLunaP.service.ICategoriaService;
import comerciallunapazmino.com.ComercialLunaP.service.IImagenService;
import comerciallunapazmino.com.ComercialLunaP.service.IMarcaService;
import comerciallunapazmino.com.ComercialLunaP.service.IPedidoCabeceraService;
import comerciallunapazmino.com.ComercialLunaP.service.IPedidoDetalleService;
import comerciallunapazmino.com.ComercialLunaP.service.IPersonaService;
import comerciallunapazmino.com.ComercialLunaP.service.IProductoService;
import comerciallunapazmino.com.ComercialLunaP.service.ISubCategoriaService;
import comerciallunapazmino.com.ComercialLunaP.util.Utileria;

@Controller
@RequestMapping(value = "/home-admin")
public class AdminController {
	
	@Autowired
	public ICategoriaService serCategorias;
	
	@Autowired
	public ISubCategoriaService serSubCategorias;
	
	@Autowired
	public IProductoService serProductos;
	
	@Autowired
	public IMarcaService serMarcas;
	
	@Autowired
	public IPersonaService serPersonas;
	
	@Autowired
	public IPedidoCabeceraService serPedidoC;
	
	@Autowired
	public IPedidoDetalleService serPedidoD;
	
	@Autowired
	public IImagenService serImagen;
	
	
	
	@RequestMapping(value = "/index", method=RequestMethod.GET)
	public String index(Model model) {
		Page<PedidosCabeceras> pedidos = serPedidoC.listRecientes();
		model.addAttribute("pedidosR", pedidos);
		long totalOrd = serPedidoC.TotalOrdenes();
		model.addAttribute("totalOrd", totalOrd);
		return "private/admin/index-admin";
	}

	
	//Lista de los ultimos pedidos 
	
	
	@GetMapping("/crearCategoria")
	public String createC(Model model) {
		return "private/admin/agregar-categoria";
	}
	
	/////////////////// CONTROLADOR DE LA ENTIDAD DE CATEGORIA //////////////////////////////
	
	//Metodo para crear una categoria
	@RequestMapping(value="/saveCateg", method=RequestMethod.POST)
	public String saveCat(@RequestParam ("nombre") String nombre, @RequestParam ("estado") String estado, @RequestParam ("descripcion") String descripcion) {
		System.out.println(nombre +" " + estado +" " + descripcion);
		Categorias cat = new Categorias();
		cat.setNombre(nombre);
		char estad = estado.charAt(0);
		cat.setEstado(estad);
		cat.setDescripcion(descripcion);
		serCategorias.guardar(cat);
		return "private/admin/index-admin";
	}
	
	@RequestMapping(value="/agregarCategorias", method=RequestMethod.GET)
	public String agregarCategoria(Model model) {
		List<Categorias> lista = serCategorias.listar();
		model.addAttribute("listarCategorias", lista);
		return "private/admin/agregar-categoria";
	}
	
	
	//Metodo para Listar
	@RequestMapping(value = "/listarCategorias", method=RequestMethod.GET)
	public String listarCategorias(Model model) {
		List<Categorias> lista = serCategorias.listar();
		model.addAttribute("listarCategorias", lista);
		return "private/admin/listar-categorias";
	}
	
	//Metodo para ver el detalle de Categorio
	@GetMapping("/view/{id}")
	public String verDetalle(@PathVariable("id") int idC, Model model) {
		System.out.println("Id Categoria" + idC);
		model.addAttribute("id_cat", idC);
		return "private/admin/detalle-categoria";
	}
	
	//Metodo para eliminar categorias
	@GetMapping("/delete")
	public String eliminarC(@RequestParam("id") int id_cat, RedirectAttributes attributes) {
		serCategorias.eliminar(id_cat);
		System.out.println("Borrar la categoria: " + id_cat);
		attributes.addFlashAttribute("msg", "Categoria Eliminada");
		return "redirect:/home-admin/listarCategorias";
	}
	
	
	/////////////////// CONTROLADOR DE LA ENTIDAD DE SUBCATEGORIA //////////////////////////////
	//
	@RequestMapping(value = "/agregarSubCategorias", method=RequestMethod.GET)
	public String listarSubCategorias(Model model) {
		List<SubCategorias> lista = serSubCategorias.listar();
		List<Categorias> cat_lista = serCategorias.listar();
		model.addAttribute("listarSubCategorias", lista);
		model.addAttribute("cat_lista", cat_lista);
		return "private/admin/agregar-subcategorias";
		
	}
	
	@RequestMapping(value="/saveSubCateg", method=RequestMethod.POST)
	public String saveSubCat(@RequestParam ("nombre") String nombre,  @RequestParam ("estado") String estado, @RequestParam ("descripcion") String descripcion, @RequestParam ("categoria") String categoria) {
		System.out.println(nombre +" "+ estado +" " + descripcion + "-"+ categoria);
		SubCategorias subcat = new SubCategorias();
		subcat.setNombre(nombre);
		char estad = estado.charAt(0);
		subcat.setEstado(estad);
		subcat.setDescripcion(descripcion);
		
		Categorias cat = new Categorias();
		int id_cat=Integer.parseInt(categoria);  
		cat.setId(id_cat);
		subcat.setCategoria(cat);
		serSubCategorias.guardar(subcat);
		
		return "private/admin/index-admin";
	}
	
	//Listar todas las subcategorias por Categoria
	@GetMapping("/verSubcategorias")
	public String listarCategSub(@RequestParam("id") int cat_id, Model model) {
		List<SubCategorias> listaCS = serSubCategorias.listarPorCategorias(cat_id);
		model.addAttribute("listarSubCat", listaCS);
		return "private/admin/listar-subcategorias";
	}

	//Metodo para eliminar categorias
	@GetMapping("/deleteSubCat")
	public String eliminarSubCategoria(@RequestParam("id") int id_sub) {
		serSubCategorias.eliminar(id_sub);
		return "private/admin/index-admin";
	}
	
	/////////////////// CONTROLADOR DE LA ENTIDAD DE PRODUCTO //////////////////////////////
	@RequestMapping(value = "/agregarProductos", method=RequestMethod.GET)
	public String agregarProductos(Model model) {
		
		return "/private/admin/agregar-producto";	
	}
	
	//Metodo para Listar
	@RequestMapping(value = "/listarProductos", method=RequestMethod.GET)
	public String listarProductos(Model model) {
		List<Productos> lista = serProductos.listar();
		model.addAttribute("listarProductos", lista);
		return "private/admin/tabla-productos";
	}
	
	//Metodo para ver el detalle del producto
	@RequestMapping(value = "/listarDetallesPro", method=RequestMethod.GET)
	public String listarDetallePro(@RequestParam("id") int id_pro, Model model) {
		List<Imagenes> listaImg = serImagen.listarPorProducto(id_pro);
		model.addAttribute("listaImag", listaImg);
		return "private/admin/listar-productoDetalle";
	}
	
	/*
	@RequestMapping(value="/saveProducto", method=RequestMethod.POST)
	public String savePro(Productos producto ) {
		
		System.out.println(producto);
		return "private/admin/index-admin";
	}
	*/
	@RequestMapping(value="/saveProducto", method=RequestMethod.POST)
	public String savePro(@RequestParam ("nombre") String nombre, @RequestParam ("codigo") String codigo, @RequestParam ("descripcion") String descripcion, @RequestParam ("estado") String estado, 
						@RequestParam ("alto") String alto , @RequestParam ("ancho") String ancho, @RequestParam ("profundidad") String profundidad, @RequestParam ("stock") String stock, 
						@RequestParam ("descuento") String descuento, @RequestParam ("precioC") String precioC,@RequestParam ("precioD") String precioD, @RequestParam ("color") String color, 
						@RequestParam ("categoria") String categoria, @RequestParam ("subcategoria") String subcategoria, @RequestParam ("marca") String marca, @RequestParam ("imagen") MultipartFile multiPart , @RequestParam ("id") String id) {
		System.out.println( id +""+ nombre +" "+ codigo +" " + descripcion + "-"+ estado +" "+ alto +" " + ancho + "-"+ profundidad+ " " + stock + " "+ descuento + "" +precioC +" "+ precioD +" " + color + "-"+ categoria +" "+ subcategoria + " "+ marca);
		Productos pro = new Productos();
		pro.setId(Integer.parseInt(id));
		pro.setCodigo(codigo);
		pro.setNombre(nombre);
		pro.setDescripcion(descripcion);
		pro.setPrecioC(Double.valueOf(precioC));
		pro.setPrecioD(Double.valueOf(precioD));
		pro.setAncho(Double.valueOf(ancho));
		pro.setAlto(Double.valueOf(alto));
		pro.setProfundidad(Double.valueOf(profundidad));
		pro.setStock(Integer.parseInt(stock));
		pro.setDescuento(Double.valueOf(descuento));
		pro.setColor(color);
		pro.setEstado(estado.charAt(0));
		SubCategorias subcat = new SubCategorias();
		int id_subcat=Integer.parseInt(subcategoria); 
		subcat.setId(id_subcat);
		pro.setSubcategoria(subcat);
		Marcas mar = new Marcas();
		int id_mar=Integer.parseInt(marca);
		mar.setId(id_mar);
		pro.setMarca(mar);
		serProductos.guardar(pro);
		
		if (!multiPart.isEmpty()) {
			String ruta = "C:/Users/Usuario/Documents/ProyectoComercialLunaPazmino/ComercialLunaP/src/main/resources/static/imagenes/"; // Windows
			String nombreImagen = Utileria.guardarArchivo(multiPart, ruta);
				if (nombreImagen != null){ // La imagen si se subio
				// Procesamos la variable nombreImagen
				Imagenes img = new Imagenes();
				img.setUrl(nombreImagen);
				img.setProducto(pro);
				System.out.println(nombreImagen);
				serImagen.guardar(img);
				}
			}
		return "private/admin/index-admin";
	}
	
	//Metodo para Editar un Producto
	@GetMapping("/editarProducto/{id}")
	public String editarProducto(@PathVariable("id") int idPro, Model model) {
		Productos producto = serProductos.buscarProductoPorID(idPro);
		model.addAttribute("producto", producto);
		System.out.println(producto.getNombre()+ producto.getCodigo());
		return "private/admin/editar-producto";
	}
	
	//Metodo para eliminar productos
	@GetMapping("/deletePro")
	public String eliminarPro(@RequestParam("id") int id_pro) {
		serProductos.eliminar(id_pro);
		System.out.println("Borrar la producto: " + id_pro);
		return "redirect:/home-admin/listarProductos";
	}
	
	//Lista de Productos Bloqueados
	@RequestMapping(value = "/productosBloqueados", method=RequestMethod.GET)
	public String listarProInactivos(Model model) {
		List<Productos> listaInactivos = serProductos.listarProductosInactivos('I');
		model.addAttribute("listarI", listaInactivos);
		return "private/admin/productos-bloqueados";	
	}
	//Activar Productos
	@GetMapping("/activarProducto")
	public String activarProducto(@RequestParam("id") int id_pro) {
		serProductos.activarProducto(id_pro);
		return "private/admin/index-admin";
	}
	
	//BuscarProductosPor Nombre
	@GetMapping("/searchPro")
	public String buscarProducto(@ModelAttribute("search") Productos productos , Model model) {
		System.out.println("Buscando por " + productos);
		ExampleMatcher matcher = ExampleMatcher.matching().withMatcher("codigo", ExampleMatcher.GenericPropertyMatchers.contains());
		Example<Productos> example = Example.of(productos);
		List<Productos> listarPro = serProductos.buscarByExample(example);
		model.addAttribute("productosL", listarPro);
		return "private/admin/buscar-productos" ;	
	}
	
	//Listar Por Paginacion
	@GetMapping("/pageProductos")
	public String pageProductos(Model model ) {
		Page<Productos> lista = serProductos.paginacionProductos();
		model.addAttribute("pageProductos", lista);
		return "private/admin/tabla-productos";
		
	}
	
	/////////////////// CONTROLADOR DE LA ENTIDAD DE PRODUCTO - Imagenes //////////////////////////////
	@RequestMapping(value = "/pro-img", method=RequestMethod.GET)
	public String mostarImagenes(Model model) {
		List<Imagenes> listaI = serImagen.listar();
		model.addAttribute("listaI", listaI);
		return "private/admin/imagenes-productos";	
	}
		
	/////////////////// CONTROLADOR DE LA ENTIDAD DE PEDIDOS //////////////////////////////
	
	@RequestMapping(value = "/listarPedidos", method=RequestMethod.GET)
	public String listarPedidos(Model model) {
		List<PedidosCabeceras> listaPC = serPedidoC.listar();
		model.addAttribute("listarPedidosC", listaPC);
		return "private/admin/listar-pedidos1";	
	}
	
	
	/////////////////// CONTROLADOR DE LA ENTIDAD DE PEDIDOS DETALLES//////////////////////////////
	
	@GetMapping("/verDetalle/{id}")
	public String verDetalleP(@PathVariable("id") int id_pedC, Model model) {
		PedidosCabeceras pedidosCabeceras = serPedidoC.buscarPedidosCPorID(id_pedC);
		model.addAttribute("cabecera", pedidosCabeceras);
	
		PedidosDetalles pedidosDetalles = serPedidoD.buscarPorCabecera_Id(id_pedC);
		model.addAttribute("detalle", pedidosDetalles);
		
		int id_persona = pedidosCabeceras.getPersona().getId();
		Personas cliente = serPersonas.buscarPersonaPorID(id_persona);
		model.addAttribute("cliente", cliente);
		
		List<PedidosDetalles>  listaDC = serPedidoD.buscarPedidoC_Id(id_pedC);
		model.addAttribute("listarDetalleC", listaDC);
		
		return "private/admin/pedidos-detalles";
	}
	
	//Cambiar Estado Pedido Cabecera
	@RequestMapping(value="/editarPedidoC", method=RequestMethod.POST)
	public String editarPedidoC(@RequestParam ("id") String id, @RequestParam ("estado") String estado) {
		System.out.println("Id = " + id + " Nuevo Estado= " + estado);
		
		int id_ped = Integer.parseInt(id);
		char estad = estado.charAt(0);
		serPedidoC.editar(id_ped, estad);
		
		return "redirect:/home-admin/listarPedidos" ;
		
	}
	
	//Metodo para Editar un Producto
		/*@GetMapping("/editarProducto/{id}")
		public String editarProducto(@PathVariable("id") int idPro, Model model) {
			Productos producto = serProductos.buscarProductoPorID(idPro);
			model.addAttribute("producto", producto);
			System.out.println(producto.getNombre()+ producto.getCodigo());
			return "private/admin/editar-producto";
		}
		*/
	@RequestMapping(value = "/listarDetalles", method=RequestMethod.GET)
	public String listarDetalle( Model model) {
		List<PedidosDetalles> listarDet = serPedidoD.listar();
		model.addAttribute("listarDetalle", listarDet);
		return "private/admin/listar-pedidosD";
	}
	
/////////////////// CONTROLADOR DE LA ENTIDAD DE MARCAS //////////////////////////////
	//Redireccionamiento Seccion Marcas
	
	@RequestMapping(value = "/listarMarcas", method=RequestMethod.GET)
	public String listarMarcas(Model model) {
		List<Marcas> lista = serMarcas.listar();
		model.addAttribute("listarMarcas", lista);
		return "private/admin/agregar-marca";	
	}
	
	@RequestMapping(value="/saveMarca", method=RequestMethod.POST)
	public String saveMar(@RequestParam ("nombre") String nombre, @RequestParam ("origen") String origen) {
		System.out.println(nombre +" " + origen);
		Marcas mar = new Marcas();
		mar.setNombre(nombre);
		char orig = origen.charAt(0);
		mar.setOrigen(orig);
		serMarcas.guardar(mar);
		return "redirect:/home-admin/agregar-marca";
	}
	
	/////////////////// CONTROLADOR DE LA ENTIDAD DE EMPLEADOS //////////////////////////////
	
	// Redireccionamiento Seccion Cuentas
	@RequestMapping(value = "/registrarEmpleados", method=RequestMethod.GET)
	public String listarEmpleados(Model model) {
		List<Personas> lista = serPersonas.listarByRol('E');
		model.addAttribute("listarEmpleados", lista);
		return "private/admin/registrarEmpleados";	
	}
	
	@RequestMapping(value="/saveEmp", method=RequestMethod.POST)
	public String saveEmp(@RequestParam ("nombre") String nombre,  @RequestParam ("apellido") String apellido, @RequestParam ("cedula") String cedula, @RequestParam ("telefono") String telefono,  @RequestParam ("email") String email, @RequestParam ("pass") String password) {
		System.out.println(nombre +"-"+ apellido +"- " + cedula + "-"+ telefono + "-" + email + "-" + password );
		Personas per = new Personas();
		per.setApellidos(apellido);
		per.setCedula(cedula);
		per.setContrasena(password);
		per.setEmail(email);
		per.setEstado('A');
		per.setNombres(nombre);
		per.setRol('E');
		per.setTelefono(telefono);
		serPersonas.guardar(per);
		
		return "private/admin/index-admin";
	}
	
	//Metodo para Listar Empleados
	@RequestMapping(value = "/listarEmpleados", method=RequestMethod.GET)
	public String listarEmp(Model model) {
		List<Personas> lista = serPersonas.listarByRol('E');
		model.addAttribute("listarEmp", lista);
		return "private/admin/listar-empleados";
	}
	
	@RequestMapping(value = "/listarClientes", method=RequestMethod.GET)
	public String listarCli(Model model) {
		List<Personas> lista = serPersonas.listarByRol('C');
		model.addAttribute("listarCli", lista);
		return "private/admin/listar-clientes";
	}
	
	// @PostMapping("/save")
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public String agregarP(@RequestParam("nombre")String nombre, @RequestParam("nombre1")String nombre1) {
		System.out.println("Productos: "+ nombre + "Codigo: " + nombre1);
		return "private/admin/agregar-producto";
	}
	
	@GetMapping("/viewEmp/{id}")
	public String editarEmp(@PathVariable("id") int idC, Model model) {
		System.out.println("Id Categoria" + idC);
		model.addAttribute("id_cat", idC);
		return "private/admin/detalle-categoria";
	}
		
	//Metodo para eliminar categorias
	@GetMapping("/deleteEmp")
	public String eliminarEmp(@RequestParam("id") int id_per) {
		serPersonas.eliminar(id_per);
		return "private/admin/index-admin";
	}
		
	@InitBinder
	public void initBinder(WebDataBinder webDataBinder) {
	SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
	webDataBinder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
	}
	
	@ModelAttribute
	public void setGenericos(Model model) {
		Productos busquedaPro = new Productos();
		model.addAttribute("search", busquedaPro);
		List<Marcas> listaM = serMarcas.listar();
		List<SubCategorias> listaSC = serSubCategorias.listar();
		List<Categorias> listaC = serCategorias.listar();
		model.addAttribute("listarSC", listaSC);
		model.addAttribute("listarM", listaM);
		model.addAttribute("listarC", listaC);
		
	}

}
