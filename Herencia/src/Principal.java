
public class Principal {

	public static void main(String[] args) {
		Vehiculo coche1 = new Coche("5164HNH", "Mini", "One", 30, false);
		Vehiculo coche2 = new Coche("2731CNH", "Renault", "Clio", 100, false);
		Vehiculo coche3 = new Coche("8005DTP", "Audi", "A4", 70, false);
		
		Vehiculo moto1 = new Moto("5123REE", "Jarley", "Guanvinnson", 13, 666);
		Vehiculo camion1 = new Camion("141241BNC", "Renault", null, 14121, 16);

		System.out.println(coche1.toString());
		System.out.println("Es contaminante el coche?: "+coche1.esContaminante());
	}

}
