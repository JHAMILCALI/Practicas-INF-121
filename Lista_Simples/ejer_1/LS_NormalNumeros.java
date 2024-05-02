package ejer_1;

public class LS_NormalNumeros extends ListaSimpleNumeros{

	public LS_NormalNumeros() {
		super();
	}

	public boolean esVacia() {
		if(P == null)
			return true;
		return false;
	}

	public void adiPrincipio(int z) {
		NodoNumeros nuevo = new NodoNumeros();
		nuevo.setDato(z);
		nuevo.setSig(P); //el siguiente del nodo nuevo apunta a nodo raiz
		P = nuevo;      //P apunta a nuevo
	}
	
	public void adiFinal(int z) {
		NodoNumeros nuevo = new NodoNumeros();
		nuevo.setDato(z);
		
		if(esVacia())
			P = nuevo;   //p apunta a nuevo
		else {
			NodoNumeros R = P;
			while( R.getSig() != null ){
			     R = R.getSig();
			}
			R.setSig(nuevo);
		}
	}
	
	
	public void mostrar() {
		NodoNumeros R = P;   //R apunta  a la raiz P
		while(R != null) {
			//R.getQ().mostrar();
			System.out.print(R.getQ()+" ");
			R = R.getSig();
		}
	}

	public int nroNodos() {
		NodoNumeros R = P;
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
