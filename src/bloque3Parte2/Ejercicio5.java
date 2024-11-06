package bloque3Parte2;
/*
 * Crear una función llamada int mayorNumero (int a, int b) que reciba
 * dos números reales por parámetro y devuelva el número mayor.
 */
public class Ejercicio5 {
	static int mayorNumero(int a, int b) {
		if (a >= b) {
			return a;
		} else {
			return b;
		}
	}
	public static void main(String[] args) {
		int a = mayorNumero(7,3);
		System.out.println(a);
	}
}
