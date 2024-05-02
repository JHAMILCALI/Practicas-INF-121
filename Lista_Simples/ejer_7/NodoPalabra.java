package ejer_7;
public class NodoPalabra {
	private String Q;  //define el dato objeto Palabra
	private NodoPalabra sig; //definiendo el campo enlace sig
	
	public NodoPalabra() {  //constructor
		sig = null;
	}

	public String getQ() {
		return Q;
	}

	public void setDato(String q) {
		this.Q = q;
	}

	public NodoPalabra getSig() {
		return sig;
	}

	public void setSig(NodoPalabra sig) {
		this.sig = sig;
	}
	
}
