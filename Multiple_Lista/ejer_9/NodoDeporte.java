package ejer_9;
public class NodoDeporte{
	private Deporte Deporte;  //define el dato objeto Deporte
	private NodoDeporte sig; //definiendo el campo enlace sig
	
	public NodoDeporte() {  //constructor
		sig = null;
	}

	public Deporte getDeporte() {
		return Deporte;
	}

	public void setDato(Deporte Deporte) {
		this.Deporte = Deporte;
	}

	public NodoDeporte getSig() {
		return sig;
	}

	public void setSig(NodoDeporte sig) {
		this.sig = sig;
	}
	
}
