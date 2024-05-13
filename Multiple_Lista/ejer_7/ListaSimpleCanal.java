package ejer_7;
public class ListaSimpleCanal{
	protected NodoCanal P;  //raiz de la lista
	
	public ListaSimpleCanal() {
		P = null;		// la raiz apunta a nullo es decir
						// se define una lista simple vacia
	}

	public NodoCanal getP() {
		return P;
	}

	public void setP(NodoCanal p) {
		P = p;
	}
	
}
