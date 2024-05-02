package ejer_5;

import java.util.Scanner;

public class Principal1 {

	public static void main(String[] args) {
//		Sea una cola simple de Mascotas, y una cola simple 
//		de Atenciones de una clínicaveterinaria, Mascota <idMascota, 
//		nombre, sexo, tipo> , Atención <fecha, idMascota>.
//		Se pide:
		ColaSimpleAtencion A = new ColaSimpleAtencion();
		Atencion a1 = new Atencion("25-feb",1234);
		Atencion a2 = new Atencion("2-marzo",2345);
		Atencion a3 = new Atencion("8-feb",3456);
		Atencion a4 = new Atencion("25-feb",6789);
		Atencion a5 = new Atencion("26-feb",5678);
		A.adi(a1);
		A.adi(a2);
		A.adi(a3);
		A.adi(a4);
		A.adi(a5);
		ColaSimpleMascota B = new ColaSimpleMascota();
		Mascota m1 = new Mascota(1234,"milaneso","hembra","gato");
		Mascota m2 = new Mascota(6789,"tavo","macho","perro");
		Mascota m3 = new Mascota(2345,"ana","hembra","perro");
		Mascota m4 = new Mascota(3456,"tavo","macho","gato");
		Mascota m5 = new Mascota(5678,"luna","hembra","gato");
		B.adi(m1);
		B.adi(m2);
		B.adi(m3);
		B.adi(m4);
		B.adi(m5);
		System.out.println("\t*****COLA SIMPLE DE ATENCION*****");
		A.mostrar();
		System.out.println("\n\t*****COLA SIMPLE DE MASCOTS*****");
		B.mostrar();
//		a. Mostrar el nombre de las mascotas que fueron atendidas 
//		en la clínica veterinaria
//		en la fecha X
		System.out.println("\n\t****INCISO A****");
		Scanner sc = new Scanner(System.in);
		System.out.println("intro la fecha X: ");
		//String fecha =sc.next();
		String fecha = "25-feb";
		mascotasAtendidasfechaX(A,B,fecha);
//		b. Eliminar la mascota con el idMascota X si y sólo si su 
//		nombre es “Tavo”.
		System.out.println("\n\t****INCISO B****");
		System.out.println("intro ID-Mascota X: ");
		//int id=sc.nextInt();
		int id=6789;
		eliminarMascotaX(B,id,"tavo");
		B.mostrar();
//		c. Contar mascotas “hembra” que fueron atendidas en la 
//		clínica veterinaria.
		System.out.println("\n\t****INCISO C****");
		String sexo="hembra";
		int cant = contarMascotasHembras(B,sexo);
		System.out.println("La cantidad de macotsa "+sexo+" que fueron atendidas son: "+cant);
		
	}

	private static int contarMascotasHembras(ColaSimpleMascota b, String sexo) {
		int cont=0;
		ColaSimpleMascota aux = new ColaSimpleMascota();
		while (!b.esVacia()) {
			Mascota m = b.eli();
			if (m.getSexo().equals(sexo)) {
				cont++;
			}
			aux.adi(m);
		}
		b.vaciar(aux);
		return cont;
	}

	private static void eliminarMascotaX(ColaSimpleMascota b, int id, String nombre) {
		ColaSimpleMascota aux = new ColaSimpleMascota();
		while (!b.esVacia()) {
			Mascota m = b.eli();
			if (m.getIdMascota()==id) {
				if (m.getNombre().equals(nombre)) {
					System.out.println("Se eliminara la Macota: "+m.getNombre()+" con la ID: "+m.getIdMascota());
				}
				
			}
			else {
				aux.adi(m);
			}
		}
		b.vaciar(aux);
		
	}

	private static void mascotasAtendidasfechaX(ColaSimpleAtencion a, ColaSimpleMascota b, String fecha) {
		ColaSimpleAtencion aux = new ColaSimpleAtencion();
		while (!a.esVacia()) {
			Atencion at = a.eli();
			if (at.getFecha().equals(fecha)) {
				bucarId(at.getIdMascota(),b);
			}
			aux.adi(at);
		}
		a.vaciar(aux);
		
	}

	private static void bucarId(int idMascota, ColaSimpleMascota b) {
		ColaSimpleMascota aux = new ColaSimpleMascota();
		while (!b.esVacia()) {
			Mascota a = b.eli();
			if (a.getIdMascota()== idMascota) {
				a.mostrar();
			}
			aux.adi(a);
		}
		b.vaciar(aux);
	}

}
