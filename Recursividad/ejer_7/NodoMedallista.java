package ejer_7;
public class NodoMedallista {
	private Medallista Q;  //define el dato objeto Medallista
	private NodoMedallista sig; //definiendo el campo enlace sig
	
	public NodoMedallista() {  //constructor
		sig = null;
	}

	public Medallista getQ() {
		return Q;
	}

	public void setDato(Medallista q) {
		this.Q = q;
	}

	public NodoMedallista getSig() {
		return sig;
	}

	public void setSig(NodoMedallista sig) {
		this.sig = sig;
	}
	
}
