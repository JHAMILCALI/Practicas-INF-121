package ejer_7;

public class LS_NormalPalabra extends ListaSimplePalabra{

	public LS_NormalPalabra() {
		super();
	}

	public boolean esVacia() {
		if(P == null)
			return true;
		return false;
	}

	public void adiPrincipio(String z) {
		NodoPalabra nuevo = new NodoPalabra();
		nuevo.setDato(z);
		nuevo.setSig(P); //el siguiente del nodo nuevo apunta a nodo raiz
		P = nuevo;      //P apunta a nuevo
	}
	
	public void adiFinal(String z) {
		NodoPalabra nuevo = new NodoPalabra();
		nuevo.setDato(z);
		
		if(esVacia())
			P = nuevo;   //p apunta a nuevo
		else {
			NodoPalabra R = P;
			while( R.getSig() != null ){
			     R = R.getSig();
			}
			R.setSig(nuevo);
		}
	}
	
	
	public void mostrar() {
		NodoPalabra R = P;   //R apunta  a la raiz P
		System.out.println("******LISTA DE PALABRAS*****");
		while(R != null) {
			System.out.println(R.getQ());
			R = R.getSig();
		}
	}

	public int nroNodos() {
		NodoPalabra R = P;
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
