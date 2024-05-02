package ejer_5;

public class VectorLibro {
	protected
	int max=50;
	Libro v[] = new Libro[max];
	public int getMax() {
		return max;
	}
	public void setMax(int max) {
		this.max = max;
	}
	public Libro[] getV() {
		return v;
	}
	public void setV(Libro[] v) {
		this.v = v;
	}
}
