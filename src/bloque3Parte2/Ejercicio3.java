package bloque3Parte2;
/* 
 * Crear una función llamada 
 * String parOimpar  (int numero)que reciba un número por parámetro  
 * y devuelva “Par” si es par e “Impar” en caso contrario.
 */
public class Ejercicio3 {
	static String parOimpar(int numero) {
		if (numero % 2 == 0) {
			return "Par";
		} else {
			return "Impar";
		}
	}
	public static void main(String[] args) {
		String a = parOimpar(6);
		System.out.println(a);
	}
}
