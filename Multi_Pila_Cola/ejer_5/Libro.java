package ejer_5;

import java.util.Scanner;

public class Libro {
	private
	String titulo,autor;
	int idLibro, stock;
	public
	Libro() {
	}
	public Libro(String titulo, String autor, int idLibro, int stock) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.idLibro = idLibro;
		this.stock = stock;
	}
	void leer() {
		Scanner sc = new Scanner(System.in);
		System.out.println("TITULO:");
		titulo=sc.next();
		System.out.println("AUTOR:");
		autor=sc.next();
		System.out.println("ID LIBRO: ");
		idLibro=sc.nextInt();
		System.out.println("STOCK: ");
		stock=sc.nextInt();
	}
	void mostrar() {
		System.out.println(toString());
	}
	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", idLibro=" + idLibro + ", stock=" + stock + "]";
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getIdLibro() {
		return idLibro;
	}
	public void setIdLibro(int idLibro) {
		this.idLibro = idLibro;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	
}
