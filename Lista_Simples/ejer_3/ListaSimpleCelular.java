package ejer_3;
public class ListaSimpleCelular {
	protected NodoCelular P;  //raiz de la lista
	
	public ListaSimpleCelular() {
		P = null;		// la raiz apunta a nullo es decir
						// se define una lista simple vacia
	}

	public NodoCelular getP() {
		return P;
	}

	public void setP(NodoCelular p) {
		P = p;
	}
	
}
