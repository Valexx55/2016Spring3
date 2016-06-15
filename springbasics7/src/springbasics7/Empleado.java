package springbasics7;

public class Empleado {

	private long id;
	private String name;
	
	
	
	public Empleado(long region_id, String l) {
		super();
		this.id = region_id;
		this.name = l;
	}
	public long getId() {
		return id;
	}
	public void setId(long region_id) {
		this.id = region_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String region_name) {
		this.name = region_name;
	}
	
	@Override
	public String toString() {
		return (this.id + this.name);
	}
	
	
}
