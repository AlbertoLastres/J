
public class Trapecio {
	double basemayor;
	double basemenor;
	double altura;
	
	public Trapecio(double basemayor, double basemenor, double altura){
		this.basemayor = basemayor;
		this.basemenor = basemenor;
		this.altura = altura;
		
	}

	public double getBasemayor() {
		return basemayor;
	}

	public void setBasemayor(double basemayor) {
		this.basemayor = basemayor;
	}

	public double getBasemenor() {
		return basemenor;
	}

	public void setBasemenor(double basemenor) {
		this.basemenor = basemenor;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Trapecio [basemayor=" + basemayor + ", basemenor=" + basemenor + ", altura=" + altura + "]";
	}
	
	public double area(){
		double total = ((getBasemayor() + getBasemenor()) /2) * getAltura();
		return total;
		
	}
}
