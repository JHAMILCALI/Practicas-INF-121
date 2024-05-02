package ejer_ejemplo;
public class ListaSimplePersona {
	protected NodoPersona P;  //raiz de la lista
	
	public ListaSimplePersona() {
		P = null;		// la raiz apunta a nullo es decir
						// se define una lista simple vacia
	}

	public NodoPersona getP() {
		return P;
	}

	public void setP(NodoPersona p) {
		P = p;
	}
	
}
