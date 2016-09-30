
public class Coche extends Vehiculo{
	
	boolean cuatroXCuatro;

	public Coche(String matricula, String marca, String modelo, double indiceContaminacion, boolean cuatroXCuatro) {
		super(matricula, marca, modelo, indiceContaminacion);
		this.cuatroXCuatro = cuatroXCuatro;
	}

	public boolean isCuatroXCuatro() {
		return cuatroXCuatro;
	}

	public void setCuatroXCuatro(boolean cuatroXCuatro) {
		this.cuatroXCuatro = cuatroXCuatro;
	}

	@Override
	public String toString() {
		return "Coche [cuatroXCuatro=" + cuatroXCuatro + ", matricula=" + matricula + ", marca=" + marca + ", modelo="
				+ modelo + ", indiceContaminacion=" + indiceContaminacion + "]";
	}

	
	
	
}
