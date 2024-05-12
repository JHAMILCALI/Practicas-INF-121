package ejer_1;
public class ListaSimplePalabra{
	protected NodoPalabra P;  //raiz de la lista
	
	public ListaSimplePalabra() {
		P = null;		// la raiz apunta a nullo es decir
						// se define una lista simple vacia
	}

	public NodoPalabra getP() {
		return P;
	}

	public void setP(NodoPalabra p) {
		P = p;
	}
	
}
