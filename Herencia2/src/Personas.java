
public class Personas {
	String dNI;
	String nombre;
	String apellido;
	
	public Personas(String dNI, String nombre, String apellido) {
		this.dNI = dNI;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	protected String getDNI() {
		return dNI;
	}

	protected void setDNI(String dNI) {
		this.dNI = dNI;
	}

	protected String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected String getApellido() {
		return apellido;
	}

	protected void setApellido(String apellido) {
		this.apellido = apellido;
	}

	@Override
	public String toString() {
		return "Personas [DNI=" + dNI + ", Nombre=" + nombre + ", Apellido=" + apellido + "]";
	}
	
	
}
