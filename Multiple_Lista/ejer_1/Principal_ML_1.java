package ejer_1;

public class Principal_ML_1 {
	public static void main(String[] args) {
		LS_NormalLetra A1 = new LS_NormalLetra();
		A1.adiFinal('m');
		A1.adiFinal('a');
		A1.adiFinal('y');
		A1.adiFinal('o');
		
		LS_NormalLetra A2 = new LS_NormalLetra();
		A2.adiFinal('p');
		A2.adiFinal('r');
		A2.adiFinal('o');
		A2.adiFinal('g');
		A2.adiFinal('r');
		A2.adiFinal('a');
		A2.adiFinal('m');
		A2.adiFinal('i');
		A2.adiFinal('n');
		
		LS_NormalLetra A3 = new LS_NormalLetra();
		A3.adiFinal('j');
		A3.adiFinal('a');
		A3.adiFinal('v');
		A3.adiFinal('a');
		
		LS_NormalLetra A4 = new LS_NormalLetra();
		A4.adiFinal('j');
		A4.adiFinal('h');
		A4.adiFinal('a');
		A4.adiFinal('m');
		A4.adiFinal('i');
		A4.adiFinal('l');
		LS_NormalPalabra B = new LS_NormalPalabra();
		B.adiFinal(A1);
		B.adiFinal(A2);
		B.adiFinal(A3);
		B.adiFinal(A4);
		B.mostrar();
		System.out.println("\n\tOrdenar Alfabeticamente la lista");
		ordenar_Alfabeticamente_Letras(B);
		
		B.mostrar();
	}

	private static void ordenar_Alfabeticamente_Letras(LS_NormalPalabra b) {
		NodoPalabra R = b.getP();
		while (R!=null) {
			LS_NormalLetra le = R.getLetra();
			//NodoLetra S = le.getP();
			LS_NormalLetra aux1 = new LS_NormalLetra();
			LS_NormalLetra aux2 = new LS_NormalLetra();
			while (!le.esVacia()) {
				char mayor = mayorChar(le);
				while (!le.esVacia()) {
					NodoLetra x = le.eliPrincipio();
					if (x.getLetra()==mayor) {
						aux1.adiPrincipio(x.getLetra());
					}else {
						aux2.adiFinal(x.getLetra());
					}
				}
				le.setP(aux2.getP());
				aux2.setP(null);
			}
			le.setP(aux1.getP());
			R=R.getSig();
		}
	}

	private static char mayorChar(LS_NormalLetra a) {
		char may = 'a';
		NodoLetra R = a.getP();
		while (R!=null) {
			if (R.getLetra()>may) {
				may=R.getLetra();
			}
			R=R.getSig();
		}
		return may;
	}
}
