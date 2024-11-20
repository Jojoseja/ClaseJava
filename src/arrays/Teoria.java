package arrays;
//IMPORTANTE -> aunque se puedan usar, hay que importar los arrays para los metodos
import java.util.Arrays;
import java.util.Scanner;

public class Teoria {
	static Scanner sc = new Scanner(System.in);
	static double media(){
		System.out.println("Escribe un número: ");
		int num = 0;
		int counter = 1;
		double[] listaNumeros = {};
		double total=0;
		do {		
			num = sc.nextInt();
			if (num >= 0) {
				double[] listaNumeros2 = Arrays.copyOf(listaNumeros, counter);
				listaNumeros2[counter-1] = num;
				listaNumeros = listaNumeros2;
				double sum=0;
				for(double i : listaNumeros) {
					sum +=i;
				}
				counter++;
				System.out.println("Suma de los Dígitos: " + sum);
				System.out.println("Media por ahora: " + sum/listaNumeros.length);
				System.out.println("Escribe otro numero o un número negativo para detener el programa: ");
				total = sum;
			}
			
		} while(num >= 0);
		return total/listaNumeros.length;
	}
	public static void main(String[] args) {
		/*
		//Para declarar un array de un tipo se utiliza [] junto al tipo de variable o la variable y {} para englobar los datos
		int[] iArray = {1,2,3,4,5};
		int numbers[]  = {6,7,8,9,10};
		String[] stringArray = {"Hello", "Goodbye"};
		System.out.println(iArray);
		//Para imprimir hay que seleccionar la posición dentro de la array, empezando por 0 para la primera posición
		//Con la linea de abajo imprimimos la posicion [2] del array, consiguiendo un {3}
		System.out.println(iArray[2]);
		//Para recorrer los valores de un array
		for (int i: iArray) {
			System.out.println(i);
		}
		// o en su defecto:
		for (int i = 0; i < iArray.length; i++) {
			System.out.print(iArray[i]);
		}
		*/
		System.out.println(media());
		System.out.println("Fin!");
	}
}
