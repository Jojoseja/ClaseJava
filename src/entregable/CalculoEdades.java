package entregable;
import java.util.Scanner;
public class CalculoEdades{
	static boolean mayorEdad(int edad) {
		boolean mayorE;
		if (edad >= 18) {
			mayorE = true;
		} else {
			mayorE = false;
		}
		return mayorE;
	}
	public static void main(String[] args) {
		int mayorEdad = 0;
		int menorEdad = 0;
		boolean negativo = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la edad MINIMA de acceso al instituto: ");
		int edadMinima = sc.nextInt();
		do {
			System.out.println("Escribe la edad o un número negativo para finalizar el programa");
			int input = sc.nextInt();
			if (input < 0) {
				negativo = true;
				System.out.println("El número de alumnos mayores de edad es: " + mayorEdad);
				System.out.println("El número de alumnos menores de edad es: " + menorEdad);
			} else if (input < edadMinima) {
				System.out.println("Introduce una edad adecuada, siendo el mínimo " + edadMinima);
			} 
			else {
				if (mayorEdad(input) == true) {
					mayorEdad += 1;
				} else {
					menorEdad += 1;
				}
			}
		}
		while (negativo == false);
	}
}
