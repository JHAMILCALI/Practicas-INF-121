package ejer_1;

import java.util.Scanner;

public class Pila extends Vector{
	private
		int tope;
	public
	Pila() {
		tope=-1;
	}
	boolean esVacia() {
		if(tope==-1) {
			return true;
		}
		else {
			return false;
		}
	}
	boolean esLlena() {
		if (tope==max-1) {
			return true;
		}
		else {
			return false;
		}
	}
	void adicionar(ColaCircularNombre elem	){
		if (!esLlena()) {
			tope++;
			v[tope]=elem;
		}
		else {
			System.out.println("Pila Llena!!!!!!!1");
		}
	}
	ColaCircularNombre eleminar(){
		ColaCircularNombre dato= new ColaCircularNombre();
		if (!esVacia()) {
			dato=v[tope];
			tope--;;
		}
		else {
			System.out.println("Pila Vacia!!!!!!!!!");
		}
		return dato;
	}
	int nroElem() {
		return tope+1;
	}
	void llenar(int n) {
		Scanner sc = new Scanner(System.in);
		System.out.println("introduce el dato:");
		for (int i = 1; i <= n; i++) {
			ColaCircularNombre elem= new ColaCircularNombre();
			elem.llenar(i);
			adicionar(elem);
		}
	}
	void mostrar() {
		Pila aux = new Pila();
		
		while(!esVacia()) {
			ColaCircularNombre dato = eleminar();
			System.out.println("Datos de la Pila");
			dato.mostrar();
			aux.adicionar(dato);
		}
		vaciar(aux);
	}
	void vaciar(Pila p) {
		while (!p.esVacia()) {
			adicionar(p.eleminar());
		}
	}
	void NroElem() {
		Pila aux = new Pila();
		int c= 0;
		while(!esVacia()) {
			ColaCircularNombre dato = eleminar();
			System.out.println(dato);
			aux.adicionar(dato);
		}
		vaciar(aux);
	}
}
