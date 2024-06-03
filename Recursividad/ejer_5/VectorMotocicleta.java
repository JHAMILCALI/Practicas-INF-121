package ejer_5;
public class VectorMotocicleta {
	protected
	int max=50;
	Motocicleta v[] = new Motocicleta[max];
	public int getMax() {
		return max;
	}
	public void setMax(int max) {
		this.max = max;
	}
	public Motocicleta[] getV() {
		return v;
	}
	public void setV(Motocicleta[] v) {
		this.v = v;
	}
}
