package ejerciciosarray;
//pedir tamaño de un Array y luego rellenarlo con numeros, no se pueden repetir, mas tarde dar la array por terminal
import java.util.Scanner;

public class Dictado2 {
	
	//Variable Scanner para Introducir inputs
	static Scanner sc = new Scanner(System.in);
	
	//Método para crear un Array
	static int[] crearArray(int len) {
		int[] array = new int[len];
		boolean valid = true;
		
		//Recorrer el Array posición por posición [i]
		for (int i = 0; i < array.length; i++ ) {
			
			//Introducir un número(input) y comprobar que no esté en la Array			
			do {
				System.out.println("Escribe un número: ");
				int input = sc.nextInt();
				
				//En caso de estar en la array, introducir otro número(input)
				if (checkDupli(array,input) ) {
					System.out.println("Número repetido! ");
					valid = false;
				} 
				// En caso de NO estar en el Array, introducir el número(input) en la posición[i]
				else {
					array[i] = input;
					valid = true;
				}
			} while (!valid);
			
		}
		//Devolver el Array
		return array;
	}
	
	//Metodo para comprobar si está en el Array
	static boolean checkDupli(int[] lista,int num) {
		boolean duplicate = false;
		for (int i : lista) {
			
			if (i == num) {
				duplicate = true;
			}
			
		}
		
		return duplicate;
	}
	
	public static void main(String[] args) {
		
		//Pedir Longitud del Array
		System.out.println("Escribe la longitud del array: ");
		int num = sc.nextInt();
		int[] test = crearArray(num);
		
		//Dar el Array por la Terminal
		for (int i : test) {
			System.out.println(i);
		}
		
	}

}
