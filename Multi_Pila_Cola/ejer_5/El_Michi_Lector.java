package ejer_5;

import java.util.Iterator;
import java.util.Scanner;

public class El_Michi_Lector {

	public static void main(String[] args) {
		Mp_PilaLibro A = new Mp_PilaLibro();
		Libro l1 = new Libro("El principito", "Jose", 1234, 5);
        Libro l2 = new Libro("Cien años de soledad", "Gabriel Garcia Marquez", 5678, 10);
        Libro l3 = new Libro("La sombra del viento", "Carlos Ruiz Zafón", 91011, 8);
        Libro l4 = new Libro("Harry Potter y la piedra filosofal", "J.K. Rowling", 121314, 12);
        Libro l5 = new Libro("1984", "George Orwell", 151617, 0);
        Libro l6 = new Libro("Orgullo y prejuicio", "Jane Austen", 181920, 7);
        Libro l7 = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", 212223, 20);
        Libro l8 = new Libro("Crimen y castigo", "Fyodor Dostoevsky", 242526, 9);
        Libro l9 = new Libro("Matar un ruiseñor", "Harper Lee", 272829, 0);
        Libro l10 = new Libro("El señor de los anillos", "Jose", 303132, 18);
        Libro l11 = new Libro("Cien años de soledad", "Gabriel Garcia Marquez", 333435, 6);
        Libro l12 = new Libro("El alquimista", "Paulo Coelho", 363738, 14);
        
        A.adicionar(0, l1);
        A.adicionar(0, l2);
        A.adicionar(0, l3);
        A.adicionar(1, l4);
        A.adicionar(1, l5);
        A.adicionar(1, l6);
        A.adicionar(1, l7);
        A.adicionar(2, l8);
        A.adicionar(2, l9);
        A.adicionar(3, l10);
        A.adicionar(3, l11);
        A.adicionar(3, l12);
        A.setNp(4);
        A.mostrar();
        Scanner sc = new Scanner(System.in);
//        a. Eliminar de la MultiPila todos los libros con stock igual a 0.
        System.out.println("\n\t******INCISO A******");
        eliminarStockIgualCero(A,0);
        A.mostrar();
//        b. Mostrar el contenido de todas las pilas en las que existan al menos un libro del
//        autor X.
        System.out.println("\n\t******INCISO B******");
        System.out.println("MOSTRAR LIBRO DEL AUTOR X: ");
        //String autor=sc.next();
        String autor="Jose";
        mostrarAutorX(A,autor);
//        c. Mostrar el número de la pila en la que esté el libro de título X del autor Y
//        (asumiendo que solo puede existir el libro solicitado en una sola pila).
        System.out.println("\n\t******INCISO C******");
        System.out.println("MOSTRAR EL LIBRO DE TITULO X: ");
        //String tituloX = sc.next();
        String tituloX = "El señor de los anillos";
        numero_de_Pila_TituloX(A,tituloX,autor);
	}

	private static void numero_de_Pila_TituloX(Mp_PilaLibro a, String tituloX, String autor) {
		int n= a.getNp();
		Libro e;
		for (int i = 0; i < n ; i++) {
			PilaLibro aux = new PilaLibro();
			while (!a.esvacia(i)) {
				e = a.eliminar(i);
				if (e.getTitulo().equals(tituloX)) {
					if (e.getAutor().equals(autor)) {
						System.out.println("El libro "+e.getTitulo()+" del autor "+e.getAutor()+ 
								" está en la pila [" + i + "]");
					}
				}
				aux.adi(e);
			}
			a.vaciar(i, aux);
		}
	}
	private static void mostrarAutorX(Mp_PilaLibro a, String autor) {
	    int n = a.getNp();
	    Libro e;
	    for (int i = 0; i < n; i++) {
	        PilaLibro aux = new PilaLibro();
	        boolean sw = false;
	        while (!a.esvacia(i)) {
	            e = a.eliminar(i);
	            if (e.getAutor().equals(autor)) {
	                System.out.println(autor + " está en la pila [" + i + "]");
	                sw = true;
	            }
	            aux.adi(e);
	        }
	        if (sw) {
	            System.out.println("\t*****Datos de la pila [" + i + "]*****");
	            aux.mostrar();
	        }
	        a.vaciar(i, aux);
	    }
	}


	private static void eliminarStockIgualCero(Mp_PilaLibro a, int stockCero) {
		int n = a.getNp();
		Libro e = new Libro();
		for (int i = 0; i < n; i++) {
			PilaLibro aux = new PilaLibro();
			while (!a.esvacia(i)) {
				e = a.eliminar(i);
				if (e.getStock()==stockCero) {
					System.out.println("El libro '"+e.getTitulo()+"' sera eliminado por Stock: "+stockCero);
				}
				else {
					aux.adi(e);
				}
			}
			a.vaciar(i, aux);
		}
	}

}
