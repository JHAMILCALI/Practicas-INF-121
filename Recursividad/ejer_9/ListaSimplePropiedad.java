package ejer_9;
public class ListaSimplePropiedad {
	protected NodoPropiedad P;  //raiz de la lista
	
	public ListaSimplePropiedad() {
		P = null;		// la raiz apunta a nullo es decir
						// se define una lista simple vacia
	}

	public NodoPropiedad getP() {
		return P;
	}

	public void setP(NodoPropiedad p) {
		P = p;
	}
	
}
