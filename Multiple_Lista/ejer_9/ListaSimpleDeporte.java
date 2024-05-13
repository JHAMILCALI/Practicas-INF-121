package ejer_9;
public class ListaSimpleDeporte{
	protected NodoDeporte P;  //raiz de la lista
	
	public ListaSimpleDeporte() {
		P = null;		// la raiz apunta a nullo es decir
						// se define una lista simple vacia
	}

	public NodoDeporte getP() {
		return P;
	}

	public void setP(NodoDeporte p) {
		P = p;
	}
	
}
