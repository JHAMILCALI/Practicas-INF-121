package ejer_7;
public class ListaSimplePrograma{
	protected NodoPrograma P;  //raiz de la lista
	
	public ListaSimplePrograma() {
		P = null;		// la raiz apunta a nullo es decir
						// se define una lista simple vacia
	}

	public NodoPrograma getP() {
		return P;
	}

	public void setP(NodoPrograma p) {
		P = p;
	}
	
}
