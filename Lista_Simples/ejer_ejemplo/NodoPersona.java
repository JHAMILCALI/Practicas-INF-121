package ejer_ejemplo;
public class NodoPersona {
	private Persona Q;  //define el dato objeto persona
	private NodoPersona sig; //definiendo el campo enlace sig
	
	public NodoPersona() {  //constructor
		sig = null;
	}

	public Persona getQ() {
		return Q;
	}

	public void setDato(Persona q) {
		this.Q = q;
	}

	public NodoPersona getSig() {
		return sig;
	}

	public void setSig(NodoPersona sig) {
		this.sig = sig;
	}
	
}
