package ejer_7;
public class NodoCanal{
	private Canal Canal;  //define el dato objeto Canal
	private NodoCanal sig; //definiendo el campo enlace sig
	
	public NodoCanal() {  //constructor
		sig = null;
	}

	public Canal getCanal() {
		return Canal;
	}

	public void setDato(Canal Canal) {
		this.Canal = Canal;
	}

	public NodoCanal getSig() {
		return sig;
	}

	public void setSig(NodoCanal sig) {
		this.sig = sig;
	}
	
}
