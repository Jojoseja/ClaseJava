package ejerciciosarray;

import java.util.Scanner;

public class AmpliacionOvejas {
	static boolean[] arrayOvejas = {true,  true,  true,  false, true,  true,  true,  true , true,  false, true,  false, true,  false, false, true , true,  true,  true,  true , false, false, true,  true};
	static void menuOpciones() {
		boolean menu = true;
		do {
			System.out.println("Selecciona una opción: \n 1)Saludo \n 2)Nombre \n 3)Contar Ovejas \n 0)Salir ");
			Scanner sc = new Scanner(System.in);
			int opcion = sc.nextInt();
			switch (opcion) {
			case 1:
				System.out.println("Hola");
				break;
			case 2:
				System.out.println("Soy Java");
				break;
			case 3:
				System.out.println("El número de ovejas es: " + contarOvejar(arrayOvejas));
				break;
			case 0:
				menu = false;
				System.out.println("Adiós");
				break;
			default:
				System.out.println("Orden Desconocida");
			}
			
			
		} while (menu == true); 
	}
	static int contarOvejar (boolean[] lista) {
		int contador = 0;
		for (boolean i : lista) {
			if (i) {
				contador += 1;
			}
		}
		return contador;
	}
	public static void main(String[] args) {
		menuOpciones();
	}
}
