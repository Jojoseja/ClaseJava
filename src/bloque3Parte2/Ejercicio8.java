package bloque3Parte2;
/*
 * Crear una función llamada int invertirCifras (int numero)
 * que reciba un número 
 * int entre 0 y 9999  y devuelva el 
 * número al revés, en caso de recibir un 
 * número menor a 0 o mayor a 9999 devolverá -1.
 */
public class Ejercicio8 {
	static int invertirCifras(int numero) {
		if (numero < 0 || numero > 9999) {
			return -1;
		} else {
			String numS = Integer.toString(numero);
			String numSI = new StringBuilder(numS).reverse().toString();
			return Integer.parseInt(numSI);
			}
	}
	public static void main(String[] args) {
		int a = invertirCifras(1234);
		System.out.println(a);
	}
}
