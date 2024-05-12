package ejer_3;
public class ListaSimpleEstudiante{
	protected NodoEstudiante P;  //raiz de la lista
	
	public ListaSimpleEstudiante() {
		P = null;		// la raiz apunta a nullo es decir
						// se define una lista simple vacia
	}

	public NodoEstudiante getP() {
		return P;
	}

	public void setP(NodoEstudiante p) {
		P = p;
	}
	
}
