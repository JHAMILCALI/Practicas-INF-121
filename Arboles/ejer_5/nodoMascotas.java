/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer_5;

/**
 *
 * @author print
 */
public class nodoMascotas {
    private nodoMascotas izq,der;

    public void setIzq(nodoMascotas izq) {
        this.izq = izq;
    }

    public void setDer(nodoMascotas der) {
        this.der = der;
    }

    public void setA(Mascotas A) {
        this.A = A;
    }
    private Mascotas A;

    public nodoMascotas getIzq() {
        return izq;
    }

    public nodoMascotas getDer() {
        return der;
    }

    public Mascotas getA() {
        return A;
    }
    
    public nodoMascotas(){
       izq=der=null;
    }
}
