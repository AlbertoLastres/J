
public class Camion extends Vehiculo {

	int numRuedas;

	public Camion(String matricula, String marca, String modelo, double indiceContaminacion, int numRuedas) {
		super(matricula, marca, modelo, indiceContaminacion);
		this.numRuedas = numRuedas;
	}

	public int getNumRuedas() {
		return numRuedas;
	}

	public void setNumRuedas(int numRuedas) {
		this.numRuedas = numRuedas;
	}

	@Override
	public String toString() {
		return "Camion [numRuedas=" + numRuedas + "]";
	}
	
	
	
}
