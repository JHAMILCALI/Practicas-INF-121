package ejer_5;
public class NodoEstudiante{
	private Estudiante Q;  //define el dato objeto Estudiante
	private NodoEstudiante sig; //definiendo el campo enlace sig
	
	public NodoEstudiante() {  //constructor
		sig = null;
	}

	public Estudiante getQ() {
		return Q;
	}

	public void setDato(Estudiante q) {
		this.Q = q;
	}

	public NodoEstudiante getSig() {
		return sig;
	}

	public void setSig(NodoEstudiante sig) {
		this.sig = sig;
	}
	
}
