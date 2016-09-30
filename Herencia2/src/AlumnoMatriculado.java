
public class AlumnoMatriculado extends Alumnos{
	boolean matriculado = false;

	public AlumnoMatriculado(String dNI, String nombre, String apellido, int matriculadas, boolean matriculado) {
		super(dNI, nombre, apellido, matriculadas);
		this.matriculado = matriculado;
	}

	public boolean isMatriculado() {
		return matriculado;
	}

	public void setMatriculado(boolean matriculado) {
		this.matriculado = matriculado;
	}

	@Override
	public String toString() {
		return "AlumnoMatriculado [matriculado=" + matriculado + ", matriculadas=" + matriculadas + ", dNI=" + dNI
				+ ", nombre=" + nombre + ", apellido=" + apellido + "]";
	}
	
	
	
	
	
	
	
}
