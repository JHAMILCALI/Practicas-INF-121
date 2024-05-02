package ejer_5;
public class VectorCliente {
	protected
	int max=50;
	Cliente v[] = new Cliente[max];
	public int getMax() {
		return max;
	}
	public void setMax(int max) {
		this.max = max;
	}
	public Cliente[] getV() {
		return v;
	}
	public void setV(Cliente[] v) {
		this.v = v;
	}
}
