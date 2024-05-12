package ejer_3;
public class NodoCalificacion {
	private Calificacion Q;  //define el dato objeto Calificacion
	private NodoCalificacion sig; //definiendo el campo enlace sig
	
	public NodoCalificacion() {  //constructor
		sig = null;
	}

	public Calificacion getQ() {
		return Q;
	}

	public void setDato(Calificacion q) {
		this.Q = q;
	}

	public NodoCalificacion getSig() {
		return sig;
	}

	public void setSig(NodoCalificacion sig) {
		this.sig = sig;
	}
	
}
