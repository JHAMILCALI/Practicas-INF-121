package ejer_3;

import java.util.Scanner;

public class Principal_RE_3 {
	public static void main(String[] args) {
//		La sucesión de Fibonacci viene definida por la siguiente recurrencia:
//		Fn+2=Fn+Fn+1. Con valores iniciales F0=0 y F1=1 .
		System.out.println("\tSUCESION DE FIBONACCI");
//		a. Calcular el enésimo término de la sucesión recursivamente.
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero=> ");
		int numX=sc.nextInt();
		System.out.println();
		System.out.println("\n\t****INCISO A*****");
		System.out.println("calculando el enesimo termino de "+numX+" es ["+fibonacci(numX)+"]");
//		b. Realizar la suma de los primeros N números Fibonacci recursivamente.
		System.out.println("\n\t****INCISO B*****");
		System.out.println("La suma de los primeros numeros Fibonacci es ["+fibonacci_suma(numX)+"]");
	}

	private static int fibonacci_suma(int numX) {
		if (numX<=0) {
			return 0;
		}else {
			return(fibonacci(numX-1)+fibonacci_suma(numX-1));
		}
	}

	private static int fibonacci(int numX) {
		if (numX==0) {
			return 0;
		}else if(numX==1){ 
			return 1;
		}else {
			return(fibonacci(numX-1)+fibonacci(numX-2));
		}
		
	}
}
