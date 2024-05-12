package ejer_5;

public class LS_NormalEstudiante extends ListaSimpleEstudiante{

	public LS_NormalEstudiante() {
		super();
	}

	public boolean esVacia() {
		if(P == null)
			return true;
		return false;
	}

	public void adiPrincipio(Estudiante z) {
		NodoEstudiante nuevo = new NodoEstudiante();
		nuevo.setDato(z);
		nuevo.setSig(P); //el siguiente del nodo nuevo apunta a nodo raiz
		P = nuevo;      //P apunta a nuevo
	}
	
	public void adiFinal(Estudiante z) {
		NodoEstudiante nuevo = new NodoEstudiante();
		nuevo.setDato(z);
		
		if(esVacia())
			P = nuevo;   //p apunta a nuevo
		else {
			NodoEstudiante R = P;
			while( R.getSig() != null ){
			     R = R.getSig();
			}
			R.setSig(nuevo);
		}
	}
	
	
	public void mostrar() {
		NodoEstudiante R = P;   //R apunta  a la raiz P
		System.out.println("\n\tLISTA DE ESTUDIANTES");
		while(R != null) {
			R.getQ().mostrar();
			System.out.println("------------");
			R = R.getSig();
		}
	}

	public int nroNodos() {
		NodoEstudiante R = P;
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
	public NodoEstudiante eliPrincipio() {
		NodoEstudiante x = new NodoEstudiante();
		if(!esVacia()) {
			x = P;
			P = P.getSig();
			x.setSig(null);
		}
		return x;
	}
	
	public NodoEstudiante eliFinal() {
		NodoEstudiante x = new NodoEstudiante();
		if(!esVacia()) {
			if(nroNodos() == 1) {
				x = P;
				P = null;
			}
			else {
				NodoEstudiante R = P;
				NodoEstudiante S = P;
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
