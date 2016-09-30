
public class ProfesorESO extends Profesores{
	
	String departamento;

	public ProfesorESO(String dNI, String nombre, String apellido, double salario, boolean tutor, String departamento) {
		super(dNI, nombre, apellido, salario, tutor);
		this.departamento = departamento;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	@Override
	public String toString() {
		return "ProfesorESO [Departamento=" + departamento + "]";
	}
	
}
