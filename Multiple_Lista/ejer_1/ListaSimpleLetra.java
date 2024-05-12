package ejer_1;
public class ListaSimpleLetra{
	protected NodoLetra P;  //raiz de la lista
	
	public ListaSimpleLetra() {
		P = null;		// la raiz apunta a nullo es decir
						// se define una lista simple vacia
	}

	public NodoLetra getP() {
		return P;
	}

	public void setP(NodoLetra p) {
		P = p;
	}
	
}
