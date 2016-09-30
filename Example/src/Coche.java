
public class Coche {

	// La primera clase de DAM
	// 1. Añado los atributos :D
	
	String matricula;
	String marca;
	String modelo;
	String color;
	double precio;
	
	// 2. Metodo constructor: Es el metodo necesario para crear los objetos.
	
	public Coche (String matricula, String marca, String modelo, String color, double precio) {
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.precio = precio;
		
	}
	
	// 3. Generar metodos get y set

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	//4. Metodo para imprimir un objeto competo:
	
	public String toString() {
		return getMatricula()+" "+getMarca()+" "+getModelo()+" "+getColor()+" "+getPrecio();
	}
	
	
	
	
}
