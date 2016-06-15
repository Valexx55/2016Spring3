package springbasics7;

import java.util.List;
import java.util.Map;


public interface EmpleadoDAO {
	
	public List<Empleado> list();
	public Empleado read(long id);
	public void insert(Empleado region);

}
