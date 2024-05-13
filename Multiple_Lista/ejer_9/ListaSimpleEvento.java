package ejer_9;
public class ListaSimpleEvento{
	protected NodoEvento P;  //raiz de la lista
	
	public ListaSimpleEvento() {
		P = null;		// la raiz apunta a nullo es decir
						// se define una lista simple vacia
	}

	public NodoEvento getP() {
		return P;
	}

	public void setP(NodoEvento p) {
		P = p;
	}
	
}
