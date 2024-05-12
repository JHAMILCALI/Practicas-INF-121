package ejer_1;
public class NodoLetra {
	private char letra;  //define el dato objeto Persona
	private NodoLetra sig; //definiendo el campo enlace sig
	
	public NodoLetra() {  //constructor
		sig = null;
	}

	public char getLetra() {
		return letra;
	}

	public void setLetra(char letra) {
		this.letra = letra;
	}

	public NodoLetra getSig() {
		return sig;
	}

	public void setSig(NodoLetra sig) {
		this.sig = sig;
	}

}
