package ejer_5;

public class LS_NormalMateria extends ListaSimpleMateria{

	public LS_NormalMateria() {
		super();
	}

	public boolean esVacia() {
		if(P == null)
			return true;
		return false;
	}

	public void adiPrincipio(Materia z,LS_NormalEstudiante LEstudiante) {
		NodoMateria nuevo = new NodoMateria();
		nuevo.setMateria(z);
		nuevo.setLEstudiantes(LEstudiante);
		nuevo.setSig(P); //el siguiente del nodo nuevo apunta a nodo raiz
		P = nuevo;      //P apunta a nuevo
	}
	
	public void adiFinal(Materia z,LS_NormalEstudiante LEstudiante) {
		NodoMateria nuevo = new NodoMateria();
		nuevo.setMateria(z);
		nuevo.setLEstudiantes(LEstudiante);
		if(esVacia())
			P = nuevo;   //p apunta a nuevo
		else {
			NodoMateria R = P;
			while( R.getSig() != null ){
			     R = R.getSig();
			}
			R.setSig(nuevo);
		}
	}
	
	
	public void mostrar() {
		NodoMateria R = P;   //R apunta  a la raiz P
		System.out.println("\n\tLISTA DE MateriaS");
		while(R != null) {
			R.getMateria().mostrar();
			R.getLEstudiantes().mostrar();
			System.out.println("------------");
			R = R.getSig();
		}
	}

	public int nroNodos() {
		NodoMateria R = P;
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
	public NodoMateria eliPrincipio() {
		NodoMateria x = new NodoMateria();
		if(!esVacia()) {
			x = P;
			P = P.getSig();
			x.setSig(null);
		}
		return x;
	}
	
	public NodoMateria eliFinal() {
		NodoMateria x = new NodoMateria();
		if(!esVacia()) {
			if(nroNodos() == 1) {
				x = P;
				P = null;
			}
			else {
				NodoMateria R = P;
				NodoMateria S = P;
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
