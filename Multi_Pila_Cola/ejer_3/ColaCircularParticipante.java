package ejer_3;
import java.util.*;
public class ColaCircularParticipante extends ColaParticipante{
	public ColaCircularParticipante() {
		super();
	}
	public int nroElem() {
		return (fi - fr + max) % max;
	}
	public boolean esVacia() {
		if(nroElem() == 0)
			return true;
		return false;
		
	}
	public boolean esLlena() {
		if(nroElem() == max-1)
			return true;
		return false;
	}
	public void adi(String elem) {
		if(!esLlena()) {
			fi = (fi + 1) % max;
			v[fi] = elem;
		}else
			System.out.println("cola circular llena!!!");
	}
	public String eli() {
		String elem = "";
		if(!esVacia()) {
			fr = (fr + 1) % max;
			elem = v[fr];
		}else
			System.out.println("Cola circular vacia!!");
		return elem;
	}
	
	public void vaciar(ColaCircularParticipante z) {
		while(!z.esVacia()) {
			adi(z.eli());
		}
	}
	public void llenar(int n) {
		Scanner lee = new Scanner(System.in);
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Ingresa el nombre del Participante: ");
			String elem = lee.nextLine();
			adi(elem);
		}
	}
	public void mostrar() {
		ColaCircularParticipante aux = new ColaCircularParticipante();
		String elem;
		while(!esVacia()) {
			elem = eli();	
			System.out.println("Participante [nombre= " +elem+ "]");
			aux.adi(elem);
		}
		vaciar(aux);
	}
}
