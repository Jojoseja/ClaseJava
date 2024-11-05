package bloque3;
/* 4. Crea una función aleatorio() que devuelve un número aleatorio entero.
 * Recibirá por parámetros el número más pequeño aleatorio que va a imprimir
 * y el número aleatorio más grande que va a imprimir.
 * Si el primer número es mayor que el segundo devolverá -1
 * aleatorio(1,100) Devolverá un número aleatorio entre 1 y 100. 
 * aleatorio (5,1) Devolverá -1
 */
public class Ejercicio4 {
	public static void main(String[] args) {
		int a = aleatorio(3,5);
		System.out.println(a);
	}
	static int aleatorio(int num1, int num2) {
		if (num1>num2) {
			return -1;
		} else {
			int r = (int) (Math.random() * (num2+1 - num1)) + num1;
			return r;
		}
	}
	
}
