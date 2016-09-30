
public class Moto extends Vehiculo{

	int cilindrada;

	public Moto(String matricula, String marca, String modelo, double indiceContaminacion, int cilindrada) {
		super(matricula, marca, modelo, indiceContaminacion);
		this.cilindrada = cilindrada;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	@Override
	public String toString() {
		return "Moto [cilindrada=" + cilindrada + "]";
	}

	
	
}
