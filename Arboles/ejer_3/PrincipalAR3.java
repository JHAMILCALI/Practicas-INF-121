package ejer_3;
public class PrincipalAR3{
        
	public static void main(String[] args) {
		ArbolBinarioNormalDato A=new ArbolBinarioNormalDato();
                nodoDato raiz=new nodoDato();
                A.setRaiz(raiz);
                A.crear(A.getRaiz());
                A.preOrden(A.getRaiz());
                System.out.println("\t****INCISO A****");
                incisoA(A);
                System.out.println("\t****INCISO B****");
                incisoB(A);
	}

		private static void incisoA(ArbolBinarioNormalDato a) {
			ColaCircularElementos q = new ColaCircularElementos();
			ColaCircularElementos hijos = new ColaCircularElementos();

			int esCompleto =1;
			int nroNivel =0;
			if (a.getRaiz()!=null) {
				q.adi(a.getRaiz());
			}else {
				esCompleto=0;
			}
			while (!q.esVacia()) {
				int cuantosHijos = q.nroElem();
				int x = (int) Math.pow(2,nroNivel);
				if (cuantosHijos!=x) {
					esCompleto=0;
				}
				nroNivel++;
				while (!q.esVacia()) {
					nodoDato r = q.eli();
					if (r.getIzq()!=null) {
						hijos.adi(r.getIzq());
					}
					if (r.getDer()!=null) {
						hijos.adi(r.getDer());
					}
				}
				q.vaciar(hijos);
			}
			if (esCompleto==1) {
				System.out.println("Es un arbol binario completo");
			}else {
				System.out.println("No es un arbol completo");
			}
		}
		
		private static void incisoB(ArbolBinarioNormalDato a) {
			ColaCircularElementos q = new ColaCircularElementos();
			ColaCircularElementos hijos = new ColaCircularElementos();

			int esCompleto =1;
			int nroNivel =0;
			int mayorNivel=-1;
			if (a.getRaiz()!=null) {
				q.adi(a.getRaiz());
			}else {
				esCompleto=0;
			}
			while (!q.esVacia()) {
				int cuantosHijos = q.nroElem();
				int x = (int) Math.pow(2,nroNivel);
				if (cuantosHijos!=x) {
					esCompleto=0;
				}
				
				if (esCompleto==1 && cuantosHijos==x) {
					if (nroNivel>mayorNivel) {
						mayorNivel=nroNivel;
					}
				}
				nroNivel++;
				while (!q.esVacia()) {
					nodoDato r = q.eli();
					if (r.getIzq()!=null) {
						hijos.adi(r.getIzq());
					}
					if (r.getDer()!=null) {
						hijos.adi(r.getDer());
					}
				}
				q.vaciar(hijos);
			}
			if (nroNivel==-1) {
				System.out.println("no hay ni un nivel en que sea completo");
			}else {
				System.out.println("El nivel mas alto es que el arbol es complo en el nivel "+mayorNivel);
			}
		}
}
