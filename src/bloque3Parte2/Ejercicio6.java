package bloque3Parte2;
import java.util.Arrays;
import java.util.Comparator;
/*
 * Crear un procedimiento llamado String ordenarNumeros (int a, int b, int c)
 * que reciba tres números por parámetro y devuelva un 
 * String con los números ordenados de mayor a menor 
 * Ej ordenarNumeros(5,23,7) devolvería “23 7 5”.
 */
public class Ejercicio6 {
	static String ordenarNumeros(int a, int b, int c) {
		Integer[] numOrder = {a, b, c};
		String result = "";
		Arrays.sort(numOrder, Comparator.reverseOrder());
		for (int number : numOrder) {
			result += Integer.toString(number);
			result += " ";
		}
		result = result.trim();
		return result;
	}
	public static void main(String[] args) {
		String a = ordenarNumeros(3,9,6);
		System.out.print(a);
	}
}
 