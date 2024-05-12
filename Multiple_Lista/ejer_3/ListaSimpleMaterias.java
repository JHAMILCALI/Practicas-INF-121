package ejer_3;
public class ListaSimpleMaterias {
	protected NodoMaterias P;  //raiz de la lista
	
	public ListaSimpleMaterias() {
		P = null;		// la raiz apunta a nullo es decir
						// se define una lista simple vacia
	}

	public NodoMaterias getP() {
		return P;
	}

	public void setP(NodoMaterias p) {
		P = p;
	}
	
}
