package ejer_7;
public class NodoPrograma{
	private Programa Programa;  //define el dato objeto Programa
	private NodoPrograma sig; //definiendo el campo enlace sig
	
	public NodoPrograma() {  //constructor
		sig = null;
	}

	public Programa getPrograma() {
		return Programa;
	}

	public void setDato(Programa Programa) {
		this.Programa = Programa;
	}

	public NodoPrograma getSig() {
		return sig;
	}

	public void setSig(NodoPrograma sig) {
		this.sig = sig;
	}
	
}
