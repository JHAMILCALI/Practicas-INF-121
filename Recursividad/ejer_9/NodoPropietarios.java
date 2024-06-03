package ejer_9;
public class NodoPropietarios {
	private Propietarios Q;  //define el dato objeto Propietarios
	private NodoPropietarios sig; //definiendo el campo enlace sig
	
	public NodoPropietarios() {  //constructor
		sig = null;
	}

	public Propietarios getQ() {
		return Q;
	}

	public void setDato(Propietarios q) {
		this.Q = q;
	}

	public NodoPropietarios getSig() {
		return sig;
	}

	public void setSig(NodoPropietarios sig) {
		this.sig = sig;
	}
	
}
