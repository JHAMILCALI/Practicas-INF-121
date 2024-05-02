package ejer_1;
public class NodoNumeros {
	private int Q;  //define el dato objeto Celular
	private NodoNumeros sig; //definiendo el campo enlace sig
	
	public NodoNumeros() {  //constructor
		sig = null;
	}

	public int getQ() {
		return Q;
	}

	public void setDato(int q) {
		this.Q = q;
	}

	public NodoNumeros getSig() {
		return sig;
	}

	public void setSig(NodoNumeros sig) {
		this.sig = sig;
	}
	
}
