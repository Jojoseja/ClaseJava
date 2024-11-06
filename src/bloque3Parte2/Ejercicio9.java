package bloque3Parte2;
/*
 * Crear una función llamada boolean esCapicua (int numero) que reciba un número int entre 0 y 9999  
 * y devuelva true si es capicua y false en caso contrario, 
 * en caso de recibir un número menor a 0 o mayor a 9999 devolverá también false.
 */
public class Ejercicio9 {
	static boolean esCapicua(int numero) {
		boolean capi;
		if (numero < 0 || numero > 9999) {
			capi = false;
		} else {
			String numS = Integer.toString(numero);
			if (numS.charAt(0)== numS.charAt(3) && numS.charAt(1)==numS.charAt(2)) {
				capi = true;
			} else {
				capi = false;
			}
		}
		return capi;
	}
	public static void main(String[] args) {
		boolean a = esCapicua(1919);
		boolean b = esCapicua(1991);
		System.out.println(a);
		System.out.println(b);
	}
}
