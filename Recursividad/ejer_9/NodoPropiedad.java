package ejer_9;
public class NodoPropiedad {
	private Propiedad Q;  //define el dato objeto Propiedad
	private NodoPropiedad sig; //definiendo el campo enlace sig
	
	public NodoPropiedad() {  //constructor
		sig = null;
	}

	public Propiedad getQ() {
		return Q;
	}

	public void setDato(Propiedad q) {
		this.Q = q;
	}

	public NodoPropiedad getSig() {
		return sig;
	}

	public void setSig(NodoPropiedad sig) {
		this.sig = sig;
	}
	
}
