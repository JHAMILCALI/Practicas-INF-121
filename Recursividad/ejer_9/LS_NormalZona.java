package ejer_9;

public class LS_NormalZona extends ListaSimpleZona{

	public LS_NormalZona() {
		super();
	}

	public boolean esVacia() {
		if(P == null)
			return true;
		return false;
	}

	public void adiPrincipio(Zona z) {
		NodoZona nuevo = new NodoZona();
		nuevo.setDato(z);
		nuevo.setSig(P); //el siguiente del nodo nuevo apunta a nodo raiz
		P = nuevo;      //P apunta a nuevo
	}
	
	public void adiFinal(Zona z) {
		NodoZona nuevo = new NodoZona();
		nuevo.setDato(z);
		
		if(esVacia())
			P = nuevo;   //p apunta a nuevo
		else {
			NodoZona R = P;
			while( R.getSig() != null ){
			     R = R.getSig();
			}
			R.setSig(nuevo);
		}
	}
	
	
	public void mostrar() {
		NodoZona R = P;   //R apunta  a la raiz P
		System.out.println("*****LISTA DE ZonaS*****");
		while(R != null) {
			R.getQ().mostrar();
			//System.out.println("-------------------");
			R = R.getSig();
		}
	}

	public int nroNodos() {
		NodoZona R = P;
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
