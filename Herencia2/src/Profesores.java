
public class Profesores extends Personas{
	double salario;
	boolean tutor;
	public Profesores(String dNI, String nombre, String apellido, double salario, boolean tutor) {
		super(dNI, nombre, apellido);
		this.salario = salario;
		this.tutor = tutor;
	}
	protected double getSalario() {
		return salario;
	}
	protected void setSalario(double salario) {
		this.salario = salario;
	}
	protected boolean isTutor() {
		return tutor;
	}
	protected void setTutor(boolean tutor) {
		this.tutor = tutor;
	}
	@Override
	public String toString() {
		return "Profesores [salario=" + salario + ", tutor=" + tutor + "]";
	}
	
	
	
	
}
