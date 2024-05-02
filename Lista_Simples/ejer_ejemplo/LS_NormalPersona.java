package ejer_ejemplo;
public class LS_NormalPersona extends ListaSimplePersona{

	public LS_NormalPersona() {
		super();
	}

	public boolean esVacia() {
		if(P == null)
			return true;
		return false;
	}

	public void adiPrincipio(Persona z) {
		NodoPersona nuevo = new NodoPersona();
		nuevo.setDato(z);
		nuevo.setSig(P); //el siguiente del nodo nuevo apunta a nodo raiz
		P = nuevo;      //P apunta a nuevo
	}
	
	public void adiFinal(Persona z) {
		NodoPersona nuevo = new NodoPersona();
		nuevo.setDato(z);
		
		if(esVacia())
			P = nuevo;   //p apunta a nuevo
		else {
			NodoPersona R = P;
			while( R.getSig() != null ){
			     R = R.getSig();
			}
			R.setSig(nuevo);
		}
	}
	
	
	public void mostrar() {
		NodoPersona R = P;   //R apunta  a la raiz P
		while(R != null) {
			R.getQ().mostrar();
			System.out.println("------------");
			R = R.getSig();
		}
	}

	public int nroNodos() {
		NodoPersona R = P;
		int c = 0;
		if(this.esVacia())
			return 0;
		else {
			while(R != null) {
				c++;
				R = R.getSig();
			}
		}
		return c;
	}
}
