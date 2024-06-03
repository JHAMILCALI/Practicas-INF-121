package ejer_9;

public class LS_NormalPropietarios extends ListaSimplePropietarios{

	public LS_NormalPropietarios() {
		super();
	}

	public boolean esVacia() {
		if(P == null)
			return true;
		return false;
	}

	public void adiPrincipio(Propietarios z) {
		NodoPropietarios nuevo = new NodoPropietarios();
		nuevo.setDato(z);
		nuevo.setSig(P); //el siguiente del nodo nuevo apunta a nodo raiz
		P = nuevo;      //P apunta a nuevo
	}
	
	public void adiFinal(Propietarios z) {
		NodoPropietarios nuevo = new NodoPropietarios();
		nuevo.setDato(z);
		
		if(esVacia())
			P = nuevo;   //p apunta a nuevo
		else {
			NodoPropietarios R = P;
			while( R.getSig() != null ){
			     R = R.getSig();
			}
			R.setSig(nuevo);
		}
	}
	
	
	public void mostrar() {
		NodoPropietarios R = P;   //R apunta  a la raiz P
		System.out.println("*****LISTA DE PropietariosS*****");
		while(R != null) {
			R.getQ().mostrar();
			//System.out.println("-------------------");
			R = R.getSig();
		}
	}

	public int nroNodos() {
		NodoPropietarios R = P;
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
