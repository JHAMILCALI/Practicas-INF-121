package ejer_9;
public class NodoDistrito {
	private Distrito Q;  //define el dato objeto Distrito
	private NodoDistrito sig; //definiendo el campo enlace sig
	
	public NodoDistrito() {  //constructor
		sig = null;
	}

	public Distrito getQ() {
		return Q;
	}

	public void setDato(Distrito q) {
		this.Q = q;
	}

	public NodoDistrito getSig() {
		return sig;
	}

	public void setSig(NodoDistrito sig) {
		this.sig = sig;
	}
	
}
