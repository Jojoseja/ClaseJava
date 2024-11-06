package bloque3Parte2;
/* 
 * Crear una función llamada  boolean sonMultiplos (int a, int b) 
 * que reciba dos números por parámetro  y devuelva true 
 * si uno es multiplo del otro o false en caso contrario.
 */
public class Ejercicio4 {
	static boolean sonMultiplos(int a, int b) {
		if (a % b == 0 || b % a == 0) {
			return true;
		} else {
			return false;
		}
	}
	public static void main(String[] args) {
		boolean a = sonMultiplos(4,3);
		System.out.println(a);
		boolean b = sonMultiplos(2,8);
		System.out.println(b);
	}
}
