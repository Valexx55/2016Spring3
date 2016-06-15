package springbasics7;

import java.util.List;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class MiControlador {
	
	
	
	@Autowired//es la versión de Spring de Inject, que seria el estándar JAVA JSR 229 // Resource es igual, pero más fino, porque te permite filtar por el NOMBRE del bean a la hora de inyectar y no sólo por el tipo (con o cual, si tienes varios beans del mismo tipo pero con distitno nombre, Resource sería sensible a esta circustancia y Inject o Autowired NO
	private EmpleadosServiceInterface empleado_service;
	
	private final static Logger log = Logger.getLogger("mylog");
	
	@RequestMapping(path = "/listaempleados")
	public String leer_empleados (Model model) {
		
		List<Empleado> leEmpleados = null;
		
			empleado_service.listarEmpleados();
			
			leEmpleados = empleado_service.listarEmpleados(); 
				
			model.addAttribute("lista_empleados", leEmpleados);
		
		return "listaemp";
		
	}
	
 

}
