package springbasics7;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EmpleadoService implements EmpleadosServiceInterface {
	
	@Autowired
	EmpleadoDAO empleadoDAO;

	@Override
	public List<Empleado> listarEmpleados() {
		List<Empleado> l_empleado = null;
		
			l_empleado = empleadoDAO.list();
			
			for (Empleado emp : l_empleado)
			{
				System.out.println(emp.getId() + " " + emp.getName());
			}
		
		return l_empleado;
	}



	
}
