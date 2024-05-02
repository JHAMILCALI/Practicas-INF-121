package ejer_3;

public class LS_NormalCelular extends ListaSimpleCelular{

	public LS_NormalCelular() {
		super();
	}

	public boolean esVacia() {
		if(P == null)
			return true;
		return false;
	}

	public void adiPrincipio(Celular z) {
		NodoCelular nuevo = new NodoCelular();
		nuevo.setDato(z);
		nuevo.setSig(P); //el siguiente del nodo nuevo apunta a nodo raiz
		P = nuevo;      //P apunta a nuevo
	}
	
	public void adiFinal(Celular z) {
		NodoCelular nuevo = new NodoCelular();
		nuevo.setDato(z);
		
		if(esVacia())
			P = nuevo;   //p apunta a nuevo
		else {
			NodoCelular R = P;
			while( R.getSig() != null ){
			     R = R.getSig();
			}
			R.setSig(nuevo);
		}
	}
	
	
	public void mostrar() {
		NodoCelular R = P;   //R apunta  a la raiz P
		while(R != null) {
			R.getQ().mostrar();
			System.out.println("-------------------");
			R = R.getSig();
		}
	}

	public int nroNodos() {
		NodoCelular R = P;
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
