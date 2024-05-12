package ejer_5;

public class LS_NormalLaboratorio extends ListaSimpleLaboratorio{

	public LS_NormalLaboratorio() {
		super();
	}

	public boolean esVacia() {
		if(P == null)
			return true;
		return false;
	}

	public void adiPrincipio(Laboratorio z,LS_NormalMateria LMateria,LS_NormalResponsable LResponsable) {
		NodoLaboratorio nuevo = new NodoLaboratorio();
		nuevo.setLaboratorio(z);
		nuevo.setLMateria(LMateria);
		nuevo.setLResponsable(LResponsable);
		nuevo.setSig(P); //el siguiente del nodo nuevo apunta a nodo raiz
		P = nuevo;      //P apunta a nuevo
	}
	
	public void adiFinal(Laboratorio z,LS_NormalMateria LMateria,LS_NormalResponsable LResponsable) {
		NodoLaboratorio nuevo = new NodoLaboratorio();
		nuevo.setLaboratorio(z);
		nuevo.setLMateria(LMateria);
		nuevo.setLResponsable(LResponsable);
		if(esVacia())
			P = nuevo;   //p apunta a nuevo
		else {
			NodoLaboratorio R = P;
			while( R.getSig() != null ){
			     R = R.getSig();
			}
			R.setSig(nuevo);
		}
	}
	
	
	public void mostrar() {
		NodoLaboratorio R = P;   //R apunta  a la raiz P
		System.out.println("\t*****LISTA DE LABORIOS*****");
		while(R != null) {
			R.getLaboratorio().mostrar();
			R.getLMateria().mostrar();
			R.getLResponsable().mostrar();
			System.out.println("===================================");
			R = R.getSig();
		}
	}

	public int nroNodos() {
		NodoLaboratorio R = P;
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
	public NodoLaboratorio eliPrincipio() {
		NodoLaboratorio x = new NodoLaboratorio();
		if(!esVacia()) {
			x = P;
			P = P.getSig();
			x.setSig(null);
		}
		return x;
	}
	
	public NodoLaboratorio eliFinal() {
		NodoLaboratorio x = new NodoLaboratorio();
		if(!esVacia()) {
			if(nroNodos() == 1) {
				x = P;
				P = null;
			}
			else {
				NodoLaboratorio R = P;
				NodoLaboratorio S = P;
				while(R.getSig() != null) {
					S = R;
					R = R.getSig();
				}
				x = R;
				S.setSig(null);
			}
		}
		return x;
	}
}
