
public class Alumnos extends Personas{

	int matriculadas;

	public Alumnos(String dNI, String nombre, String apellido, int matriculadas) {
		super( dNI, nombre, apellido);
		this.matriculadas = matriculadas;
	}

	protected int getMatriculadas() {
		return matriculadas;
	}

	protected void setMatriculadas(int matriculadas) {
		this.matriculadas = matriculadas;
	}

	@Override
	public String toString() {
		return "Alumnos [matriculadas=" + matriculadas + "]";
	}
	
	
}
