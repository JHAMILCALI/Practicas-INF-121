package ejer_1;
import java.util.Scanner;

public class ColaCircularNombre extends ColaNombre{
	public ColaCircularNombre() {
		super();
	}
	public int nroElem() {
		return (fi - fr + MAX) % MAX;
	}
	public boolean esVacia() {
		if(nroElem() == 0)
			return true;
		return false;
		
	}
	public boolean esLlena() {
		if(nroElem() == MAX-1)
			return true;
		return false;
	}
	public void adi(Persona elem) {
		if(!esLlena()) {
			fi = (fi + 1) % MAX;
			v[fi] = elem;
		}else
			System.out.println("cola circular llena!!!");
	}
	public Persona eli() {
		Persona elem = new Persona();
		if(!esVacia()) {
			fr = (fr + 1) % MAX;
			elem = v[fr];
		}else
			System.out.println("Cola circular vacia!!");
		return elem;
	}
	
	public void vaciar(ColaCircularNombre z) {
		while(!z.esVacia()) {
			adi(z.eli());
		}
	}
	public void llenar(int n) {
		Scanner lee = new Scanner(System.in);
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Intr. numero entero");
			Persona  elem = new Persona();
			elem.leer();
			adi(elem);
		}
	}
	public void mostrar() {
		ColaCircularNombre aux = new ColaCircularNombre();
		while(!esVacia()) {
			Persona elem = eli();
			System.out.println(elem);
			aux.adi(elem);
		}
		vaciar(aux);
	}
	public Persona eli(int i) {
	    Persona elem = new Persona(); // Elemento a devolver
	    if (!esVacia()) { // Verificar si la cola no está vacía
	        fr = (fr + 1) % MAX; // Avanzar el índice de frente para obtener el elemento en la posición i
	        elem = v[fr]; // Obtener el elemento en la posición i
	    } else {
	        System.out.println("Cola circular vacía!!"); // Mensaje de error si la cola está vacía
	    }
	    return elem; // Devolver el elemento en la posición i
	}
	public void adi(Persona elem, int i) {
	    if (!esLlena()) { // Verificar si la cola no está llena
	        fi = (fi + 1) % MAX; // Avanzar el índice de finalización para agregar el elemento en la posición i
	        v[fi] = elem; // Agregar el elemento en la posición i
	    } else {
	        System.out.println("Cola circular llena!!!"); // Mensaje de error si la cola está llena
	    }
	}

}
