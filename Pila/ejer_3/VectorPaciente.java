package ejer_3;
public class VectorPaciente {
	protected
	int max=50;
	Paciente v[] = new Paciente[max];
	public int getMax() {
		return max;
	}
	public void setMax(int max) {
		this.max = max;
	}
	public Paciente[] getV() {
		return v;
	}
	public void setV(Paciente[] v) {
		this.v = v;
	}
}
