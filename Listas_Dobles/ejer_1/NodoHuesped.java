package ejer_1;

public class NodoHuesped {
	private
	NodoHuesped sig;
	Huesped Huesped = new Huesped();
	
	public
	NodoHuesped() {
		sig=null;
	}

	public NodoHuesped getSig() {
		return sig;
	}

	public void setSig(NodoHuesped sig) {
		this.sig = sig;
	}

	public Huesped getHuesped() {
		return Huesped;
	}

	public void setHuesped(Huesped Huesped) {
		this.Huesped = Huesped;
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
