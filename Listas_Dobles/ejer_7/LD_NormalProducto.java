package ejer_7;
//Lic Aruquipa Marcelo
public class LD_NormalProducto extends ListaDobleProducto{
	public LD_NormalProducto() {
		super();
	}
	boolean esVacia() {
		if(this.P == null)
			return true;
		return false;
	}
	int nroNodos() {
		int c = 0;
		Nodoproducto R = this.P;
		while(R != null) {
			c++;
			R = R.getSig();
		}
		return c;
	}
	void adiPrimero(producto z){
		Nodoproducto nuevo = new Nodoproducto();
		nuevo.setproducto(z);
		if(esVacia())
			P = nuevo;
		else {
			nuevo.setSig(P);
			P.setAnt(nuevo);
			P = nuevo;
		}
	}
	void mostrar() {
		Nodoproducto R = P;
		System.out.println("\t*****LISTA DE EMPLEADOS*****");
		while(R != null) {
			R.getproducto().mosttra();
			System.out.println("-------------------");
			R = R.getSig();
		}
	}
	void adiFinal(producto z) {
		Nodoproducto nuevo =  new Nodoproducto();
		nuevo.setproducto(z);
		if(esVacia())
			P = nuevo;
		else {
			Nodoproducto R = P;
			while(R.getSig() != null) {
				R = R.getSig();
			}
			R.setSig(nuevo);
			nuevo.setAnt(R);
		}
	}
	
	Nodoproducto eliPrimero() {
		Nodoproducto x = new Nodoproducto();
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
	
	Nodoproducto eliFinal() {
		Nodoproducto x = new Nodoproducto();
		if(!esVacia()) {
			if(nroNodos() == 1) {
				x = P;
				P = null;
			}else {
				Nodoproducto R = P;
				while(R.getSig() != null) {
					R = R.getSig();
				}
				x = R;
				Nodoproducto aux = R.getAnt();
				aux.setSig(null);
				x.setAnt(null);
			}
		}
		return x;
	}
	
	void leer1(int n) {
		for (int i = 1; i <= n; i++) {
			producto z = new producto();
			z.leer();
			adiPrimero(z);
		}
	}
	
	void leer2(int n) {
		for (int i = 1; i <= n; i++) {
			producto z = new producto();
			z.leer();
			adiFinal(z);
		}
	}
}
