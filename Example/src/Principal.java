
public class Principal {

	public static void main (String [] args) {
	//  Clase Objeto = Variable
		Coche coche1 = new Coche ("5164HNH", "MINI", "COOPER", "NARANJA", 21345.67);
		
		coche1.setMatricula("0000TGB");
		
		//sysout control + espacio
		System.out.println(coche1.toString());
	}
}