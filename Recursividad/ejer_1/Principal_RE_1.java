package ejer_1;
import java.math.BigInteger;
import java.util.Scanner;
public class Principal_RE_1 {
	public static void main(String[] args) {
//		Dado un entero N, hallar el Factorial de N de forma recursiva. El factorial de un número
//		entero se define como:
//		F(n) = n! = 1 * 2 * ... * (n - 1) * n
//		F(n) = n! = n*F(n - 1)
		Scanner sc = new Scanner(System.in);
		System.out.println("\tENCONTRAR SU FACRTORIAL");
		System.out.println("Introduce un numero => ");
		int numX=sc.nextInt();		
		System.out.println("El factorila de "+numX+" es ["+Factorial(BigInteger.valueOf(numX))+"]");
	}

	 private static BigInteger Factorial(BigInteger numX) {
	        if (numX.equals(BigInteger.ZERO)) {
	            return BigInteger.ONE;
	        } else {
	            return numX.multiply(Factorial(numX.subtract(BigInteger.ONE)));
	        }
	    }
}
