package bloque3;
/*Escribe una función salario() que calcule el dinero que debe cobrar un trabajador a la semana,
 *  pasándole como parámetros, el número de horas semanales que ha 
 y el precio que se le paga por cada hora. Si ha trabajado más de 40 horas,
  el salario de cada hora adicional es 1,5 (un 50% más) veces el de las horas convencionales
*/

public class Ejercicio3 {
	public static void main(String[] args) {
		double test = salario(100,10);
		System.out.println(test);
	}
	static double salario(double horas, double precioHoras) {
		double resultado;
		if (horas > 40) {
			resultado = horas * precioHoras * 1.5;
		} else {
			resultado = horas * precioHoras;
		}
		return resultado;
	}
	
}
