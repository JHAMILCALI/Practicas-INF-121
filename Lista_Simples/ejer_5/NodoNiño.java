package ejer_5;

public class NodoNiño {
	private
	NodoNiño sig;
	Niño x = new Niño();
	
	public
	NodoNiño() {
		sig=null;
	}

	public NodoNiño getSig() {
		return sig;
	}

	public void setSig(NodoNiño sig) {
		this.sig = sig;
	}

	public Niño getX() {
		return x;
	}

	public void setX(Niño x) {
		this.x = x;
	}
	
//	public String getNom() {
//		return nom;
//	}
//	public void setNom(String nom) {
//		this.nom = nom;
//	}
//	public int getEdad() {
//		return edad;
//	}
//	public void setEdad(int edad) {
//		this.edad = edad;
//	}
//	public NodoNiño getSig() {
//		return sig;
//	}
//	public void setSig(NodoNiño sig) {
//		this.sig = sig;
//	}
}
