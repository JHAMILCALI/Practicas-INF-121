/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer_3;

/**
 *
 * @author print
 */
public class nodoDato {
    private nodoDato izq,der;

    public void setIzq(nodoDato izq) {
        this.izq = izq;
    }

    public void setDer(nodoDato der) {
        this.der = der;
    }

    public void setA(int A) {
        this.A = A;
    }
    private int A;

    public nodoDato getIzq() {
        return izq;
    }

    public nodoDato getDer() {
        return der;
    }

    public int getA() {
        return A;
    }
    
    public nodoDato(){
       izq=der=null;
    }
}
