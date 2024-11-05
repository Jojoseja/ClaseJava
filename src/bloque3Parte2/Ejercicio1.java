package bloque3Parte2;
/* 
* Crear una función llamada boolean sonIguales (int a, int b) 
* que reciba dos números por parámetro y devuelva
* true si son iguales o false en caso contrario.
*/ 
public class Ejercicio1 {
	static boolean sonIguales(int a, int b) {
		if (a == b) {
			return true;
		} else {
			return false;
		}
	}
	public static void main(String[] args) {
		boolean a = sonIguales(7,8);
		if (a == true) {
			System.out.println("Son iguales");
		} else {
			System.out.println("No son iguales");
		}
	}
}
