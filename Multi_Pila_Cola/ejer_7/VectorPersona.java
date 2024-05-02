package ejer_7;

public class VectorPersona {
	protected
	int max=50;
	Persona v[] = new Persona[max];
	public int getMax() {
		return max;
	}
	public void setMax(int max) {
		this.max = max;
	}
	public Persona[] getV() {
		return v;
	}
	public void setV(Persona[] v) {
		this.v = v;
	}
}
