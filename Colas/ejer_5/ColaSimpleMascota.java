package ejer_5;
import java.util.Scanner;
public class ColaSimpleMascota extends ColaMascota{

	public ColaSimpleMascota() {
		super();
	}
	public boolean esVacia() {
		if(fr == fi)
			return true;
		return false;
		
	}
	public boolean esLlena() {
		if(fi == MAX-1)
			return true;
		return false;
	}
	public void adi(Mascota elem) {
		if(esLlena())
			System.out.println("cola simple llena!!!");
		else {
			fi++;
			v[fi] = elem;
		}
	}
	public Mascota eli() {
		Mascota elem = new Mascota();
		if(esVacia())
			System.out.println("Cola simple vacia!!");
		else {
			fr++;
			elem = v[fr];
		}
		return elem;
	}
	public int nroElem() {
		return (fi - fr);
	}
	public void vaciar(ColaSimpleMascota z) {
		while(!z.esVacia()) {
			adi(z.eli());
		}
	}
	public void llenar(int n) {
		for (int i = 1; i <= n; i++) {
			Mascota elem =new Mascota();
			elem.leer();
			adi(elem);
		}
	}
	public void mostrar() {
		ColaSimpleMascota aux = new ColaSimpleMascota();
		Mascota x;
		while(!esVacia()) {
			x = eli();
			x.mostrar();
			aux.adi(x);
		}
		vaciar(aux);
	}
}