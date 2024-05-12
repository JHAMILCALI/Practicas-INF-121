package ejer_5;
public class NodoResponsable{
	private Responsable Q;  //define el dato objeto Responsable
	private NodoResponsable sig; //definiendo el campo enlace sig
	
	public NodoResponsable() {  //constructor
		sig = null;
	}

	public Responsable getQ() {
		return Q;
	}

	public void setDato(Responsable q) {
		this.Q = q;
	}

	public NodoResponsable getSig() {
		return sig;
	}

	public void setSig(NodoResponsable sig) {
		this.sig = sig;
	}
	
}
