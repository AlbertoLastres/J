
public class AlumnoEdad extends Alumnos{
	int edad;

	public AlumnoEdad(String dNI, String nombre, String apellido, int matriculadas, int edad) {
		super(dNI, nombre, apellido, matriculadas);
		this.edad = edad;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "AlumnoEdad [edad=" + edad + ", matriculadas=" + matriculadas + ", dNI=" + dNI + ", nombre=" + nombre
				+ ", apellido=" + apellido + "]";
	}
	
	
}
