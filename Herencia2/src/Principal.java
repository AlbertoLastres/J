
public class Principal {

	public static void main(String[] args) {
		Alumnos Alumno1 = new Alumnos("50478244Y", "Luis Alberto", "Lastres", 5);
		Profesores profesor1 = new Profesores("50478244Y", "Jose", "Alberto", 5000, true);
		Profesores profesor2 = new ProfesorESO("50478244", "Jose", "Maria", 5000, true, null);
		Alumnos alumno3 = new AlumnoEdad("123456789A", "Alberto", "Lastres", 5, 36);
		

		System.out.println(alumno3.toString());
	}
}
