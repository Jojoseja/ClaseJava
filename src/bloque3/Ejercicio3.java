package bloque3;
import java.util.Scanner;
/*
 * Escribe una función salario() que calcule el dinero que debe cobrar un trabajador a la semana,
 * pasándole como parámetros, el número de horas semanales que ha 
 * y el precio que se le paga por cada hora. Si ha trabajado más de 40 horas,
 * el salario de cada hora adicional es 1,5 (un 50% más) veces el de las horas convencionales
 */

public class Ejercicio3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe el número de horas: ");
		double num1 = sc.nextDouble();
		System.out.println("Escribe el precio por hora: ");
		double num2 = sc.nextDouble();
		double test = salario(num1,num2);
		System.out.println("Se va a pagar un total de: " +  test);
	}
	static double salario(double horas, double precioHoras) {
		if (horas > 40) {
			return 40 * precioHoras + 1.5 * precioHoras * (horas-40);
		} else {
			return horas * precioHoras;
		}
	}
	
}
