package springbasics7;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EmpleadoRowMapper implements RowMapper<Empleado> {

	@Override
	public Empleado mapRow(ResultSet rs, int nfila) throws SQLException {

		Empleado empleado = null;
		
		empleado = new Empleado(rs.getLong("emp_no"), rs.getString("last_name"));
		
		return empleado;
	}

}
