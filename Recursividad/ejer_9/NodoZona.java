package ejer_9;
public class NodoZona {
	private Zona Q;  //define el dato objeto Zona
	private NodoZona sig; //definiendo el campo enlace sig
	
	public NodoZona() {  //constructor
		sig = null;
	}

	public Zona getQ() {
		return Q;
	}

	public void setDato(Zona q) {
		this.Q = q;
	}

	public NodoZona getSig() {
		return sig;
	}

	public void setSig(NodoZona sig) {
		this.sig = sig;
	}
	
}
