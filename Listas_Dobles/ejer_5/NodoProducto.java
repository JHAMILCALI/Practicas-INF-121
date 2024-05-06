package ejer_5;

public class NodoProducto {
	private
	NodoProducto sig;
	Producto producto = new Producto();
	
	public
	NodoProducto() {
		sig=null;
	}

	public NodoProducto getSig() {
		return sig;
	}

	public void setSig(NodoProducto sig) {
		this.sig = sig;
	}

	public Producto getproducto() {
		return producto;
	}

	public void setproducto(Producto producto) {
		this.producto = producto;
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
