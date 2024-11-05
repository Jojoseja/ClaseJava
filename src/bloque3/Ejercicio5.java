package bloque3;
/* Crea una función areaCirculo() que devuelve el área de un círculo. 
 * Recibirá por parámetro el radio del círculo.
 * Si el radio es menor que cero, devolverá -1
 * 
 */
import java.lang.Math;
public class Ejercicio5 {
	public static void main(String[] args) {
		double a = areaCirculo(1);
		System.out.println(a);
	}
	static double areaCirculo(double radio) {
		if (radio < 0) {
			return -1;
		} else {
			return radio * radio * Math.PI;
		}
	}
}
