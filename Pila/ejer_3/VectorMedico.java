package ejer_3;
public class VectorMedico {
	protected
	int max=50;
	Medico v[] = new Medico[max];
	public int getMax() {
		return max;
	}
	public void setMax(int max) {
		this.max = max;
	}
	public Medico[] getV() {
		return v;
	}
	public void setV(Medico[] v) {
		this.v = v;
	}
}
