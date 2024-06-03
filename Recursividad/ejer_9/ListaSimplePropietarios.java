package ejer_9;
public class ListaSimplePropietarios {
	protected NodoPropietarios P;  //raiz de la lista
	
	public ListaSimplePropietarios() {
		P = null;		// la raiz apunta a nullo es decir
						// se define una lista simple vacia
	}

	public NodoPropietarios getP() {
		return P;
	}

	public void setP(NodoPropietarios p) {
		P = p;
	}
	
}
