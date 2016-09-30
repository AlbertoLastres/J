
public class Cuadrado {
	double base;
	
	public Cuadrado(double base){
		this.base = base;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	@Override
	public String toString() {
		return "Cuadrado [base=" + base + "]";
	}

	//otros
	
	public double area() {
		double total = getBase() * getBase();
		return total;
	}
	public double perimetro() {
		double perimetro = base * 4;
		return perimetro;
	}
	

}
