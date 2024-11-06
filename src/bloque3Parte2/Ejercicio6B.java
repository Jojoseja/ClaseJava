package bloque3Parte2;
import java.util.Arrays;
import java.util.Comparator;
/*
 * Crear un procedimiento llamado String ordenarNumeros (int a, int b, int c)
 * que reciba tres números por parámetro y devuelva un 
 * String con los números ordenados de mayor a menor 
 * Ej ordenarNumeros(5,23,7) devolvería “23 7 5”.
 */
public class Ejercicio6B {
	static String ordenarNumeros(Integer[] numOrder) {
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
		Integer[] a = {1,3,5,7};
		String b = ordenarNumeros(a);
		System.out.print(b);
	}
}
 