package ejer_3;
import java.util.*;
public class ColaSimpleMateria extends ColaMateria{
	public ColaSimpleMateria() {
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
	public void adi(Materia elem) {
		if(esLlena()) {
			System.out.println("Cola simple llena!!!");
		}
		else {
			fi++;
			v[fi] = elem;
		}
	}
	public Materia eli() {
		Materia elem = new Materia();
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
		return (fi-fr);
	}
	public void vaciar(ColaSimpleMateria z) {
		while(!z.esVacia()) {
			adi(z.eli());
		}
	}
	public void llenar(int n) {
		Scanner sc = new Scanner(System.in);
		for(int i = 1; i <= n; i++) {
			System.out.println("INTRODUCE DATOS DE LA MATERIA: ");
			System.out.println("Ingresa la sigla: ");
			String sigla = sc.next();
			PilaProyecto listaProyecto = new PilaProyecto();
			System.out.println("Ingresa la cantidad de proyectos de esta materia: ");
			int m = sc.nextInt();
			listaProyecto.llenar(m);
			Materia elem = new Materia(sigla,listaProyecto);
			adi(elem);
		}
	}
	public void mostrar() {
		ColaSimpleMateria aux = new ColaSimpleMateria();
		Materia x ;
		while(!esVacia()) {
			x = eli();
			x.mostrar();
			aux.adi(x);
		}
		vaciar(aux);
	}
}
