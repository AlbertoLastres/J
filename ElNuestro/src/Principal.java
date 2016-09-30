
public class Principal {

	public static void main(String[] args) {
		Prendas prenda1 = new Prendas(512312, "Camisa Roja", "Camisa", 'M', true, 5.52);
		
		prenda1.setPrecio(9.99);
		System.out.println(prenda1.toString());

	}

}
