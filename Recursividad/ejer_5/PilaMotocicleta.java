package ejer_5;

import java.util.Scanner;


public class PilaMotocicleta extends VectorMotocicleta{
	private int tope;

	public PilaMotocicleta() {
		this.tope = -1;
	}
	
	public boolean esVacia(){
		if(this.tope == -1)
			return true;  //pila vacia
		else
			return false; //pila no es vacia
	}
	public boolean esLlena(){
		if(this.tope == max-1)
			return true;  //pila llena
		else 
			return false; //pila no es llena
	}
	public void adi(Motocicleta elem){
		if(!esLlena()){ //si la pila no es llena
			this.tope++;  //incrementa en una unidad  tope = tope + 1
			this.v[this.tope] = elem;
		}
		else
			System.out.println("Pila Llena!!!");
	}
	public Motocicleta eli(){
		Motocicleta elem = new Motocicleta();
		if(!esVacia()){ //si la pila no es vacia
			elem = this.v[this.tope];
			this.tope--; //decrementamos en una unidad
		}
		else
			System.out.println("Pila es vacia!!!!");
		return elem;
	}
	
	public void mostrar(){
		PilaMotocicleta aux = new PilaMotocicleta();
		System.out.println("\t===Datos de la pila===");
		while(!esVacia()){
			Motocicleta elem = new Motocicleta();
			 elem = eli();
			//System.out.println(elem);
			elem.mostrar();
			aux.adi(elem);
		} 
		vaciar(aux);
	}
	public void vaciar(PilaMotocicleta p){
		while(!p.esVacia()){  //mientras la pila p NO es vacia
			this.adi(p.eli());
		}
	}
	public void llenar(int n){
		Scanner lee = new Scanner(System.in);
		for (int i = 1; i <= n; i++) {
			Motocicleta elem = new Motocicleta();
			elem.leer();
			this.adi(elem);
		}
	}
	public int nroElem(){
		return tope + 1;
	}
	public int NroElem(){
		PilaMotocicleta aux = new PilaMotocicleta();
		int c = 0;
		while(!esVacia()){
			Motocicleta elem = eli();
			aux.adi(elem);
			c++;
		} 
		vaciar(aux);
		return c;
	}
}
