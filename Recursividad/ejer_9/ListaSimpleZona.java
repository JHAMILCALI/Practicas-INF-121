package ejer_9;
public class ListaSimpleZona {
	protected NodoZona P;  //raiz de la lista
	
	public ListaSimpleZona() {
		P = null;		// la raiz apunta a nullo es decir
						// se define una lista simple vacia
	}

	public NodoZona getP() {
		return P;
	}

	public void setP(NodoZona p) {
		P = p;
	}
	
}
