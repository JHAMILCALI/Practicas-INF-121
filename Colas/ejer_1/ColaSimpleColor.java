package ejer_1;
import java.util.*;
public class ColaSimpleColor extends ColaColor{
	public ColaSimpleColor() {
		super();
	}
	public boolean esVacia() {
		if(fr == fi) {
			return true;
		}
		else {
			return false;
		}
	}
	public boolean esLlena() {
		if(fi == max-1) {
			return true;
		}
		else {
			return false;
		}
	}
	public void adi(String elem) {
		if(esLlena()) {
			System.out.println("Cola simple llena!!!");
		}
		else {
			fi++;
			v[fi] = elem;
		}
	}
	public String eli() {
		String elem = "";
		if(esVacia()) {
			System.out.println("Cola simple vacia!!!");
		}
		else {
			fr++;
			elem = v[fr];
		}
		return elem;
	}
	public int nroElem() {
		return(fi-fr);
	}
	public void vaciar(ColaSimpleColor z) {
		while(!z.esVacia()) {
			adi(z.eli());
		}
	}
	public void llenar(int n) {
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < n; i++) {
			System.out.println("Ingresa un color: ");
			String x = sc.next();
			adi(x);
		}
	}
	public void mostrar() {
		ColaSimpleColor aux = new ColaSimpleColor();
		String x = "";
		while(!esVacia()) {
			x = eli();
			System.out.println("Color : "+x);
			aux.adi(x);
		}
		vaciar(aux);
	}
}
