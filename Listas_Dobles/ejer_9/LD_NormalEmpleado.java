package ejer_9;
//Lic Aruquipa Marcelo
public class LD_NormalEmpleado extends ListaDobleEmpleado{
	public LD_NormalEmpleado() {
		super();
	}
	boolean esVacia() {
		if(this.P == null)
			return true;
		return false;
	}
	int nroNodos() {
		int c = 0;
		NodoEmpleadoEmp R = this.P;
		while(R != null) {
			c++;
			R = R.getSig();
		}
		return c;
	}
	void adiPrimero(EmpleadoEmp z){
		NodoEmpleadoEmp nuevo = new NodoEmpleadoEmp();
		nuevo.setEmpleado(z);
		if(esVacia())
			P = nuevo;
		else {
			nuevo.setSig(P);
			P.setAnt(nuevo);
			P = nuevo;
		}
	}
	void mostrar() {
		NodoEmpleadoEmp R = P;
		System.out.println("\t*****LISTA DE EMPLEADOS*****");
		while(R != null) {
			R.getEmpleado().mostrar();
			System.out.println("-------------------");
			R = R.getSig();
		}
	}
	void adiFinal(EmpleadoEmp z) {
		NodoEmpleadoEmp nuevo =  new NodoEmpleadoEmp();
		nuevo.setEmpleado(z);
		if(esVacia())
			P = nuevo;
		else {
			NodoEmpleadoEmp R = P;
			while(R.getSig() != null) {
				R = R.getSig();
			}
			R.setSig(nuevo);
			nuevo.setAnt(R);
		}
	}
	
	NodoEmpleadoEmp eliPrimero() {
		NodoEmpleadoEmp x = new NodoEmpleadoEmp();
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
	
	NodoEmpleadoEmp eliFinal() {
		NodoEmpleadoEmp x = new NodoEmpleadoEmp();
		if(!esVacia()) {
			if(nroNodos() == 1) {
				x = P;
				P = null;
			}else {
				NodoEmpleadoEmp R = P;
				while(R.getSig() != null) {
					R = R.getSig();
				}
				x = R;
				NodoEmpleadoEmp aux = R.getAnt();
				aux.setSig(null);
				x.setAnt(null);
			}
		}
		return x;
	}
	
	void leer1(int n) {
		for (int i = 1; i <= n; i++) {
			EmpleadoEmp z = new EmpleadoEmp();
			z.leer();
			adiPrimero(z);
		}
	}
	
	void leer2(int n) {
		for (int i = 1; i <= n; i++) {
			EmpleadoEmp z = new EmpleadoEmp();
			z.leer();
			adiFinal(z);
		}
	}
}
