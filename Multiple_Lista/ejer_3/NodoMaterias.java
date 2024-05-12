package ejer_3;
public class NodoMaterias {
	private Materias Q;  //define el dato objeto Materias
	private LS_NormalEstudiante LEstudiante;
	private LS_NormalCalificacion lCalificacion;
	private NodoMaterias sig; //definiendo el campo enlace sig
	
	public NodoMaterias() {  //constructor
		sig = null;
	}

	public Materias getQ() {
		return Q;
	}

	public void setQ(Materias q) {
		Q = q;
	}

	public LS_NormalEstudiante getLEstudiante() {
		return LEstudiante;
	}

	public void setLEstudiante(LS_NormalEstudiante lEstudiante) {
		LEstudiante = lEstudiante;
	}

	public LS_NormalCalificacion getlCalificacion() {
		return lCalificacion;
	}

	public void setlCalificacion(LS_NormalCalificacion lCalificacion) {
		this.lCalificacion = lCalificacion;
	}

	public NodoMaterias getSig() {
		return sig;
	}

	public void setSig(NodoMaterias sig) {
		this.sig = sig;
	}
	
}
