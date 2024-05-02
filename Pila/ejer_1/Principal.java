package ejer_1;

import java.util.Iterator;

public class Principal {

    public static void main(String[] args) {
        PilaCadena A = new PilaCadena();
        A.adi("2-8/9");
        A.adi("2+3*4");
        A.mostrar();
        System.out.println("****NOTACION POLACA INVERSA*******");
        notacion_polaca_inversa(A);
        A.mostrar();
    }

    private static void notacion_polaca_inversa(PilaCadena a) {
    	PilaCadena aux = new PilaCadena();
    	PilaCadena aux1 = new PilaCadena();
    	while (!a.esVacia()) {
			String elem = a.eli();
			elem=cambiarposicion(elem);
			aux.adi(elem);
		}
    	a.vaciar(aux);
    }
	private static String cambiarposicion(String elem) {
		char [] car = elem.toCharArray();
		String numeros="",simbolos="",nudat="";
		for(char c:car) {
			if (c=='/'||c=='*'||c=='+'||c=='-') {
				String myString = Character.toString(c);
				simbolos+=myString;
			}else {
				String myString = Character.toString(c);
				numeros+=myString;
			}
		}
		nudat=numeros+simbolos;
		return nudat;
	}
}