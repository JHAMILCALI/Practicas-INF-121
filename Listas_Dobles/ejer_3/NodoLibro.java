package ejer_3;


public class NodoLibro {
	private Libro libro;
	
	private NodoLibro sig; //definiendo el campo enlace sig
	private NodoLibro ant;
	
	public NodoLibro() {  //constructor
		sig = null;
		ant = null;
	}

	public Libro getLibro() {
		return libro;
	}

	public void setLibro(Libro libro) {
		this.libro = libro;
	}

	public NodoLibro getSig() {
		return sig;
	}

	public void setSig(NodoLibro sig) {
		this.sig = sig;
	}

	public NodoLibro getAnt() {
		return ant;
	}

	public void setAnt(NodoLibro ant) {
		this.ant = ant;
	}

	
}
