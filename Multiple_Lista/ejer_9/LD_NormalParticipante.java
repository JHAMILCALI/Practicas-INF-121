package ejer_9;
//Lic Aruquipa Marcelo
public class LD_NormalParticipante extends ListaDobleParticipante{
	public LD_NormalParticipante() {
		super();
	}
	boolean esVacia() {
		if(this.P == null)
			return true;
		return false;
	}
	int nroNodos() {
		int c = 0;
		NodoParticipante R = this.P;
		while(R != null) {
			c++;
			R = R.getSig();
		}
		return c;
	}
	void adiPrimero(Participante z){
		NodoParticipante nuevo = new NodoParticipante();
		nuevo.setParticipante(z);
		if(esVacia())
			P = nuevo;
		else {
			nuevo.setSig(P);
			P.setAnt(nuevo);
			P = nuevo;
		}
	}
	void mostrar() {
		NodoParticipante R = P;
		System.out.println("\t*****LISTA DE EMPLEADOS*****");
		while(R != null) {
			R.getParticipante().mostrar();
			System.out.println("-------------------");
			R = R.getSig();
		}
	}
	void adiFinal(Participante z) {
		NodoParticipante nuevo =  new NodoParticipante();
		nuevo.setParticipante(z);
		if(esVacia())
			P = nuevo;
		else {
			NodoParticipante R = P;
			while(R.getSig() != null) {
				R = R.getSig();
			}
			R.setSig(nuevo);
			nuevo.setAnt(R);
		}
	}
	
	NodoParticipante eliPrimero() {
		NodoParticipante x = new NodoParticipante();
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
	
	NodoParticipante eliFinal() {
		NodoParticipante x = new NodoParticipante();
		if(!esVacia()) {
			if(nroNodos() == 1) {
				x = P;
				P = null;
			}else {
				NodoParticipante R = P;
				while(R.getSig() != null) {
					R = R.getSig();
				}
				x = R;
				NodoParticipante aux = R.getAnt();
				aux.setSig(null);
				x.setAnt(null);
			}
		}
		return x;
	}
	
	void leer1(int n) {
		for (int i = 1; i <= n; i++) {
			Participante z = new Participante();
			z.leer();
			adiPrimero(z);
		}
	}
	
	void leer2(int n) {
		for (int i = 1; i <= n; i++) {
			Participante z = new Participante();
			z.leer();
			adiFinal(z);
		}
	}
}
