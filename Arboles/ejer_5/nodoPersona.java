/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer_5;

/**
 *
 * @author print
 */
public class nodoPersona {
    private nodoPersona izq,der;

    public void setIzq(nodoPersona izq) {
        this.izq = izq;
    }

    public void setDer(nodoPersona der) {
        this.der = der;
    }

    public void setA(Persona A) {
        this.A = A;
    }
    private Persona A;

    public nodoPersona getIzq() {
        return izq;
    }

    public nodoPersona getDer() {
        return der;
    }

    public Persona getA() {
        return A;
    }
    
    public nodoPersona(){
       izq=der=null;
    }
}
