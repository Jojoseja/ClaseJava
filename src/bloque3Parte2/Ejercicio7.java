package bloque3Parte2;
/*
 * Crear una función llamada int contarCifras (int numero) 
 * que reciba un número menor de 5 
 * cifras y devuelva el número de cifras tiene, 
 * en caso de recibir un número menor a 0 o mayor a 9999  devolverá -1.
 */
public class Ejercicio7 {
	static int contarCifras(int numero) {
		if (numero < 0 || numero > 9999) {
			return -1;
		} else {
			String numS;
			numS = Integer.toString(numero);
			return numS.length();
		}
	}
	public static void main(String[] args) {
		int a = contarCifras(6174);
		System.out.println(a);
	}
}
