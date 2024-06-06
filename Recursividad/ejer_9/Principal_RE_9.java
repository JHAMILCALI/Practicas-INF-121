	package ejer_9;

import java.util.Scanner;

public class Principal_RE_9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LS_NormalPropietarios pro = new LS_NormalPropietarios();
		pro.adiFinal(new Propietarios("9912","Jhamil","Mamani","Quea"));
		pro.adiFinal(new Propietarios("9913","Jose","Apaza","Zuares"));
		pro.adiFinal(new Propietarios("9923","Maria","Quispe","Morales"));
		
		pro.mostrar();
		
		LS_NormalPropiedad Pr1 = new LS_NormalPropiedad();
		Pr1.adiFinal(new Propiedad(2,"casa","9912"));
		Pr1.adiFinal(new Propiedad(1,"terreno","9913"));
		Pr1.adiFinal(new Propiedad(3,"terreno","9912"));
		
		LS_NormalPropiedad Pr2 = new LS_NormalPropiedad();
		Pr2.adiFinal(new Propiedad(22,"casa","9923"));
		Pr2.adiFinal(new Propiedad(11,"terreno","9923"));
		Pr2.adiFinal(new Propiedad(31,"terreno","9913"));
		
		LS_NormalZona Zo = new  LS_NormalZona();
		Zo.adiFinal(new Zona("IRPAVI","estable",Pr1));
		Zo.adiFinal(new Zona("SOPOCAHI","estable",Pr2));
		

		LS_NormalDistrito Di = new LS_NormalDistrito();
		Di.adiFinal(new Distrito(3,"La Paz",Zo));
		//Di.adiFinal(new Distrito(2,"La Paz",Zo));
		
		Di.mostrar();
//		a. Mostrar los datos de propietarios del distrito Nro N.
		System.out.println("\t*****INCISO A******");
		System.out.println("intntro nro de sitrito a mostrar propietarios => ");
		//int nroDisX=sc.nextInt();
		int nroDisX=3;
		mostrar_datos_Propietario_distrito_X(Di.getP(),nroDisX,pro.getP());
//		b. Determinar la cantidad de propiedades tipo X que existe en la zona Y.
		System.out.println("\t*****INCISO B******");
		System.out.println("Intro nom Zona Y => ");
		//String zonaY=sc.next();
		String zonaY="IRPAVI";
		System.out.println("Intro tipo de propiedades X =>");
		//String tipoX=sc.next();
		String tipoX="casa";
		contarPropiedades(Di.getP(),zonaY,tipoX);

	}

	private static void mostrar_datos_Propietario_distrito_X(NodoDistrito p, int nroDisX, NodoPropietarios pro) {
		if (p!=null) {
			if (p.getQ().getNroDis()==nroDisX) {
				recoridoZona(p.getQ().getZona().getP(),pro);
			}
			mostrar_datos_Propietario_distrito_X(p.getSig(), nroDisX,pro);
		}
	}

	private static void recoridoZona(NodoZona n, NodoPropietarios pro) {
		if (n!=null) {
			System.out.println("\tpropietarios de la zona "+n.getQ().getNombreZona());
			recoridoPropiedades(n.getQ().getPropiedad().getP(),pro);
			recoridoZona(n.getSig(), pro);
		}
	}

	private static void recoridoPropiedades(NodoPropiedad p, NodoPropietarios pro) {
		if (p!=null) {
			Propiedad prop = p.getQ();
			String ci = prop.getCiProp();
			recoridoPropietarios(pro,ci);
			recoridoPropiedades(p.getSig(), pro);
		}
	}


	private static void recoridoPropietarios(NodoPropietarios r, String ci) {
		if (r!=null) {
			if (r.getQ().getCi().equals(ci)) {
				r.getQ().mostrar();
			}
			recoridoPropietarios(r.getSig(), ci);
		}
	}

	private static void contarPropiedades(NodoDistrito p, String zonaY, String tipoX) {
		if (p!=null) {
			recorerZona(p.getQ().getZona().getP(),zonaY,tipoX);
			contarPropiedades(p.getSig(), zonaY, tipoX);
		}
	}

	private static void recorerZona(NodoZona p, String zonaY, String tipoX) {
		if (p!=null) {
			if (p.getQ().getNombreZona().equals(zonaY)) {
				recorerPropiedades(p.getQ().getPropiedad().getP(),tipoX,zonaY,0);
			}
			recorerZona(p.getSig(), zonaY, tipoX);
		}
		
	}

	private static void recorerPropiedades(NodoPropiedad p, String tipoX, String zonaY, int cont) {
		if (p!=null) {
			if (p.getQ().getTipoProp().equals(tipoX)) {
				cont++;
			}
			recorerPropiedades(p.getSig(), tipoX, zonaY, cont);
		}else {
			System.out.println("El tipo de proipiedad "+tipoX+" en la zona "+zonaY+" es ["+cont+"]");
		}
	}


}
