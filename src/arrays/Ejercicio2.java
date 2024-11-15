package arrays;
import java.util.Scanner;

public class Ejercicio2 {
	static int[] lista = new int[10];
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int counter = 0;
		int auxcounter = 0;
		int sum = 0;
		for (int i : lista) {
			System.out.println("Escribe un número");
			lista[counter] = sc.nextInt();
			counter += 1;
		}
		for (int posi = 0; posi<lista.length;posi += 2) {
				sum += lista[posi];
				auxcounter += 1;
			}
		System.out.println(sum/auxcounter);
	}
}
