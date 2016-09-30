
public class Principal {

	public static void main(String[] args) {
		
		Circunferencia c1 = new Circunferencia(3.5);
		Cuadrado cuadrado = new Cuadrado(15);
		Triangulo triangulo = new Triangulo(15.2, 6.5);
		Trapecio trapecio = new Trapecio(16, 12, 4);
		Rombo rombo = new Rombo(14, 10);
		
		double resultado = c1.aera();
		double resultadoperimetro = cuadrado.perimetro();
		double resultadocuadrado = cuadrado.area();
		double resultadotriangulo = triangulo.area();
		double resultadotrapecio = trapecio.area();
		double resultadorombo = rombo.total();
	
		System.out.println("El area de una circunferencia de "+ c1.getRadio() +" es " + resultado + ".");
		System.out.println("El perímetro de un Cuadrado de " + cuadrado.getBase() + " es " + resultadoperimetro + ".");
		System.out.println("La base de un Cuadrado de " + cuadrado.getBase() + " es " + resultadocuadrado + ".");
		System.out.println("El area de un triangulo de base " + triangulo.getBase() + " y de altura " + triangulo.getAltura() + " es " + resultadotriangulo + ".");
		System.out.println("El area de un trapecio de base mayor " + trapecio.getBasemayor() + ", base menor " + trapecio.getBasemenor() + " y " + trapecio.altura + " de altura, es: " + resultadotrapecio + ".");
		System.out.println("El area de un rombo de base mayor " + rombo.getDiagonalmayor() + ". base menor " + rombo.getDiagonalmenor() + " es " + resultadorombo + ".");
	}

}
