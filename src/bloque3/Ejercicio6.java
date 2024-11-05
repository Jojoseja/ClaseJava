package bloque3;
/* Crea una función mediaNotas() que devuelve la media de las notas con decimales. 
 * Recibirá por parámetro 3 notas.
 */
public class Ejercicio6 {
	public static void main(String[] args) {
		double a = mediaNotas(10,8,9.34);
		System.out.printf("La nota media es de %1$.2f", a);
	}
	static double mediaNotas(double num1, double num2, double num3) {
		return (num1 + num2 + num3) / 3;
	}
}
