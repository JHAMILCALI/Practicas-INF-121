package ejer_3;
import java.util.Scanner;
public class PilaProyecto extends VectorProyecto{
	private int tope;
	public PilaProyecto() {
		this.tope = -1;
	}
	public boolean esVacia() {
		if(this.tope == -1) {
			return true; //pila vacia
		}
		else {
			return false; //pila no es vacia
		}
	}
	
	public boolean esLlena() {
		if(this.tope == max) {
			return true; //pila llena
		}
		else {
			return false;  //pila no es llena
		}
	}
	
	public void adi (Proyecto elem) {
		if(!esLlena()) { //si la pila no es llena --> ! es negacion
			this.tope++;    //incrementa en una unidad tope = tope +1
			this.v[this.tope] = elem;
		}
		else {
			System.out.println("Pila llena!!!");
		}
	}
	
	public Proyecto eli() {
		Proyecto elem= new Proyecto();
		if(!esVacia()) { //si la pila no esta vacia
			elem = this.v[this.tope];
			this.tope--;  //decrementa en una unidad
		}
		else {
			System.out.println("Pila es vacia!!!");
			
		}
		return elem;
	}
	
	public void mostrar() {
		PilaProyecto aux = new PilaProyecto();
		Proyecto elem;
		while(!esVacia()) {
			elem = eli();
			elem.mostrar();
			aux.adi(elem);
		}
		vaciar(aux);
	}
	
	public void vaciar(PilaProyecto p) {
		while(!p.esVacia()) { //mientras la pila p NO es vacia
			this.adi(p.eli());
		}
	}
	
	public void llenar(int n) {
		Scanner sc = new Scanner(System.in);
		for(int i = 1;i<=n;i++) {
			System.out.println("INTRODUCE DATOS DEL PROYECTO: ");
			System.out.println("Titulo del proyecto: ");
			String tituloProy = sc.nextLine();
			ColaCircularParticipante listaParticipante = new ColaCircularParticipante();
			System.out.println("Ingresa la cantidad de particiantes: ");
			int part = sc.nextInt();
			sc.nextLine();
			listaParticipante.llenar(part);
			Proyecto elem= new Proyecto(tituloProy,listaParticipante);
			this.adi(elem);
		}
	}
	
	public int nroElem() {
		return tope + 1;
	}
}
