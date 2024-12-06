package bloque3Parte5;
import java.util.Scanner;
/*    3. Escriba el procedimiento void menuOpciones () 
 * que mostrará un menú utilizando un bucle do while que leerá un número 
 * después de mostrar las siguientes opciones:

Introduzca una opción:
	1) Saludo
	2) Nombre
	0) Salir

La opción 1 imprime “Hola” y vuelve a mostrar el menú.
La opción 2 imprime “Soy Java” y vuelve a mostrar el menú.
La opción 0 imprime “Adios” y sale del menú
Otra opción mostrará “orden desconocida” y vuelve a mostrar el menú.
*/
public class Ejercicio3 {
	static void menuOpciones() {
		boolean menu = true;
		do {
			System.out.println("Selecciona una opción: \n 1)Saludo \n 2)Nombre \n 0)Salir ");
			Scanner sc = new Scanner(System.in);
			int opcion = sc.nextInt();
			switch (opcion) {
			case 1:
				System.out.println("Hola");
				break;
			case 2:
				System.out.println("Soy Java");
				break;
			case 0:
				menu = false;
				System.out.println("Adiós");
				break;
			default:
				System.out.println("Orden Desconocida");
			}
			
			
		} while (menu); 
	}
	public static void main(String[] args) {
		menuOpciones();
	}
}
