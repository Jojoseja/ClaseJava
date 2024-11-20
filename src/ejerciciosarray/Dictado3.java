package ejerciciosarray;
//Crerar dos Arrays unidimensionales, del mismo tamaño, una es de Strings y la otra se almacena la longitud de los nombres.
import java.util.Scanner;

public class Dictado3 {
	static Scanner sc = new Scanner(System.in);
	
	//crear Array1 con los nombres de la longitud que se desee(len)
	static String[] crearArray(int len) {
		String listaNombres[] = new String[len];
		for (int i = 0; i < listaNombres.length; i++) {
			System.out.println("Introduce un nombre: ");
			listaNombres[i]= sc.next();
		}
		return listaNombres;
	}
	
	//crear Array2 donde las posiciones corresponden con la longitud de los nombres de la array1 en su respectiva posición
	static int[] arrayLongitud(String[] lista) {
		int[] listaNumeros = new int[lista.length];
		for (int i = 0; i < listaNumeros.length; i++) {
			listaNumeros[i] = lista[i].length();
		}
		
		return listaNumeros;
		
	}
	public static void main(String[] args) {
		System.out.println("Selecciona la longitud del Array");
		int input = sc.nextInt();
		String[] lista = crearArray(input);
		int[] listaNum = arrayLongitud(lista);
		for (String i : lista) {
			System.out.println(i);
		}
		for (int j : listaNum) {
			System.out.println(j);
		}
	}
}
