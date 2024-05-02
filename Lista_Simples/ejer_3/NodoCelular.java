package ejer_3;
public class NodoCelular {
	private Celular Q;  //define el dato objeto Celular
	private NodoCelular sig; //definiendo el campo enlace sig
	
	public NodoCelular() {  //constructor
		sig = null;
	}

	public Celular getQ() {
		return Q;
	}

	public void setDato(Celular q) {
		this.Q = q;
	}

	public NodoCelular getSig() {
		return sig;
	}

	public void setSig(NodoCelular sig) {
		this.sig = sig;
	}
	
}
