package ejer_9;

import java.util.Scanner;

public class Principal4 {

	 public static void main(String[] args) {
	        Scanner sc=new Scanner(System.in);
	        ColaCircularElementos A= new ColaCircularElementos();
	        int a,b,iesimo,j,n,m,k;
	        System.out.println("Ingrese un numero de elementos");
//	        a=sc.nextInt();
//	        A.llenar(a);
	        A.adi("1");
	        A.adi("2");
	        A.adi("3");
	        A.adi("4");
	        A.adi("5");
	        A.adi("6");
	        System.out.println("Elementos Ingresados");
	        A.mostrar();
	        System.out.println("\nIngrese los N elementos que quiere ingresar:");
	        n=sc.nextInt();
	        System.out.println("Antes de que i-esimo quiere ingresarlos:");
	        iesimo=sc.nextInt();
	        
	        inntroducir_datos_iesima(A,n,iesimo);
	        A.mostrar();
	        
	    }

	 private static void inntroducir_datos_iesima(ColaCircularElementos a, int n, int iesimo) {
		    Scanner sc = new Scanner(System.in);
		    int nro = a.nroElem();
		    for (int i = 0; i < nro; i++) {
		        String elem = a.eli();
		        String e;
		        if (i == iesimo) {
		            for (int j = 0; j < n; j++) {
		                System.out.println("Ingrese para adicionar un elemento");
		                e = sc.nextLine();
		                a.adi(e);
		            }
		        }else {
		        	a.adi(elem);
		        }
		    }
		}


}
