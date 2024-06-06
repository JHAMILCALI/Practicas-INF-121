package ejer_5;

import java.util.Scanner;
public class PrincipalAR3{
    
	public static void main(String[] args) {
		ArbolBinarioNormalMascotas A=new ArbolBinarioNormalMascotas();
                nodoMascotas raiz=new nodoMascotas();
                A.setRaiz(raiz);
                A.crear(A.getRaiz());
                A.preOrden(A.getRaiz());
                //a. Mostrar las mascotas tipo X del subárbol derecho.
                System.out.println("\tINCISO A");
                Scanner sc = new Scanner(System.in);
                String tipoX=sc.next();
                incisoA(A,tipoX);
                //b. Verificar si existen mascotas con una edad mayor a 12 años.
                System.out.println("\tINCISO B");
               // System.out.println("La edad "+incisoB(A));
                if (incisoB(A,12)) {
					System.out.println("Si existe edad mayor a 12");
				}else {
					System.out.println("No existe edades mayores a 12!!");
				}
	}

	private static void incisoA(ArbolBinarioNormalMascotas a, String tipoX) {
		ColaCircularMascotas q = new ColaCircularMascotas();
		q.adi(a.getRaiz().getIzq());
		while (!q.esVacia()) {
			nodoMascotas R = q.eli();
			if (R.getA().getTipo().equals(tipoX)) {
				R.getA().mostrar();
				System.out.println("------------------");
			}
			if (R.getIzq()!=null) {
				q.adi(R.getIzq());
			}
			if (R.getDer()!=null) {
				q.adi(R.getDer());
			}
		}
		
	}

	private static boolean incisoB(ArbolBinarioNormalMascotas a, int edad) {
		ColaCircularMascotas q = new ColaCircularMascotas();
		boolean sw=false;
		q.adi(a.getRaiz());
		while (!q.esVacia()) {
			nodoMascotas R = q.eli();
			if (R.getA().getEdad()>edad) {
				sw=true;
			}
			if (R.getIzq()!=null) {
				q.adi(R.getIzq());
			}
			if (R.getDer()!=null) {
				q.adi(R.getDer());
			}
		}
		if (sw) {
			return true;
		}else {
			return false;
		}
	}

}
