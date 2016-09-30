
public class Rombo {
	double diagonalmayor;
	double diagonalmenor;
}

public Rombo(double diagonalmayor, double diagonalmenor){
	this.diagonalmayor = diagonalmayor;
	this.diagonalmenor = diagonalmenor;
}

public double getDiagonalmayor() {
	return diagonalmayor;
}

public void setDiagonalmayor(double diagonalmayor) {
	this.diagonalmayor = diagonalmayor;
}

public double getDiagonalmenor() {
	return diagonalmenor;
}

public void setDiagonalmenor(double diagonalmenor) {
	this.diagonalmenor = diagonalmenor;
}

@Override
public String toString() {
	return "Rombo [diagonalmayor=" + diagonalmayor + ", diagonalmenor=" + diagonalmenor + "]";
}

public double total() {
		double total = (getDiagonalmayor() * getDiagonalmenor())/2;
		return total;
}

}
