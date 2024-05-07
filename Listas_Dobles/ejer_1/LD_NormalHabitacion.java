package ejer_1;
//Lic Aruquipa Marcelo
public class LD_NormalHabitacion extends ListaDobleHabitacion{
	public LD_NormalHabitacion() {
		super();
	}
	boolean esVacia() {
		if(this.P == null)
			return true;
		return false;
	}
	int nroNodos() {
		int c = 0;
		NodoHabitacion R = this.P;
		while(R != null) {
			c++;
			R = R.getSig();
		}
		return c;
	}
	void adiPrimero(Habitacion z){
		NodoHabitacion nuevo = new NodoHabitacion();
		nuevo.setHabitacion(z);
		if(esVacia())
			P = nuevo;
		else {
			nuevo.setSig(P);
			P.setAnt(nuevo);
			P = nuevo;
		}
	}
	void mostrar() {
		NodoHabitacion R = P;
		System.out.println("\tLISTA DE Habitacion");
		while(R != null) {
			R.getHabitacion().mostrar();
			System.out.println("-------------------");
			R = R.getSig();
		}
	}
	void adiFinal(Habitacion z) {
		NodoHabitacion nuevo =  new NodoHabitacion();
		nuevo.setHabitacion(z);
		if(esVacia())
			P = nuevo;
		else {
			NodoHabitacion R = P;
			while(R.getSig() != null) {
				R = R.getSig();
			}
			R.setSig(nuevo);
			nuevo.setAnt(R);
		}
	}
	
	NodoHabitacion eliPrimero() {
		NodoHabitacion x = new NodoHabitacion();
		if(!esVacia()) {
			if(nroNodos() == 1) {
				x = P;
				P = null;
			}else {
				x = P;
				P = P.getSig();
				P.setAnt(null);
				x.setSig(null);
			}
		}
		return x;
	}
	
	NodoHabitacion eliFinal() {
		NodoHabitacion x = new NodoHabitacion();
		if(!esVacia()) {
			if(nroNodos() == 1) {
				x = P;
				P = null;
			}else {
				NodoHabitacion R = P;
				while(R.getSig() != null) {
					R = R.getSig();
				}
				x = R;
				NodoHabitacion aux = R.getAnt();
				aux.setSig(null);
				x.setAnt(null);
			}
		}
		return x;
	}
	
	void leer1(int n) {
		for (int i = 1; i <= n; i++) {
			Habitacion z = new Habitacion();
			z.leer();
			adiPrimero(z);
		}
	}
	
	void leer2(int n) {
		for (int i = 1; i <= n; i++) {
			Habitacion z = new Habitacion();
			z.leer();
			adiFinal(z);
		}
	}
}
