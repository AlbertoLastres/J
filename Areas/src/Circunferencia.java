
public class Circunferencia {
 double radio;
 

	public Circunferencia (double radio){
 		this.radio = radio;
 	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	@Override
	public String toString() {
		return "Circunferencia [radio=" + radio + "]";
	}
 	
	//5. Otros métodos
	
	public double aera() {
		double total = Math.PI * getRadio() * getRadio();
		return total;
	}
}
