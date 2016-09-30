
public class ProfesorFP extends Profesores {

	int numVisitas;

	public ProfesorFP(String dNI, String nombre, String apellido, double salario, boolean tutor, int numVisitas) {
		super(dNI, nombre, apellido, salario, tutor);
		this.numVisitas = numVisitas;
	}

	public int getNumVisitas() {
		return numVisitas;
	}

	public void setNumVisitas(int numVisitas) {
		this.numVisitas = numVisitas;
	}

	@Override
	public String toString() {
		return "ProfesorFP [numVisitas=" + numVisitas + "]";
	}
	
	
}
