package ejer_9;
public class ListaSimpleDistrito {
	protected NodoDistrito P;  //raiz de la lista
	
	public ListaSimpleDistrito() {
		P = null;		// la raiz apunta a nullo es decir
						// se define una lista simple vacia
	}

	public NodoDistrito getP() {
		return P;
	}

	public void setP(NodoDistrito p) {
		P = p;
	}
	
}
