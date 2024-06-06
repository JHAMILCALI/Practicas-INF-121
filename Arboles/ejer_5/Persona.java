/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer_5;

import java.util.Scanner;

/**
 *
 * @author print
 */
public class Persona {
    private String nombre;
    private int edad;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public Persona() {
       nombre="";
       edad=0;
    }
    
    public void leer(){
    
        Scanner sc=new Scanner(System.in);
        System.out.println("nombre?");
        nombre=sc.nextLine();
        System.out.println("edad?");
        edad=sc.nextInt();
    }
    
    public void mostrar(){
        System.out.println("Persona["+nombre+", "+edad+"]");
    }
    
}
