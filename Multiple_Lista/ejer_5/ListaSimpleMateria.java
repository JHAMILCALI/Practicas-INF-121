package ejer_5;
public class ListaSimpleMateria{
	protected NodoMateria P;  //raiz de la lista
	
	public ListaSimpleMateria() {
		P = null;		// la raiz apunta a nullo es decir
						// se define una lista simple vacia
	}

	public NodoMateria getP() {
		return P;
	}

	public void setP(NodoMateria p) {
		P = p;
	}
	
}
