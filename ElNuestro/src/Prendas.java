
public class Prendas {

	//1 Atributos
	int ID;
	String nombrePrenda;
	String tipo;
	char talla;
	boolean genero;
	double precio;
	
	//2 Constructores
	
	public Prendas (int ID, String nombrePrenda, String tipo, char talla, boolean genero, double precio){
		
		
		this.ID = ID;
		this.nombrePrenda = nombrePrenda;
		this.tipo = tipo;
		this.talla = talla;
		this.genero = genero;
		this.precio = precio;
	}
	
	//3 Getersansetters

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getNombrePrenda() {
		return nombrePrenda;
	}

	public void setNombrePrenda(String nombrePrenda) {
		this.nombrePrenda = nombrePrenda;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public char getTalla() {
		return talla;
	}

	public void setTalla(char talla) {
		this.talla = talla;
	}

	public boolean isGenero() {
		return genero;
	}

	public void setGenero(boolean genero) {
		this.genero = genero;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public String toString(){
		return getID()+" "+getNombrePrenda()+" "+getTipo()+" "+getTalla()+" "+isGenero()+" "+getPrecio();
	}
	
}
