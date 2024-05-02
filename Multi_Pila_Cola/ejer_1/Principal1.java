package ejer_1;
import java.util.Iterator;
public class Principal1 {

	public static void main(String[] args) {
		ColaCircularNombre A = new ColaCircularNombre();
		A.adi(new Persona("jose"));
		A.adi(new Persona("jhamil"));
		A.adi(new Persona("ana"));
		A.adi(new Persona("lucia"));
		A.adi(new Persona("alex"));
		A.adi(new Persona("sergio"));
		A.adi(new Persona("lupe"));
		ColaCircularNombre B = new ColaCircularNombre();
		B.adi(new Persona("luque"));
		B.adi(new Persona("juana"));
		B.adi(new Persona("laura"));
		B.adi(new Persona("elizhabet"));
		B.adi(new Persona("joel"));
		B.adi(new Persona("adrian"));
		ColaCircularNombre C = new ColaCircularNombre();
		C.adi(new Persona("pepe"));
		C.adi(new Persona("calixto"));
		C.adi(new Persona("lucia"));
		ColaCircularNombre D = new ColaCircularNombre();
		D.adi(new Persona("jordi"));
		
		Pila P = new Pila();
		
		P.adicionar(B);
		P.adicionar(A);
		P.adicionar(D);
		P.adicionar(C);
		P.mostrar();
//		a. Invertir cada cola sin usar estructuras auxiliares
		System.out.println("\t****INCISO A*****");
		inciso_a(P);
		P.mostrar();
//		b. Ordenar la pila según el número de elementos de 
//		las colas, ascendentemente.
		System.out.println("\t****INCISO B*****");
		inciso_b(P);
		P.mostrar();
		
	}

	private static void inciso_b(Pila p) {
		Pila aux1 = new Pila();
		Pila aux2 = new Pila();
		while (!p.esVacia()) {
			ColaCircularNombre elem = (ColaCircularNombre) p.eleminar();
			aux1.adicionar(elem);
		}
		while (!aux1.esVacia()) {
			int minNroElem = Integer.MAX_VALUE;
			ColaCircularNombre minCola = null;
			while (!aux1.esVacia()) {
				ColaCircularNombre elem = (ColaCircularNombre) aux1.eleminar();
				int nroElem = elem.nroElem();
				if (nroElem < minNroElem) {
					minNroElem = nroElem;
					minCola = elem;
				}
				aux2.adicionar(elem);
			}
			while (!aux2.esVacia()) {
				ColaCircularNombre elem = (ColaCircularNombre) aux2.eleminar();
				if (elem.nroElem() == minNroElem) {
					p.adicionar(elem);
				} else {
					aux1.adicionar(elem);
				}
			}
		}
	}

	private static void inciso_a(Pila p) {
	    Pila aux = new Pila();
	    while (!p.esVacia()) {
	        ColaCircularNombre cola = (ColaCircularNombre) p.eleminar();
	        int nroE = cola.nroElem();
	        String[] elementos = new String[nroE];
	        for (int i = 0; i < nroE; i++) {
	            elementos[i] = cola.eli().getNombre();
	        }
	        cola.vaciar(cola);
	        for (int i = nroE - 1; i >= 0; i--) {
	            cola.adi(new Persona(elementos[i]));
	        }
	        aux.adicionar(cola);
	    }
	    while (!aux.esVacia()) {
	        p.adicionar((ColaCircularNombre) aux.eleminar());
	    }
	}
}
