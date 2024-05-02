package ejer_7;

public class Principal {
	public static void main(String[] args) {
		ColaCircularCaracter A = new ColaCircularCaracter();
		A.adi('j');
		A.adi('a');
		A.adi('b');
		A.adi('e');
		A.adi('i');
		A.adi('k');
		A.adi('l');
		A.adi('p');
		A.adi('o');
		A.adi('q');
		A.adi('u');
		A.adi('u');
		A.adi('j');
		System.out.println("\t****COLA CON CARACTERES****");
		A.mostrar();
//		a. Ver si existen en la cola todas las vocales.
		System.out.println("\n\t*****INCIOS A*****");
		existetodasVocales(A);
//		b. Invertir el orden de la cola sin el uso de 
//		estructuras auxiliares.
		System.out.println("\n\t*****INCIOS B*****");
		System.out.println("\t----COLA SIN INVERTIR----");
		A.mostrar();
		InvertirLaCola(A);
		System.out.println("\n\t----COLA INVERTIDA----");
		A.mostrar();
		

	}

	private static void InvertirLaCola(ColaCircularCaracter a) {
	    if (!a.esVacia()) {
	        char primero = a.eli();
	        InvertirLaCola(a);
	        a.adi(primero);
	    }
	}
	private static void existetodasVocales(ColaCircularCaracter c) {
		ColaCircularCaracter aux = new ColaCircularCaracter();
		int cont=0;
		boolean a=true,e=true,i=true,o=true,u=true;
		while (!c.esVacia()) {
			char car = c.eli();
			if (car=='a' && a==true ) {
				cont++;
				a=false;
			}
			if (car=='e' && e==true ) {
				cont++;
				e=false;
			}
			if (car=='i' && i==true ) {
				cont++;
				i=false;
			}
			if (car=='o' && o==true ) {
				cont++;
				o=false;
			}
			if (car=='u' && u==true ) {
				cont++;
				u=false;
			}
			aux.adi(car);
		}
		c.vaciar(aux);
		if (cont==5) {
			System.out.println("La Cola contine todas las vocales");
		}else {
			System.out.println("La cola no contine todas las vocales ");
		}
		
	}
}
