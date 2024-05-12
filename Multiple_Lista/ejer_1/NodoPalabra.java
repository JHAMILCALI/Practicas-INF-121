package ejer_1;
public class NodoPalabra {
	private LS_NormalLetra letra; //define el dato objeto Persona
	private NodoPalabra sig; //definiendo el campo enlace sig
	
	public NodoPalabra() {  //constructor
		sig = null;
	}

	public LS_NormalLetra getLetra() {
		return letra;
	}

	public void setLetra(LS_NormalLetra letra) {
		this.letra = letra;
	}

	public NodoPalabra getSig() {
		return sig;
	}

	public void setSig(NodoPalabra sig) {
		this.sig = sig;
	}

}
