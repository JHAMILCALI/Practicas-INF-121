package ejer_5;

import java.util.Scanner;

public class Principal_RE_5 {
	public static void main(String[] args) {
//		Dada una Pila de objetos Motocicleta <color, marca, placa> se pide recursivamente:
		PilaMotocicleta A = new PilaMotocicleta();
		A.adi(new Motocicleta("Rojo","TOYOTA","63716CLP"));
		A.adi(new Motocicleta("Verde","SUSUKI","7366362JTR"));
		A.adi(new Motocicleta("Amarillo","TOYOTA","893878498LIO"));
		A.adi(new Motocicleta("Rojo","AUDI","838747POL"));
		A.adi(new Motocicleta("Verde","BWM","7364990CIO"));
		A.adi(new Motocicleta("Negro","NISAN","673663COI"));
		A.adi(new Motocicleta("Rojo","SUSUKI","536737RAV"));
		
		A.mostrar();
//		a. Verificar si existe alguna Motocicleta de la marca “BMW”.
		System.out.println("\n\t***INCISO A****");
		PilaMotocicleta aux = new PilaMotocicleta();
		String marcaX="BWM";
		if (verificar_Auto(A,aux,0,marcaX)) {
			System.out.println("Existe la motocicleta de "+marcaX);
		}else {
			System.out.println("No existe la motocicleta de "+marcaX);
		}
		
		System.out.println("------------");
		
//			b. Contar a las Motocicletas del color “Rojo”.
		System.out.println("\n\t***INCISO B****");
		String colorX="Rojo";
		System.out.println("La cantidad de motocicletas de color "+colorX+" es ["+contarColor(A,aux,0,colorX)+"]");
	}

	private static int contarColor(PilaMotocicleta a, PilaMotocicleta aux, int existe, String colorX) {
		if (!a.esVacia()) {
			Motocicleta mot = a.eli();
			if (mot.getColor().equals(colorX)) {
				existe++;
			}
			aux.adi(mot);
			return (contarColor(a, aux, existe, colorX));
		}else {
			a.vaciar(aux);
			return existe;
		}
		
	}

	private static boolean verificar_Auto(PilaMotocicleta a, PilaMotocicleta aux, int existe, String marcaX) {
		if (!a.esVacia()) {
			Motocicleta mot = a.eli();
			if (mot.getMarca().equals(marcaX)) {
				existe=1;
			}
			aux.adi(mot);
			return verificar_Auto(a, aux, existe, marcaX);
		}else {
			a.vaciar(aux);
			if (existe==1) {
				return true;
			}else {
				return false;
			}
		}
		
	}

	
}
