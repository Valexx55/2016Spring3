package springbasics7;


import java.util.List;


import javax.sql.DataSource;


import org.springframework.jdbc.core.JdbcTemplate;

public class EmpleadoDAOImpl implements EmpleadoDAO {
	
	private JdbcTemplate jdbcTemplate;


	public EmpleadoDAOImpl (DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}


	@Override
	public List<Empleado> list() {
		String consulta = "SELECT * FROM employees";//Esto deber�a estar aparte, s�lo por motivos did�cticos se incluye aqu�
		
		List<Empleado> l_empleado = this.jdbcTemplate.query(consulta, new EmpleadoRowMapper());
		
		return l_empleado;
	}

	@Override
	public Empleado read(long id) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void insert(Empleado region) {
		String sql = "INSERT INTO REGIONS (REGION_ID, REGION_NAME) VALUES (?, ?)";
		
		this.jdbcTemplate.update(sql, region.getId(), region.getName());
	
		
	}


}
