package bloque3Parte2;
/*
 * Crear una función llamada boolean esPositivo (int numero) 
 * que reciba un número por parámetro  y 
 * devuelva true si es positivo o false en caso contr
 */
public class Ejercicio2 {
	static boolean esPositivo(int numero) {
		if (numero >= 0) {
			return true;
		} else {
			return false;
		}
	}
	public static void main(String[] args) {
		boolean a = esPositivo(5);
		boolean b = esPositivo(-3);
		System.out.println(a);
		System.out.println(b);
	}
}
