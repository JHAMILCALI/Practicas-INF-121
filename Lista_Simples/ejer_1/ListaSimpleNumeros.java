package ejer_1;
public class ListaSimpleNumeros{
	protected NodoNumeros P;  //raiz de la lista
	
	public ListaSimpleNumeros() {
		P = null;		// la raiz apunta a nullo es decir
						// se define una lista simple vacia
	}

	public NodoNumeros getP() {
		return P;
	}

	public void setP(NodoNumeros p) {
		P = p;
	}
	
}
